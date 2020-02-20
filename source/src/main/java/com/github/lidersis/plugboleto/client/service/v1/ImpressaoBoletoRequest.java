package com.github.lidersis.plugboleto.client.service.v1;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.lidersis.plugboleto.client.Constants;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImpressaoBoletoRequest implements Serializable {

  private final static long serialVersionUID = Constants.VERSION;

  @JsonProperty("tipoImpressao")
  public String tipoImpressao;

  @JsonProperty("boletos")
  public List<String> boletos;

  public ImpressaoBoletoRequest() {
    super();
  }

  public String getTipoImpressao() {
    return this.tipoImpressao;
  }

  public void setTipoImpressao(final String tipoImpressao) {
    this.tipoImpressao = tipoImpressao;
  }

  public List<String> getBoletos() {
    return this.boletos;
  }

  public void setBoletos(final List<String> boletos) {
    this.boletos = boletos;
  }

}
