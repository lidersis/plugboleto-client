package com.github.lidersis.plugboleto.client.service.v1;

import java.util.List;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.lidersis.plugboleto.client.model.ConvenioRepresentation;
import com.github.lidersis.plugboleto.client.service.PlugBoletoConvenio;
import com.github.lidersis.plugboleto.client.service.PlugBoletoException;
import com.github.lidersis.plugboleto.client.utils.JsonUtils;

public class PlugBoletoConvenioImpl implements PlugBoletoConvenio {

  private static final TypeReference<List<ConvenioRepresentation>> CONTA_REPRESENTATION_LIST = new TypeReference<List<ConvenioRepresentation>>() {
    //
  };

  private HttpClient httpClient;

  private String baseUrl;

  private String cnpj;

  private String token;

  public PlugBoletoConvenioImpl(final HttpClient httpClient, String baseUrl, final String cnpj, final String token) {
    super();
    this.httpClient = httpClient;
    this.baseUrl = baseUrl;
    this.cnpj = cnpj;
    this.token = token;
  }

  @Override
  public ConvenioRepresentation get(final String cedente, final Integer id) {
    try {
      String url = this.baseUrl + "/cedentes/contas/convenios?id=" + id;

      HttpGet httpGet = new HttpGet(url);
      httpGet.setHeader("cnpj-sh", this.cnpj);
      httpGet.setHeader("token-sh", this.token);
      httpGet.setHeader("cnpj-cedente", cedente);

      List<ConvenioRepresentation> list = HttpHelper.exchange(this.httpClient, httpGet, PlugBoletoConvenioImpl.CONTA_REPRESENTATION_LIST);
      return list.get(0);
    } catch (PlugBoletoException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

  @Override
  public List<ConvenioRepresentation> list(final String cedente) {
    try {
      String url = this.baseUrl + "/cedentes/contas/convenios";

      HttpGet httpGet = new HttpGet(url);
      httpGet.setHeader("cnpj-sh", this.cnpj);
      httpGet.setHeader("token-sh", this.token);
      httpGet.setHeader("cnpj-cedente", cedente);

      List<ConvenioRepresentation> list = HttpHelper.exchange(this.httpClient, httpGet, PlugBoletoConvenioImpl.CONTA_REPRESENTATION_LIST);
      return list;
    } catch (PlugBoletoException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

  @Override
  public ConvenioRepresentation save(final String cedente, final ConvenioRepresentation rep) {
    try {
      ConvenioRequest convenioRequest = ConvenioConverter.getInstance().convert(rep);
      String url = this.baseUrl + "/cedentes/contas/convenios";

      HttpPost httpPost = new HttpPost(url);
      httpPost.setHeader("Content-Type", ContentType.APPLICATION_JSON.getMimeType());
      httpPost.setHeader("cnpj-sh", this.cnpj);
      httpPost.setHeader("token-sh", this.token);
      httpPost.setHeader("cnpj-cedente", cedente);
      httpPost.setEntity(new StringEntity(JsonUtils.toJson(convenioRequest), ContentType.APPLICATION_JSON));

      ConvenioRepresentation output = HttpHelper.exchange(this.httpClient, httpPost, ConvenioRepresentation.class);
      return output;
    } catch (PlugBoletoException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

  @Override
  public ConvenioRepresentation update(final String cedente, final ConvenioRepresentation rep) {
    try {
      ConvenioRequest convenioRequest = ConvenioConverter.getInstance().convert(rep);
      String url = this.baseUrl + "/cedentes/convenios/" + rep.getId();

      HttpPut httpPut = new HttpPut(url);
      httpPut.setHeader("Content-Type", ContentType.APPLICATION_JSON.getMimeType());
      httpPut.setHeader("cnpj-sh", this.cnpj);
      httpPut.setHeader("token-sh", this.token);
      httpPut.setHeader("cnpj-cedente", cedente);
      httpPut.setEntity(new StringEntity(JsonUtils.toJson(convenioRequest), ContentType.APPLICATION_JSON));

      ConvenioRepresentation output = HttpHelper.exchange(this.httpClient, httpPut, ConvenioRepresentation.class);
      return output;
    } catch (PlugBoletoException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

}
