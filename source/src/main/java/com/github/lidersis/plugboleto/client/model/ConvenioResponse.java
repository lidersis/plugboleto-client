package com.github.lidersis.plugboleto.client.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.lidersis.plugboleto.client.Constants;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConvenioResponse implements Serializable {

  private static final long serialVersionUID = Constants.VERSION;

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("numero_convenio")
  private String numeroConvenio;

  @JsonProperty("descricao_convenio")
  private String descricaoConvenio;

  @JsonProperty("carteira")
  private String carteira;

  @JsonProperty("especie")
  private String especie;

  @JsonProperty("id_conta")
  private Integer idConta;

  @JsonProperty("criado")
  private String criado;

  @JsonProperty("atualizado")
  private String atualizado;

  @JsonProperty("padraoCNAB")
  private String padraoCNAB;

  @JsonProperty("utiliza_van")
  private Boolean utilizaVan;

  @JsonProperty("numero_remessa")
  private Integer numeroRemessa;

  @JsonProperty("densidade_remessa")
  private String densidadeRemessa;

  @JsonProperty("codigo_cobranca")
  private String codigoCobranca;

  @JsonProperty("reiniciar_diariamente")
  private Boolean reiniciarDiariamente;

  @JsonProperty("registro_automatico")
  private Boolean registroAutomatico;

  @JsonProperty("estacao")
  private String estacao;

  @JsonProperty("ativo")
  private Boolean ativo;

  @JsonProperty("nossonumero_controle_banco")
  private String nossonumeroControleBanco;

  @JsonProperty("api_id")
  private String apiId;

  @JsonProperty("api_key")
  private String apiKey;

  @JsonProperty("api_secret")
  private String apiSecret;

  @JsonProperty("tipo_webservice")
  private String tipoWebservice;

  public Integer getId() {
    return this.id;
  }

  public void setId(final Integer id) {
    this.id = id;
  }

  public String getNumeroConvenio() {
    return this.numeroConvenio;
  }

  public void setNumeroConvenio(final String numeroConvenio) {
    this.numeroConvenio = numeroConvenio;
  }

  public String getDescricaoConvenio() {
    return this.descricaoConvenio;
  }

  public void setDescricaoConvenio(final String descricaoConvenio) {
    this.descricaoConvenio = descricaoConvenio;
  }

  public String getCarteira() {
    return this.carteira;
  }

  public void setCarteira(final String carteira) {
    this.carteira = carteira;
  }

  public String getEspecie() {
    return this.especie;
  }

  public void setEspecie(final String especie) {
    this.especie = especie;
  }

  public Integer getIdConta() {
    return this.idConta;
  }

  public void setIdConta(final Integer idConta) {
    this.idConta = idConta;
  }

  public String getCriado() {
    return this.criado;
  }

  public void setCriado(final String criado) {
    this.criado = criado;
  }

  public String getAtualizado() {
    return this.atualizado;
  }

  public void setAtualizado(final String atualizado) {
    this.atualizado = atualizado;
  }

  public String getPadraoCNAB() {
    return this.padraoCNAB;
  }

  public void setPadraoCNAB(final String padraoCNAB) {
    this.padraoCNAB = padraoCNAB;
  }

  public Boolean getUtilizaVan() {
    return this.utilizaVan;
  }

  public void setUtilizaVan(final Boolean utilizaVan) {
    this.utilizaVan = utilizaVan;
  }

  public Integer getNumeroRemessa() {
    return this.numeroRemessa;
  }

  public void setNumeroRemessa(final Integer numeroRemessa) {
    this.numeroRemessa = numeroRemessa;
  }

  public String getDensidadeRemessa() {
    return this.densidadeRemessa;
  }

  public void setDensidadeRemessa(final String densidadeRemessa) {
    this.densidadeRemessa = densidadeRemessa;
  }

  public String getCodigoCobranca() {
    return this.codigoCobranca;
  }

  public void setCodigoCobranca(final String codigoCobranca) {
    this.codigoCobranca = codigoCobranca;
  }

  public Boolean getReiniciarDiariamente() {
    return this.reiniciarDiariamente;
  }

  public void setReiniciarDiariamente(final Boolean reiniciarDiariamente) {
    this.reiniciarDiariamente = reiniciarDiariamente;
  }

  public Boolean getRegistroAutomatico() {
    return this.registroAutomatico;
  }

  public void setRegistroAutomatico(final Boolean registroAutomatico) {
    this.registroAutomatico = registroAutomatico;
  }

  public String getEstacao() {
    return this.estacao;
  }

  public void setEstacao(final String estacao) {
    this.estacao = estacao;
  }

  public Boolean getAtivo() {
    return this.ativo;
  }

  public void setAtivo(final Boolean ativo) {
    this.ativo = ativo;
  }

  public String getNossonumeroControleBanco() {
    return this.nossonumeroControleBanco;
  }

  public void setNossonumeroControleBanco(final String nossonumeroControleBanco) {
    this.nossonumeroControleBanco = nossonumeroControleBanco;
  }

  public String getApiId() {
    return this.apiId;
  }

  public void setApiId(final String apiId) {
    this.apiId = apiId;
  }

  public String getApiKey() {
    return this.apiKey;
  }

  public void setApiKey(final String apiKey) {
    this.apiKey = apiKey;
  }

  public String getApiSecret() {
    return this.apiSecret;
  }

  public void setApiSecret(final String apiSecret) {
    this.apiSecret = apiSecret;
  }

  public String getTipoWebservice() {
    return this.tipoWebservice;
  }

  public void setTipoWebservice(final String tipoWebservice) {
    this.tipoWebservice = tipoWebservice;
  }

}
