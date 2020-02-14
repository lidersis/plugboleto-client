package com.github.lidersis.plugboleto.client.service;

public enum Environment {

  SANDBOX("http://homologacao.plugboleto.com.br/api/v1"), //
  DEFAULT("http://plugboleto.com.br/api/v1");

  private String baseUrl;

  private Environment(final String baseUrl) {
    this.baseUrl = baseUrl;
  }

  public String getBaseUrl() {
    return this.baseUrl;
  }

}
