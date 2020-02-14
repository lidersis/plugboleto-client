package com.github.lidersis.plugboleto.client.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.lidersis.plugboleto.client.Constants;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContaResponse implements Serializable {

  private static final long serialVersionUID = Constants.VERSION;

  @JsonProperty("id")
  public Integer id;

  @JsonProperty("codigo_banco")
  public String codigoBanco;

  @JsonProperty("codigo_banco_correspondente")
  public String codigoBancoCorrespondente;

  @JsonProperty("agencia")
  public String agencia;

  @JsonProperty("agencia_dv")
  public String agenciaDv;

  @JsonProperty("conta")
  public String conta;

  @JsonProperty("conta_dv")
  public String contaDv;

  @JsonProperty("tipo_conta")
  public String tipoConta;

  @JsonProperty("cod_beneficiario")
  public String codBeneficiario;

  @JsonProperty("id_cedente")
  public Integer idCedente;

  @JsonProperty("criado")
  public String criado;

  @JsonProperty("atualizado")
  public String atualizado;

  @JsonProperty("cod_empresa")
  public String codEmpresa;

  @JsonProperty("ativo")
  public Boolean ativo;

  @JsonProperty("validacao_ativa")
  public Boolean validacaoAtiva;

  @JsonProperty("impressao_atualizada")
  public Boolean impressaoAtualizada;

  @JsonProperty("convenios")
  public List<ConvenioResponse> convenios = null;

  public ContaResponse() {
    super();
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(final Integer id) {
    this.id = id;
  }

  public String getCodigoBanco() {
    return this.codigoBanco;
  }

  public void setCodigoBanco(final String codigoBanco) {
    this.codigoBanco = codigoBanco;
  }

  public String getCodigoBancoCorrespondente() {
    return this.codigoBancoCorrespondente;
  }

  public void setCodigoBancoCorrespondente(final String codigoBancoCorrespondente) {
    this.codigoBancoCorrespondente = codigoBancoCorrespondente;
  }

  public String getAgencia() {
    return this.agencia;
  }

  public void setAgencia(final String agencia) {
    this.agencia = agencia;
  }

  public String getAgenciaDv() {
    return this.agenciaDv;
  }

  public void setAgenciaDv(final String agenciaDv) {
    this.agenciaDv = agenciaDv;
  }

  public String getConta() {
    return this.conta;
  }

  public void setConta(final String conta) {
    this.conta = conta;
  }

  public String getContaDv() {
    return this.contaDv;
  }

  public void setContaDv(final String contaDv) {
    this.contaDv = contaDv;
  }

  public String getTipoConta() {
    return this.tipoConta;
  }

  public void setTipoConta(final String tipoConta) {
    this.tipoConta = tipoConta;
  }

  public String getCodBeneficiario() {
    return this.codBeneficiario;
  }

  public void setCodBeneficiario(final String codBeneficiario) {
    this.codBeneficiario = codBeneficiario;
  }

  public Integer getIdCedente() {
    return this.idCedente;
  }

  public void setIdCedente(final Integer idCedente) {
    this.idCedente = idCedente;
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

  public String getCodEmpresa() {
    return this.codEmpresa;
  }

  public void setCodEmpresa(final String codEmpresa) {
    this.codEmpresa = codEmpresa;
  }

  public Boolean getAtivo() {
    return this.ativo;
  }

  public void setAtivo(final Boolean ativo) {
    this.ativo = ativo;
  }

  public Boolean getValidacaoAtiva() {
    return this.validacaoAtiva;
  }

  public void setValidacaoAtiva(final Boolean validacaoAtiva) {
    this.validacaoAtiva = validacaoAtiva;
  }

  public Boolean getImpressaoAtualizada() {
    return this.impressaoAtualizada;
  }

  public void setImpressaoAtualizada(final Boolean impressaoAtualizada) {
    this.impressaoAtualizada = impressaoAtualizada;
  }

  public List<ConvenioResponse> getConvenios() {
    return this.convenios;
  }

  public void setConvenios(final List<ConvenioResponse> convenios) {
    this.convenios = convenios;
  }

}
