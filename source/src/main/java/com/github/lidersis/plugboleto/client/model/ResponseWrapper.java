package com.github.lidersis.plugboleto.client.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.github.lidersis.plugboleto.client.Constants;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseWrapper implements Serializable {

  private static final long serialVersionUID = Constants.VERSION;

  @JsonProperty("_status")
  private String status;

  @JsonProperty("_mensagem")
  private String mensagem;

  @JsonProperty("_dados")
  private JsonNode dados;

  public ResponseWrapper() {
    super();
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getMensagem() {
    return this.mensagem;
  }

  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  public JsonNode getDados() {
    return this.dados;
  }

  public void setDados(JsonNode dados) {
    this.dados = dados;
  }

}
