package com.github.lidersis.plugboleto.client.service.internal;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.lidersis.plugboleto.client.Constants;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoteBoletoResponse implements Serializable {

  private final static long serialVersionUID = Constants.VERSION;

  @JsonProperty("_sucesso")
  public List<BoletoResponse> sucesso;

  @JsonProperty("_falha")
  public List<FalhaBoletoResponse> falha;

  public LoteBoletoResponse() {
    super();
  }

  public List<BoletoResponse> getSucesso() {
    return this.sucesso;
  }

  public void setSucesso(final List<BoletoResponse> sucesso) {
    this.sucesso = sucesso;
  }

  public List<FalhaBoletoResponse> getFalha() {
    return this.falha;
  }

  public void setFalha(final List<FalhaBoletoResponse> falha) {
    this.falha = falha;
  }

}
