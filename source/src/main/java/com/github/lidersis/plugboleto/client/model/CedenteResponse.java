package com.github.lidersis.plugboleto.client.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.github.lidersis.plugboleto.client.Constants;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CedenteResponse implements Serializable {

  private static final long serialVersionUID = Constants.VERSION;

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("razaosocial")
  private String razaosocial;

  @JsonProperty("nomefantasia")
  private String nomefantasia;

  @JsonProperty("cpf_cnpj")
  private String cpfCnpj;

  @JsonProperty("logradouro")
  private String logradouro;

  @JsonProperty("numero")
  private String numero;

  @JsonProperty("complemento")
  private String complemento;

  @JsonProperty("bairro")
  private String bairro;

  @JsonProperty("cep")
  private String cep;

  @JsonProperty("id_cidade")
  private Integer idCidade;

  @JsonProperty("telefone")
  private String telefone;

  @JsonProperty("email")
  private String email;

  @JsonProperty("criado")
  private String criado;

  @JsonProperty("atualizado")
  private String atualizado;

  @JsonProperty("token_cedente")
  private String tokenCedente;

  @JsonProperty("token_esales")
  private String tokenEsales;

  @JsonProperty("situacao")
  private String situacao;

  @JsonProperty("id_software_house")
  private Integer idSoftwareHouse;

  @JsonProperty("config_email")
  private String configEmail;

  @JsonProperty("config_notificacao")
  private JsonNode configNotificacao;

  @JsonProperty("motivo_inativacao")
  private String motivoInativacao;

  @JsonProperty("data_ativacao")
  private Date dataAtivacao;

  @JsonProperty("data_inativacao")
  private Date dataInativacao;

  @JsonProperty("certificado")
  private String certificado;

  @JsonProperty("dtvencimentocertificado")
  private Date dtvencimentocertificado;

  @JsonProperty("config_webhook")
  private JsonNode configWebhook;

  @JsonProperty("uf")
  private String uf;

  @JsonProperty("contas")
  private List<ContaResponse> contas = null;

  @JsonProperty("cidadeibge")
  private Integer cidadeibge;

  @JsonProperty("cidade")
  private String cidade;

  public CedenteResponse() {
    super();
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(final Integer id) {
    this.id = id;
  }

  public String getRazaosocial() {
    return this.razaosocial;
  }

  public void setRazaosocial(final String razaosocial) {
    this.razaosocial = razaosocial;
  }

  public String getNomefantasia() {
    return this.nomefantasia;
  }

  public void setNomefantasia(final String nomefantasia) {
    this.nomefantasia = nomefantasia;
  }

  public String getCpfCnpj() {
    return this.cpfCnpj;
  }

  public void setCpfCnpj(final String cpfCnpj) {
    this.cpfCnpj = cpfCnpj;
  }

  public String getLogradouro() {
    return this.logradouro;
  }

  public void setLogradouro(final String logradouro) {
    this.logradouro = logradouro;
  }

  public String getNumero() {
    return this.numero;
  }

  public void setNumero(final String numero) {
    this.numero = numero;
  }

  public String getComplemento() {
    return this.complemento;
  }

  public void setComplemento(final String complemento) {
    this.complemento = complemento;
  }

  public String getBairro() {
    return this.bairro;
  }

  public void setBairro(final String bairro) {
    this.bairro = bairro;
  }

  public String getCep() {
    return this.cep;
  }

  public void setCep(final String cep) {
    this.cep = cep;
  }

  public Integer getIdCidade() {
    return this.idCidade;
  }

  public void setIdCidade(final Integer idCidade) {
    this.idCidade = idCidade;
  }

  public String getTelefone() {
    return this.telefone;
  }

  public void setTelefone(final String telefone) {
    this.telefone = telefone;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(final String email) {
    this.email = email;
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

  public String getTokenCedente() {
    return this.tokenCedente;
  }

  public void setTokenCedente(final String tokenCedente) {
    this.tokenCedente = tokenCedente;
  }

  public String getTokenEsales() {
    return this.tokenEsales;
  }

  public void setTokenEsales(final String tokenEsales) {
    this.tokenEsales = tokenEsales;
  }

  public String getSituacao() {
    return this.situacao;
  }

  public void setSituacao(final String situacao) {
    this.situacao = situacao;
  }

  public Integer getIdSoftwareHouse() {
    return this.idSoftwareHouse;
  }

  public void setIdSoftwareHouse(final Integer idSoftwareHouse) {
    this.idSoftwareHouse = idSoftwareHouse;
  }

  public String getConfigEmail() {
    return this.configEmail;
  }

  public void setConfigEmail(final String configEmail) {
    this.configEmail = configEmail;
  }

  public JsonNode getConfigNotificacao() {
    return this.configNotificacao;
  }

  public void setConfigNotificacao(final JsonNode configNotificacao) {
    this.configNotificacao = configNotificacao;
  }

  public String getMotivoInativacao() {
    return this.motivoInativacao;
  }

  public void setMotivoInativacao(final String motivoInativacao) {
    this.motivoInativacao = motivoInativacao;
  }

  public Date getDataAtivacao() {
    return this.dataAtivacao;
  }

  public void setDataAtivacao(final Date dataAtivacao) {
    this.dataAtivacao = dataAtivacao;
  }

  public Date getDataInativacao() {
    return this.dataInativacao;
  }

  public void setDataInativacao(final Date dataInativacao) {
    this.dataInativacao = dataInativacao;
  }

  public String getCertificado() {
    return this.certificado;
  }

  public void setCertificado(final String certificado) {
    this.certificado = certificado;
  }

  public Date getDtvencimentocertificado() {
    return this.dtvencimentocertificado;
  }

  public void setDtvencimentocertificado(final Date dtvencimentocertificado) {
    this.dtvencimentocertificado = dtvencimentocertificado;
  }

  public JsonNode getConfigWebhook() {
    return this.configWebhook;
  }

  public void setConfigWebhook(final JsonNode configWebhook) {
    this.configWebhook = configWebhook;
  }

  public String getUf() {
    return this.uf;
  }

  public void setUf(final String uf) {
    this.uf = uf;
  }

  public List<ContaResponse> getContas() {
    return this.contas;
  }

  public void setContas(final List<ContaResponse> contas) {
    this.contas = contas;
  }

  public Integer getCidadeibge() {
    return this.cidadeibge;
  }

  public void setCidadeibge(final Integer cidadeibge) {
    this.cidadeibge = cidadeibge;
  }

  public String getCidade() {
    return this.cidade;
  }

  public void setCidade(final String cidade) {
    this.cidade = cidade;
  }

}
