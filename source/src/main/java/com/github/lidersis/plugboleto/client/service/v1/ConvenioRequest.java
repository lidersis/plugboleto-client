package com.github.lidersis.plugboleto.client.service.v1;

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

  @JsonProperty("ConvenioReiniciarDiariamente")
  private Boolean convenioReiniciarDiariamente;

  @JsonProperty("ConvenioNumeroRemessa")
  private String convenioNumeroRemessa;

  @JsonProperty("ConvenioUtilizaVan")
  private Boolean convenioUtilizaVan;

  @JsonProperty("Conta")
  private Integer conta;

  @JsonProperty("ConvenioDensidaDeRemessa")
  private Integer convenioDensidaDeRemessa;

  @JsonProperty("ConvenioRegistroInstantaneo")
  private Boolean convenioRegistroInstantaneo;

  @JsonProperty("ConvenioApiId")
  private String convenioApiId;

  @JsonProperty("ConvenioApiKey")
  private String convenioApiKey;

  @JsonProperty("ConvenioApiSecret")
  private String convenioApiSecret;

  @JsonProperty("ConvenioEstacao")
  private String convenioEstacao;

  @JsonProperty("ConvenioNossoNumeroBanco")
  private Boolean convenioNossoNumeroBanco;

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

  public Boolean getConvenioReiniciarDiariamente() {
    return this.convenioReiniciarDiariamente;
  }

  public void setConvenioReiniciarDiariamente(final Boolean convenioReiniciarDiariamente) {
    this.convenioReiniciarDiariamente = convenioReiniciarDiariamente;
  }

  public String getConvenioNumeroRemessa() {
    return this.convenioNumeroRemessa;
  }

  public void setConvenioNumeroRemessa(final String convenioNumeroRemessa) {
    this.convenioNumeroRemessa = convenioNumeroRemessa;
  }

  public Boolean getConvenioUtilizaVan() {
    return this.convenioUtilizaVan;
  }

  public void setConvenioUtilizaVan(final Boolean convenioUtilizaVan) {
    this.convenioUtilizaVan = convenioUtilizaVan;
  }

  public Integer getConta() {
    return this.conta;
  }

  public void setConta(final Integer conta) {
    this.conta = conta;
  }

  public Integer getConvenioDensidaDeRemessa() {
    return this.convenioDensidaDeRemessa;
  }

  public void setConvenioDensidaDeRemessa(final Integer convenioDensidaDeRemessa) {
    this.convenioDensidaDeRemessa = convenioDensidaDeRemessa;
  }

  public Boolean getConvenioRegistroInstantaneo() {
    return this.convenioRegistroInstantaneo;
  }

  public void setConvenioRegistroInstantaneo(final Boolean convenioRegistroInstantaneo) {
    this.convenioRegistroInstantaneo = convenioRegistroInstantaneo;
  }

  public String getConvenioApiId() {
    return this.convenioApiId;
  }

  public void setConvenioApiId(final String convenioApiId) {
    this.convenioApiId = convenioApiId;
  }

  public String getConvenioApiKey() {
    return this.convenioApiKey;
  }

  public void setConvenioApiKey(final String convenioApiKey) {
    this.convenioApiKey = convenioApiKey;
  }

  public String getConvenioApiSecret() {
    return this.convenioApiSecret;
  }

  public void setConvenioApiSecret(final String convenioApiSecret) {
    this.convenioApiSecret = convenioApiSecret;
  }

  public String getConvenioEstacao() {
    return this.convenioEstacao;
  }

  public void setConvenioEstacao(final String convenioEstacao) {
    this.convenioEstacao = convenioEstacao;
  }

  public Boolean getConvenioNossoNumeroBanco() {
    return this.convenioNossoNumeroBanco;
  }

  public void setConvenioNossoNumeroBanco(final Boolean convenioNossoNumeroBanco) {
    this.convenioNossoNumeroBanco = convenioNossoNumeroBanco;
  }

}
