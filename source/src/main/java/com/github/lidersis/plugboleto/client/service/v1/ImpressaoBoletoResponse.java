package com.github.lidersis.plugboleto.client.service.v1;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.lidersis.plugboleto.client.Constants;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImpressaoBoletoResponse implements Serializable {

  private final static long serialVersionUID = Constants.VERSION;

  @JsonProperty("situacao")
  public String situacao;

  @JsonProperty("protocolo")
  public String protocolo;

  public ImpressaoBoletoResponse() {
    super();
  }

  public String getSituacao() {
    return this.situacao;
  }

  public void setSituacao(final String situacao) {
    this.situacao = situacao;
  }

  public String getProtocolo() {
    return this.protocolo;
  }

  public void setProtocolo(final String protocolo) {
    this.protocolo = protocolo;
  }

}
