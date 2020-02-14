package com.github.lidersis.plugboleto.client.service;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.lidersis.plugboleto.client.model.CedenteRequest;
import com.github.lidersis.plugboleto.client.model.CedenteResponse;
import com.github.lidersis.plugboleto.client.model.ErrorResponse;
import com.github.lidersis.plugboleto.client.model.ResponseWrapper;
import com.google.common.io.CharStreams;

class PlugBoletoCedenteImpl implements PlugBoletoCedente {

  private HttpClient httpClient;

  private String baseUrl;

  private String cnpj;

  private String token;

  public PlugBoletoCedenteImpl(final HttpClient httpClient, String baseUrl, final String cnpj, final String token) {
    super();
    this.httpClient = httpClient;
    this.baseUrl = baseUrl;
    this.cnpj = cnpj;
    this.token = token;
  }

  @Override
  public CedenteResponse get(final String cnpj) {
    try {
      String url = this.baseUrl + "/cedentes?cpf_cnpj=" + cnpj;

      HttpGet httpGet = new HttpGet(url);
      httpGet.setHeader("cnpj-sh", this.cnpj);
      httpGet.setHeader("token-sh", this.token);
      HttpResponse httpResponse = this.httpClient.execute(httpGet);
      StatusLine statusLine = httpResponse.getStatusLine();
      if (statusLine.getStatusCode() == HttpStatus.SC_OK) {
        HttpEntity httpEntity = httpResponse.getEntity();
        if (httpEntity != null) {
          try (InputStream inputStream = httpEntity.getContent()) {
            String json = CharStreams.toString(new InputStreamReader(inputStream));
            ResponseWrapper responseWrapper = JsonUtils.toObject(json, ResponseWrapper.class);
            if ("sucesso".equals(responseWrapper.getStatus())) {
              List<CedenteResponse> cedenteResponse = JsonUtils.toObject(responseWrapper.getDados(), new TypeReference<List<CedenteResponse>>() {
                //
              });
              if (cedenteResponse.isEmpty()) {
                return null;
              }
              return cedenteResponse.get(0);
            }
            List<ErrorResponse> errorResponse = JsonUtils.toObject(responseWrapper.getDados(), new TypeReference<List<ErrorResponse>>() {
              //
            });
            throw new PlugBoletoException(errorResponse);
          }
        }
      }
      throw new IllegalStateException("HTTP Error: " + statusLine.getStatusCode() + " " + statusLine.getReasonPhrase());
    } catch (PlugBoletoException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

  @Override
  public List<CedenteResponse> list() {
    try {
      String url = this.baseUrl + "/cedentes";

      HttpGet httpGet = new HttpGet(url);
      httpGet.setHeader("cnpj-sh", this.cnpj);
      httpGet.setHeader("token-sh", this.token);
      HttpResponse httpResponse = this.httpClient.execute(httpGet);
      StatusLine statusLine = httpResponse.getStatusLine();
      if (statusLine.getStatusCode() == HttpStatus.SC_OK) {
        HttpEntity httpEntity = httpResponse.getEntity();
        if (httpEntity != null) {
          try (InputStream inputStream = httpEntity.getContent()) {
            String json = CharStreams.toString(new InputStreamReader(inputStream));
            ResponseWrapper responseWrapper = JsonUtils.toObject(json, ResponseWrapper.class);
            if ("sucesso".equals(responseWrapper.getStatus())) {
              List<CedenteResponse> cedenteResponse = JsonUtils.toObject(responseWrapper.getDados(), new TypeReference<List<CedenteResponse>>() {
                //
              });
              return cedenteResponse;
            }
            List<ErrorResponse> errorResponse = JsonUtils.toObject(responseWrapper.getDados(), new TypeReference<List<ErrorResponse>>() {
              //
            });
            throw new PlugBoletoException(errorResponse);
          }
        }
      }
      throw new IllegalStateException("HTTP Error: " + statusLine.getStatusCode() + " " + statusLine.getReasonPhrase());
    } catch (PlugBoletoException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

  @Override
  public CedenteResponse save(final CedenteRequest cedenteRequest) {
    try {
      String url = this.baseUrl + "/cedentes";

      HttpPost httpPost = new HttpPost(url);
      httpPost.setHeader("Content-Type", ContentType.APPLICATION_JSON.getMimeType());
      httpPost.setHeader("cnpj-sh", this.cnpj);
      httpPost.setHeader("token-sh", this.token);
      httpPost.setEntity(new StringEntity(JsonUtils.toJson(cedenteRequest), ContentType.APPLICATION_JSON));
      HttpResponse httpResponse = this.httpClient.execute(httpPost);
      StatusLine statusLine = httpResponse.getStatusLine();
      if (statusLine.getStatusCode() == HttpStatus.SC_OK) {
        HttpEntity httpEntity = httpResponse.getEntity();
        if (httpEntity != null) {
          try (InputStream inputStream = httpEntity.getContent()) {
            String json = CharStreams.toString(new InputStreamReader(inputStream));
            ResponseWrapper responseWrapper = JsonUtils.toObject(json, ResponseWrapper.class);
            if ("sucesso".equals(responseWrapper.getStatus())) {
              CedenteResponse cedenteResponse = JsonUtils.toObject(responseWrapper.getDados(), CedenteResponse.class);
              return cedenteResponse;
            }
            List<ErrorResponse> errorResponse = JsonUtils.toObject(responseWrapper.getDados(), new TypeReference<List<ErrorResponse>>() {
              //
            });
            throw new PlugBoletoException(errorResponse);
          }
        }
      }
      throw new IllegalStateException("HTTP Error: " + statusLine.getStatusCode() + " " + statusLine.getReasonPhrase());
    } catch (PlugBoletoException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

  @Override
  public CedenteResponse update(final Integer id, final CedenteRequest cedenteRequest) {
    return null;
  }

}
