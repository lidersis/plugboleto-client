package com.github.lidersis.plugboleto.client.service.internal;

import java.util.List;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.lidersis.plugboleto.client.model.CedenteRepresentation;
import com.github.lidersis.plugboleto.client.service.PlugBoletoCedente;
import com.github.lidersis.plugboleto.client.service.PlugBoletoException;
import com.github.lidersis.plugboleto.client.utils.JsonUtils;

public class PlugBoletoCedenteImpl implements PlugBoletoCedente {

  private static final TypeReference<List<CedenteRepresentation>> CEDENTE_REPRESENTATION_LIST = new TypeReference<List<CedenteRepresentation>>() {
    //
  };

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
  public CedenteRepresentation get(final Integer id) {
    try {
      String url = this.baseUrl + "/cedentes?id=" + id;

      HttpGet httpGet = new HttpGet(url);
      httpGet.setHeader("cnpj-sh", this.cnpj);
      httpGet.setHeader("token-sh", this.token);

      List<CedenteRepresentation> list = HttpHelper.exchange(this.httpClient, httpGet, PlugBoletoCedenteImpl.CEDENTE_REPRESENTATION_LIST);
      return list.get(0);
    } catch (PlugBoletoException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

  @Override
  public List<CedenteRepresentation> list() {
    try {
      String url = this.baseUrl + "/cedentes";

      HttpGet httpGet = new HttpGet(url);
      httpGet.setHeader("cnpj-sh", this.cnpj);
      httpGet.setHeader("token-sh", this.token);

      List<CedenteRepresentation> list = HttpHelper.exchange(this.httpClient, httpGet, PlugBoletoCedenteImpl.CEDENTE_REPRESENTATION_LIST);
      return list;
    } catch (PlugBoletoException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

  @Override
  public CedenteRepresentation save(final CedenteRepresentation rep) {
    try {
      CedenteRequest cedenteRequest = CedenteConverter.getInstance().convert(rep);
      String url = this.baseUrl + "/cedentes";

      HttpPost httpPost = new HttpPost(url);
      httpPost.setHeader("Content-Type", ContentType.APPLICATION_JSON.getMimeType());
      httpPost.setHeader("cnpj-sh", this.cnpj);
      httpPost.setHeader("token-sh", this.token);
      httpPost.setEntity(new StringEntity(JsonUtils.toJson(cedenteRequest), ContentType.APPLICATION_JSON));

      CedenteRepresentation output = HttpHelper.exchange(this.httpClient, httpPost, CedenteRepresentation.class);
      return output;
    } catch (PlugBoletoException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

  @Override
  public CedenteRepresentation update(final CedenteRepresentation rep) {
    try {
      CedenteRequest cedenteRequest = CedenteConverter.getInstance().convert(rep);
      String url = this.baseUrl + "/cedentes/" + rep.getId();

      HttpPut httpPut = new HttpPut(url);
      httpPut.setHeader("Content-Type", ContentType.APPLICATION_JSON.getMimeType());
      httpPut.setHeader("cnpj-sh", this.cnpj);
      httpPut.setHeader("token-sh", this.token);
      httpPut.setHeader("cnpj-cedente", rep.getCpfCnpj());
      httpPut.setEntity(new StringEntity(JsonUtils.toJson(cedenteRequest), ContentType.APPLICATION_JSON));

      CedenteRepresentation output = HttpHelper.exchange(this.httpClient, httpPut, CedenteRepresentation.class);
      return output;
    } catch (PlugBoletoException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

}
