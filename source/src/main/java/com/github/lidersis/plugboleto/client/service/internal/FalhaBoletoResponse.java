package com.github.lidersis.plugboleto.client.service.internal;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.github.lidersis.plugboleto.client.Constants;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FalhaBoletoResponse implements Serializable {

  private final static long serialVersionUID = Constants.VERSION;

  @JsonProperty("idintegracao")
  public String idintegracao;

  @JsonProperty("_erro")
  public JsonNode erro;

  @JsonProperty("_status_http")
  public Integer status;

  public FalhaBoletoResponse() {
    super();
  }

  public String getIdintegracao() {
    return this.idintegracao;
  }

  public void setIdintegracao(final String idintegracao) {
    this.idintegracao = idintegracao;
  }

  public JsonNode getErro() {
    return this.erro;
  }

  public void setErro(final JsonNode erro) {
    this.erro = erro;
  }

  public Integer getStatus() {
    return this.status;
  }

  public void setStatus(final Integer status) {
    this.status = status;
  }

}
