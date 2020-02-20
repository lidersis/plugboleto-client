package com.github.lidersis.plugboleto.client.service.v1;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.lidersis.plugboleto.client.Constants;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContaRequest implements Serializable {

  private static final long serialVersionUID = Constants.VERSION;

  @JsonProperty("ContaCodigoBanco")
  private String contaCodigoBanco;

  @JsonProperty("ContaAgencia")
  private String contaAgencia;

  @JsonProperty("ContaAgenciaDV")
  private String contaAgenciaDV;

  @JsonProperty("ContaNumero")
  private String contaNumero;

  @JsonProperty("ContaNumeroDV")
  private String contaNumeroDV;

  @JsonProperty("ContaTipo")
  private String contaTipo;

  @JsonProperty("ContaCodigoBeneficiario")
  private String contaCodigoBeneficiario;

  public ContaRequest() {
    super();
  }

  public String getContaCodigoBanco() {
    return this.contaCodigoBanco;
  }

  public void setContaCodigoBanco(final String contaCodigoBanco) {
    this.contaCodigoBanco = contaCodigoBanco;
  }

  public String getContaAgencia() {
    return this.contaAgencia;
  }

  public void setContaAgencia(final String contaAgencia) {
    this.contaAgencia = contaAgencia;
  }

  public String getContaAgenciaDV() {
    return this.contaAgenciaDV;
  }

  public void setContaAgenciaDV(final String contaAgenciaDV) {
    this.contaAgenciaDV = contaAgenciaDV;
  }

  public String getContaNumero() {
    return this.contaNumero;
  }

  public void setContaNumero(final String contaNumero) {
    this.contaNumero = contaNumero;
  }

  public String getContaNumeroDV() {
    return this.contaNumeroDV;
  }

  public void setContaNumeroDV(final String contaNumeroDV) {
    this.contaNumeroDV = contaNumeroDV;
  }

  public String getContaTipo() {
    return this.contaTipo;
  }

  public void setContaTipo(final String contaTipo) {
    this.contaTipo = contaTipo;
  }

  public String getContaCodigoBeneficiario() {
    return this.contaCodigoBeneficiario;
  }

  public void setContaCodigoBeneficiario(final String contaCodigoBeneficiario) {
    this.contaCodigoBeneficiario = contaCodigoBeneficiario;
  }

}
