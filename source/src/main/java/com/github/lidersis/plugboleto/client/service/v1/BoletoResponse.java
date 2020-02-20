package com.github.lidersis.plugboleto.client.service.v1;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.lidersis.plugboleto.client.Constants;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BoletoResponse implements Serializable {

  private final static long serialVersionUID = Constants.VERSION;

  @JsonProperty("idintegracao")
  public String idintegracao;

  @JsonProperty("situacao")
  public String situacao;

  @JsonProperty("TituloNumeroDocumento")
  public String tituloNumeroDocumento;

  @JsonProperty("TituloNossoNumero")
  public String tituloNossoNumero;

  @JsonProperty("CedenteContaCodigoBanco")
  public String cedenteContaCodigoBanco;

  @JsonProperty("CedenteContaNumero")
  public String cedenteContaNumero;

  @JsonProperty("CedenteConvenioNumero")
  public String cedenteConvenioNumero;

  public BoletoResponse() {
    super();
  }

  public String getIdintegracao() {
    return this.idintegracao;
  }

  public void setIdintegracao(final String idintegracao) {
    this.idintegracao = idintegracao;
  }

  public String getSituacao() {
    return this.situacao;
  }

  public void setSituacao(final String situacao) {
    this.situacao = situacao;
  }

  public String getTituloNumeroDocumento() {
    return this.tituloNumeroDocumento;
  }

  public void setTituloNumeroDocumento(final String tituloNumeroDocumento) {
    this.tituloNumeroDocumento = tituloNumeroDocumento;
  }

  public String getTituloNossoNumero() {
    return this.tituloNossoNumero;
  }

  public void setTituloNossoNumero(final String tituloNossoNumero) {
    this.tituloNossoNumero = tituloNossoNumero;
  }

  public String getCedenteContaCodigoBanco() {
    return this.cedenteContaCodigoBanco;
  }

  public void setCedenteContaCodigoBanco(final String cedenteContaCodigoBanco) {
    this.cedenteContaCodigoBanco = cedenteContaCodigoBanco;
  }

  public String getCedenteContaNumero() {
    return this.cedenteContaNumero;
  }

  public void setCedenteContaNumero(final String cedenteContaNumero) {
    this.cedenteContaNumero = cedenteContaNumero;
  }

  public String getCedenteConvenioNumero() {
    return this.cedenteConvenioNumero;
  }

  public void setCedenteConvenioNumero(final String cedenteConvenioNumero) {
    this.cedenteConvenioNumero = cedenteConvenioNumero;
  }

}
