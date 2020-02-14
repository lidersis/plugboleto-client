package com.github.lidersis.plugboleto.client.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.lidersis.plugboleto.client.Constants;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorRepresentation implements Serializable {

  private static final long serialVersionUID = Constants.VERSION;

  @JsonProperty("_campo")
  public String campo;

  @JsonProperty("_erro")
  public String erro;

  public ErrorRepresentation() {
    super();
  }

  public String getCampo() {
    return this.campo;
  }

  public void setCampo(final String campo) {
    this.campo = campo;
  }

  public String getErro() {
    return this.erro;
  }

  public void setErro(final String erro) {
    this.erro = erro;
  }

}
