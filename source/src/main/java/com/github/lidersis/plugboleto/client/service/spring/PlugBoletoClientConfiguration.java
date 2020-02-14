package com.github.lidersis.plugboleto.client.service.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.lidersis.plugboleto.client.service.PlugBoletoClient;
import com.github.lidersis.plugboleto.client.service.PlugBoletoClient;

@Configuration
@EnableConfigurationProperties(PlugBoletoConfigurationProperties.class)
public class PlugBoletoClientConfiguration {

  @Autowired
  private PlugBoletoConfigurationProperties plugBoletoConfigurationProperties;

  public PlugBoletoClientConfiguration() {
    super();
  }

  @Bean
  @ConditionalOnProperty(name = "plugboleto.client.base-url")
  @ConditionalOnMissingBean(PlugBoletoClient.class)
  public PlugBoletoClient plugBoletoClient() {
    return new PlugBoletoClient(this.plugBoletoConfigurationProperties.getBaseUrl(), this.plugBoletoConfigurationProperties.getClient(), this.plugBoletoConfigurationProperties.getToken());
  }

}
