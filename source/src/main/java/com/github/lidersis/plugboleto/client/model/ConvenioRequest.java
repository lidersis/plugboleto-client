package com.github.lidersis.plugboleto.client.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.lidersis.plugboleto.client.Constants;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConvenioRequest implements Serializable {

  private static final long serialVersionUID = Constants.VERSION;

  @JsonProperty("ConvenioNumero")
  private String convenioNumero;

  @JsonProperty("ConvenioDescricao")
  private String convenioDescricao;

  @JsonProperty("ConvenioCarteira")
  private String convenioCarteira;

  @JsonProperty("ConvenioEspecie")
  private String convenioEspecie;

  @JsonProperty("ConvenioPadraoCNAB")
  private String convenioPadraoCNAB;

  @JsonProperty("ConvenioNumeroRemessa")
  private String convenioNumeroRemessa;

  @JsonProperty("ConvenioReiniciarDiariamente")
  private Boolean convenioReiniciarDiariamente;

  @JsonProperty("Conta")
  private Integer conta;

  public ConvenioRequest() {
    super();
  }

  public String getConvenioNumero() {
    return this.convenioNumero;
  }

  public void setConvenioNumero(final String convenioNumero) {
    this.convenioNumero = convenioNumero;
  }

  public String getConvenioDescricao() {
    return this.convenioDescricao;
  }

  public void setConvenioDescricao(final String convenioDescricao) {
    this.convenioDescricao = convenioDescricao;
  }

  public String getConvenioCarteira() {
    return this.convenioCarteira;
  }

  public void setConvenioCarteira(final String convenioCarteira) {
    this.convenioCarteira = convenioCarteira;
  }

  public String getConvenioEspecie() {
    return this.convenioEspecie;
  }

  public void setConvenioEspecie(final String convenioEspecie) {
    this.convenioEspecie = convenioEspecie;
  }

  public String getConvenioPadraoCNAB() {
    return this.convenioPadraoCNAB;
  }

  public void setConvenioPadraoCNAB(final String convenioPadraoCNAB) {
    this.convenioPadraoCNAB = convenioPadraoCNAB;
  }

  public String getConvenioNumeroRemessa() {
    return this.convenioNumeroRemessa;
  }

  public void setConvenioNumeroRemessa(final String convenioNumeroRemessa) {
    this.convenioNumeroRemessa = convenioNumeroRemessa;
  }

  public Boolean getConvenioReiniciarDiariamente() {
    return this.convenioReiniciarDiariamente;
  }

  public void setConvenioReiniciarDiariamente(final Boolean convenioReiniciarDiariamente) {
    this.convenioReiniciarDiariamente = convenioReiniciarDiariamente;
  }

  public Integer getConta() {
    return this.conta;
  }

  public void setConta(final Integer conta) {
    this.conta = conta;
  }

}
