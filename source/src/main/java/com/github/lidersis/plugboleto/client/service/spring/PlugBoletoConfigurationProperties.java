package com.github.lidersis.plugboleto.client.service.spring;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "plugboleto.client")
public class PlugBoletoConfigurationProperties {

  private String baseUrl;

  private String client;

  private String token;

  public PlugBoletoConfigurationProperties() {
    super();
  }

  public String getBaseUrl() {
    return this.baseUrl;
  }

  public void setBaseUrl(final String baseUrl) {
    this.baseUrl = baseUrl;
  }

  public String getClient() {
    return this.client;
  }

  public void setClient(final String client) {
    this.client = client;
  }

  public String getToken() {
    return this.token;
  }

  public void setToken(final String token) {
    this.token = token;
  }

}
