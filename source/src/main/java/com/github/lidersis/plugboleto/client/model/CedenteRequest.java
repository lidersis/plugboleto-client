package com.github.lidersis.plugboleto.client.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.lidersis.plugboleto.client.Constants;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CedenteRequest implements Serializable {

  private static final long serialVersionUID = Constants.VERSION;

  @JsonProperty("CedenteRazaoSocial")
  private String cedenteRazaoSocial;

  @JsonProperty("CedenteNomeFantasia")
  private String cedenteNomeFantasia;

  @JsonProperty("CedenteCPFCNPJ")
  private String cedenteCPFCNPJ;

  @JsonProperty("CedenteEnderecoLogradouro")
  private String cedenteEnderecoLogradouro;

  @JsonProperty("CedenteEnderecoNumero")
  private String cedenteEnderecoNumero;

  @JsonProperty("CedenteEnderecoComplemento")
  private String cedenteEnderecoComplemento;

  @JsonProperty("CedenteEnderecoBairro")
  private String cedenteEnderecoBairro;

  @JsonProperty("CedenteEnderecoCEP")
  private String cedenteEnderecoCEP;

  @JsonProperty("CedenteEnderecoCidadeIBGE")
  private String cedenteEnderecoCidadeIBGE;

  @JsonProperty("CedenteTelefone")
  private String cedenteTelefone;

  @JsonProperty("CedenteEmail")
  private String cedenteEmail;

  public CedenteRequest() {
    super();
  }

  public String getCedenteRazaoSocial() {
    return this.cedenteRazaoSocial;
  }

  public void setCedenteRazaoSocial(final String cedenteRazaoSocial) {
    this.cedenteRazaoSocial = cedenteRazaoSocial;
  }

  public String getCedenteNomeFantasia() {
    return this.cedenteNomeFantasia;
  }

  public void setCedenteNomeFantasia(final String cedenteNomeFantasia) {
    this.cedenteNomeFantasia = cedenteNomeFantasia;
  }

  public String getCedenteCPFCNPJ() {
    return this.cedenteCPFCNPJ;
  }

  public void setCedenteCPFCNPJ(final String cedenteCPFCNPJ) {
    this.cedenteCPFCNPJ = cedenteCPFCNPJ;
  }

  public String getCedenteEnderecoLogradouro() {
    return this.cedenteEnderecoLogradouro;
  }

  public void setCedenteEnderecoLogradouro(final String cedenteEnderecoLogradouro) {
    this.cedenteEnderecoLogradouro = cedenteEnderecoLogradouro;
  }

  public String getCedenteEnderecoNumero() {
    return this.cedenteEnderecoNumero;
  }

  public void setCedenteEnderecoNumero(final String cedenteEnderecoNumero) {
    this.cedenteEnderecoNumero = cedenteEnderecoNumero;
  }

  public String getCedenteEnderecoComplemento() {
    return this.cedenteEnderecoComplemento;
  }

  public void setCedenteEnderecoComplemento(final String cedenteEnderecoComplemento) {
    this.cedenteEnderecoComplemento = cedenteEnderecoComplemento;
  }

  public String getCedenteEnderecoBairro() {
    return this.cedenteEnderecoBairro;
  }

  public void setCedenteEnderecoBairro(final String cedenteEnderecoBairro) {
    this.cedenteEnderecoBairro = cedenteEnderecoBairro;
  }

  public String getCedenteEnderecoCEP() {
    return this.cedenteEnderecoCEP;
  }

  public void setCedenteEnderecoCEP(final String cedenteEnderecoCEP) {
    this.cedenteEnderecoCEP = cedenteEnderecoCEP;
  }

  public String getCedenteEnderecoCidadeIBGE() {
    return this.cedenteEnderecoCidadeIBGE;
  }

  public void setCedenteEnderecoCidadeIBGE(final String cedenteEnderecoCidadeIBGE) {
    this.cedenteEnderecoCidadeIBGE = cedenteEnderecoCidadeIBGE;
  }

  public String getCedenteTelefone() {
    return this.cedenteTelefone;
  }

  public void setCedenteTelefone(final String cedenteTelefone) {
    this.cedenteTelefone = cedenteTelefone;
  }

  public String getCedenteEmail() {
    return this.cedenteEmail;
  }

  public void setCedenteEmail(final String cedenteEmail) {
    this.cedenteEmail = cedenteEmail;
  }

}
