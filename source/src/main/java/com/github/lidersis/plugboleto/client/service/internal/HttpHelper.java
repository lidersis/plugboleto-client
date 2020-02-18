package com.github.lidersis.plugboleto.client.service.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.lidersis.plugboleto.client.Log;
import com.github.lidersis.plugboleto.client.model.ErrorRepresentation;
import com.github.lidersis.plugboleto.client.model.ResponseRepresentation;
import com.github.lidersis.plugboleto.client.service.PlugBoletoException;
import com.github.lidersis.plugboleto.client.utils.JsonUtils;
import com.google.common.io.CharStreams;

public abstract class HttpHelper {

  private HttpHelper() {
    //
  }

  private static void handle400(final HttpResponse httpResponse) throws IOException {
    HttpEntity httpEntity = httpResponse.getEntity();
    if (httpEntity != null) {
      try (InputStream inputStream = httpEntity.getContent()) {
        String json = CharStreams.toString(new InputStreamReader(inputStream));
        
        // Log.getLog().error(json);
        
        ResponseRepresentation responseWrapper = JsonUtils.toObject(json, ResponseRepresentation.class);
        List<ErrorRepresentation> errorResponse = JsonUtils.toObject(responseWrapper.getDados(), new TypeReference<List<ErrorRepresentation>>() {
          //
        });
        throw new PlugBoletoException(errorResponse);
      }
    }
  }

  private static <T> T exchange(final HttpClient httpClient, final HttpUriRequest httpRequest, final Class<T> clazz, final TypeReference<T> type) throws IOException {
    HttpResponse httpResponse = httpClient.execute(httpRequest);
    StatusLine statusLine = httpResponse.getStatusLine();
    if (statusLine.getStatusCode() == HttpStatus.SC_OK) {
      HttpEntity httpEntity = httpResponse.getEntity();
      if (httpEntity != null) {
        try (InputStream inputStream = httpEntity.getContent()) {
          String json = CharStreams.toString(new InputStreamReader(inputStream));
          
          Log.getLog().warn(json);
          
          ResponseRepresentation responseWrapper = JsonUtils.toObject(json, ResponseRepresentation.class);
          if ("sucesso".equals(responseWrapper.getStatus())) {
            T obj = null;
            if (clazz != null) {
              obj = JsonUtils.toObject(responseWrapper.getDados(), clazz);
            } else {
              obj = JsonUtils.toObject(responseWrapper.getDados(), type);
            }
            return obj;
          }
          List<ErrorRepresentation> errorResponse = JsonUtils.toObject(responseWrapper.getDados(), new TypeReference<List<ErrorRepresentation>>() {
            //
          });
          throw new PlugBoletoException(errorResponse);
        }
      }
    }
    if (statusLine.getStatusCode() == HttpStatus.SC_BAD_REQUEST) {
      HttpHelper.handle400(httpResponse);
    }
    if (statusLine.getStatusCode() == HttpStatus.SC_NOT_FOUND) {
      return null;
    }
    throw new IllegalStateException("HTTP Error: " + statusLine.getStatusCode() + " " + statusLine.getReasonPhrase());
  }

  public static <T> T exchange(final HttpClient httpClient, final HttpUriRequest httpRequest, final Class<T> clazz) throws IOException {
    return HttpHelper.exchange(httpClient, httpRequest, clazz, null);
  }

  public static <T> T exchange(final HttpClient httpClient, final HttpUriRequest httpRequest, final TypeReference<T> type) throws IOException {
    return HttpHelper.exchange(httpClient, httpRequest, null, type);
  }

}
