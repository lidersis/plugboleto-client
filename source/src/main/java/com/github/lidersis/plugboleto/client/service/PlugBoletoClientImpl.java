package com.github.lidersis.plugboleto.client.service;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;

public class PlugBoletoClientImpl implements PlugBoletoClient {

  private HttpClient httpClient;

  private String baseUrl;

  private String cnpj;

  private String token;

  public PlugBoletoClientImpl(final String baseUrl, final String cnpj, final String token) {
    this(HttpClients.createDefault(), baseUrl, cnpj, token);
  }

  public PlugBoletoClientImpl(final HttpClient httpClient, String baseUrl, final String cnpj, final String token) {
    super();
    this.httpClient = httpClient;
    this.baseUrl = baseUrl;
    this.cnpj = cnpj;
    this.token = token;
  }

  @Override
  public PlugBoletoCedente cedente() {
    return new PlugBoletoCedenteImpl(this.httpClient, this.baseUrl, this.cnpj, this.token);
  }

}
