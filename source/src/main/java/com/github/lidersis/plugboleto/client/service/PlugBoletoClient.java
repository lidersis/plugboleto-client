package com.github.lidersis.plugboleto.client.service;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;

import com.github.lidersis.plugboleto.client.service.internal.PlugBoletoCedenteImpl;
import com.github.lidersis.plugboleto.client.service.internal.PlugBoletoContaImpl;

public class PlugBoletoClient {

  private HttpClient httpClient;

  private String baseUrl;

  private String cnpj;

  private String token;

  public PlugBoletoClient(final String baseUrl, final String cnpj, final String token) {
    this(HttpClients.custom().useSystemProperties().build(), baseUrl, cnpj, token);
  }

  public PlugBoletoClient(final HttpClient httpClient, String baseUrl, final String cnpj, final String token) {
    super();
    this.httpClient = httpClient;
    this.baseUrl = baseUrl;
    this.cnpj = cnpj;
    this.token = token;
  }

  public PlugBoletoCedente cedente() {
    return new PlugBoletoCedenteImpl(this.httpClient, this.baseUrl, this.cnpj, this.token);
  }

  public PlugBoletoConta conta() {
    return new PlugBoletoContaImpl(this.httpClient, this.baseUrl, this.cnpj, this.token);
  }

}
