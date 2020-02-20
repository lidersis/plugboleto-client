package com.github.lidersis.plugboleto.client.service.v1;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.lidersis.plugboleto.client.Constants;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BoletoRequest implements Serializable {

  private final static long serialVersionUID = Constants.VERSION;

  @JsonProperty("SacadoCPFCNPJ")
  public String sacadoCPFCNPJ;

  @JsonProperty("SacadoEmail")
  public String sacadoEmail;

  @JsonProperty("SacadoEnderecoLogradouro")
  public String sacadoEnderecoLogradouro;

  @JsonProperty("SacadoEnderecoNumero")
  public String sacadoEnderecoNumero;

  @JsonProperty("SacadoEnderecoBairro")
  public String sacadoEnderecoBairro;

  @JsonProperty("SacadoEnderecoCEP")
  public String sacadoEnderecoCep;

  @JsonProperty("SacadoEnderecoCidade")
  public String sacadoEnderecoCidade;

  @JsonProperty("SacadoEnderecoComplemento")
  public String sacadoEnderecoComplemento;

  @JsonProperty("SacadoEnderecoPais")
  public String sacadoEnderecoPais;

  @JsonProperty("SacadoEnderecoUf")
  public String sacadoEnderecoUf;

  @JsonProperty("SacadoNome")
  public String sacadoNome;

  @JsonProperty("SacadoTelefone")
  public String sacadoTelefone;

  @JsonProperty("SacadoCelular")
  public String sacadoCelular;

  @JsonProperty("CedenteContaCodigoBanco")
  public String cedenteContaCodigoBanco;

  @JsonProperty("CedenteContaNumero")
  public String cedenteContaNumero;

  @JsonProperty("CedenteContaNumeroDV")
  public String cedenteContaNumeroDV;

  @JsonProperty("CedenteConvenioNumero")
  public String cedenteConvenioNumero;

  @JsonProperty("TituloNossoNumero")
  public String tituloNossoNumero;

  @JsonProperty("TituloValor")
  public String tituloValor;

  @JsonProperty("TituloNumeroDocumento")
  public String tituloNumeroDocumento;

  @JsonProperty("TituloDataEmissao")
  public String tituloDataEmissao;

  @JsonProperty("TituloDataVencimento")
  public String tituloDataVencimento;

  @JsonProperty("TituloAceite")
  public String tituloAceite;

  @JsonProperty("TituloDocEspecie")
  public String tituloDocEspecie;

  @JsonProperty("TituloLocalPagamento")
  public String tituloLocalPagamento;

  @JsonProperty("TituloCodDesconto")
  public String tituloCodDesconto;

  @JsonProperty("TituloDataDesconto")
  public String tituloDataDesconto;

  @JsonProperty("TituloValorDescontoTaxa")
  public String tituloValorDescontoTaxa;

  @JsonProperty("TituloCodDesconto2")
  public String tituloCodDesconto2;

  @JsonProperty("TituloDataDesconto2")
  public String tituloDataDesconto2;

  @JsonProperty("TituloValorDescontoTaxa2")
  public String tituloValorDescontoTaxa2;

  @JsonProperty("TituloValorDesconto")
  public String tituloValorDesconto;

  @JsonProperty("TituloCodigoJuros")
  public String tituloCodigoJuros;

  @JsonProperty("TituloDataJuros")
  public String tituloDataJuros;

  @JsonProperty("TituloValorJuros")
  public String tituloValorJuros;

  @JsonProperty("TituloCodigoMulta")
  public String tituloCodigoMulta;

  @JsonProperty("TituloDataMulta")
  public String tituloDataMulta;

  @JsonProperty("TituloValorMultaTaxa")
  public String tituloValorMultaTaxa;

  @JsonProperty("TituloValorMulta")
  public String tituloValorMulta;

  @JsonProperty("TituloCodProtesto")
  public String tituloCodProtesto;

  @JsonProperty("TituloPrazoProtesto")
  public String tituloPrazoProtesto;

  @JsonProperty("TituloCodBaixaDevolucao")
  public String tituloCodBaixaDevolucao;

  @JsonProperty("TituloPrazoBaixa")
  public String tituloPrazoBaixa;

  @JsonProperty("TituloMensagem01")
  public String tituloMensagem01;

  @JsonProperty("TituloMensagem02")
  public String tituloMensagem02;

  @JsonProperty("TituloSacadorAvalista")
  public String tituloSacadorAvalista;

  @JsonProperty("TituloSacadorAvalistaEndereco")
  public String tituloSacadorAvalistaEndereco;

  @JsonProperty("TituloSacadorAvalistaCidade")
  public String tituloSacadorAvalistaCidade;

  @JsonProperty("TituloSacadorAvalistaCEP")
  public String tituloSacadorAvalistaCEP;

  @JsonProperty("TituloSacadorAvalistaUF")
  public String tituloSacadorAvalistaUF;

  @JsonProperty("TituloInscricaoSacadorAvalista")
  public String tituloInscricaoSacadorAvalista;

  @JsonProperty("TituloEmissaoBoleto")
  public String tituloEmissaoBoleto;

  @JsonProperty("TituloCategoria")
  public String tituloCategoria;

  @JsonProperty("TituloPostagemBoleto")
  public String tituloPostagemBoleto;

  @JsonProperty("TituloCodEmissaoBloqueto")
  public String tituloCodEmissaoBloqueto;

  @JsonProperty("TituloOutrosAcrescimos")
  public String tituloOutrosAcrescimos;

  @JsonProperty("TituloInformacoesAdicionais")
  public String tituloInformacoesAdicionais;

  @JsonProperty("TituloInstrucoes")
  public String tituloInstrucoes;

  @JsonProperty("TituloParcela")
  public String tituloParcela;

  @JsonProperty("TituloVariacaoCarteira")
  public String tituloVariacaoCarteira;

  public BoletoRequest() {
    super();
  }

  public String getSacadoCPFCNPJ() {
    return this.sacadoCPFCNPJ;
  }

  public void setSacadoCPFCNPJ(final String sacadoCPFCNPJ) {
    this.sacadoCPFCNPJ = sacadoCPFCNPJ;
  }

  public String getSacadoEmail() {
    return this.sacadoEmail;
  }

  public void setSacadoEmail(final String sacadoEmail) {
    this.sacadoEmail = sacadoEmail;
  }

  public String getSacadoEnderecoLogradouro() {
    return this.sacadoEnderecoLogradouro;
  }

  public void setSacadoEnderecoLogradouro(final String sacadoEnderecoLogradouro) {
    this.sacadoEnderecoLogradouro = sacadoEnderecoLogradouro;
  }

  public String getSacadoEnderecoNumero() {
    return this.sacadoEnderecoNumero;
  }

  public void setSacadoEnderecoNumero(final String sacadoEnderecoNumero) {
    this.sacadoEnderecoNumero = sacadoEnderecoNumero;
  }

  public String getSacadoEnderecoBairro() {
    return this.sacadoEnderecoBairro;
  }

  public void setSacadoEnderecoBairro(final String sacadoEnderecoBairro) {
    this.sacadoEnderecoBairro = sacadoEnderecoBairro;
  }

  public String getSacadoEnderecoCep() {
    return this.sacadoEnderecoCep;
  }

  public void setSacadoEnderecoCep(final String sacadoEnderecoCep) {
    this.sacadoEnderecoCep = sacadoEnderecoCep;
  }

  public String getSacadoEnderecoCidade() {
    return this.sacadoEnderecoCidade;
  }

  public void setSacadoEnderecoCidade(final String sacadoEnderecoCidade) {
    this.sacadoEnderecoCidade = sacadoEnderecoCidade;
  }

  public String getSacadoEnderecoComplemento() {
    return this.sacadoEnderecoComplemento;
  }

  public void setSacadoEnderecoComplemento(final String sacadoEnderecoComplemento) {
    this.sacadoEnderecoComplemento = sacadoEnderecoComplemento;
  }

  public String getSacadoEnderecoPais() {
    return this.sacadoEnderecoPais;
  }

  public void setSacadoEnderecoPais(final String sacadoEnderecoPais) {
    this.sacadoEnderecoPais = sacadoEnderecoPais;
  }

  public String getSacadoEnderecoUf() {
    return this.sacadoEnderecoUf;
  }

  public void setSacadoEnderecoUf(final String sacadoEnderecoUf) {
    this.sacadoEnderecoUf = sacadoEnderecoUf;
  }

  public String getSacadoNome() {
    return this.sacadoNome;
  }

  public void setSacadoNome(final String sacadoNome) {
    this.sacadoNome = sacadoNome;
  }

  public String getSacadoTelefone() {
    return this.sacadoTelefone;
  }

  public void setSacadoTelefone(final String sacadoTelefone) {
    this.sacadoTelefone = sacadoTelefone;
  }

  public String getSacadoCelular() {
    return this.sacadoCelular;
  }

  public void setSacadoCelular(final String sacadoCelular) {
    this.sacadoCelular = sacadoCelular;
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

  public String getCedenteContaNumeroDV() {
    return this.cedenteContaNumeroDV;
  }

  public void setCedenteContaNumeroDV(final String cedenteContaNumeroDV) {
    this.cedenteContaNumeroDV = cedenteContaNumeroDV;
  }

  public String getCedenteConvenioNumero() {
    return this.cedenteConvenioNumero;
  }

  public void setCedenteConvenioNumero(final String cedenteConvenioNumero) {
    this.cedenteConvenioNumero = cedenteConvenioNumero;
  }

  public String getTituloNossoNumero() {
    return this.tituloNossoNumero;
  }

  public void setTituloNossoNumero(final String tituloNossoNumero) {
    this.tituloNossoNumero = tituloNossoNumero;
  }

  public String getTituloValor() {
    return this.tituloValor;
  }

  public void setTituloValor(final String tituloValor) {
    this.tituloValor = tituloValor;
  }

  public String getTituloNumeroDocumento() {
    return this.tituloNumeroDocumento;
  }

  public void setTituloNumeroDocumento(final String tituloNumeroDocumento) {
    this.tituloNumeroDocumento = tituloNumeroDocumento;
  }

  public String getTituloDataEmissao() {
    return this.tituloDataEmissao;
  }

  public void setTituloDataEmissao(final String tituloDataEmissao) {
    this.tituloDataEmissao = tituloDataEmissao;
  }

  public String getTituloDataVencimento() {
    return this.tituloDataVencimento;
  }

  public void setTituloDataVencimento(final String tituloDataVencimento) {
    this.tituloDataVencimento = tituloDataVencimento;
  }

  public String getTituloAceite() {
    return this.tituloAceite;
  }

  public void setTituloAceite(final String tituloAceite) {
    this.tituloAceite = tituloAceite;
  }

  public String getTituloDocEspecie() {
    return this.tituloDocEspecie;
  }

  public void setTituloDocEspecie(final String tituloDocEspecie) {
    this.tituloDocEspecie = tituloDocEspecie;
  }

  public String getTituloLocalPagamento() {
    return this.tituloLocalPagamento;
  }

  public void setTituloLocalPagamento(final String tituloLocalPagamento) {
    this.tituloLocalPagamento = tituloLocalPagamento;
  }

  public String getTituloCodDesconto() {
    return this.tituloCodDesconto;
  }

  public void setTituloCodDesconto(final String tituloCodDesconto) {
    this.tituloCodDesconto = tituloCodDesconto;
  }

  public String getTituloDataDesconto() {
    return this.tituloDataDesconto;
  }

  public void setTituloDataDesconto(final String tituloDataDesconto) {
    this.tituloDataDesconto = tituloDataDesconto;
  }

  public String getTituloValorDescontoTaxa() {
    return this.tituloValorDescontoTaxa;
  }

  public void setTituloValorDescontoTaxa(final String tituloValorDescontoTaxa) {
    this.tituloValorDescontoTaxa = tituloValorDescontoTaxa;
  }

  public String getTituloCodDesconto2() {
    return this.tituloCodDesconto2;
  }

  public void setTituloCodDesconto2(final String tituloCodDesconto2) {
    this.tituloCodDesconto2 = tituloCodDesconto2;
  }

  public String getTituloDataDesconto2() {
    return this.tituloDataDesconto2;
  }

  public void setTituloDataDesconto2(final String tituloDataDesconto2) {
    this.tituloDataDesconto2 = tituloDataDesconto2;
  }

  public String getTituloValorDescontoTaxa2() {
    return this.tituloValorDescontoTaxa2;
  }

  public void setTituloValorDescontoTaxa2(final String tituloValorDescontoTaxa2) {
    this.tituloValorDescontoTaxa2 = tituloValorDescontoTaxa2;
  }

  public String getTituloValorDesconto() {
    return this.tituloValorDesconto;
  }

  public void setTituloValorDesconto(final String tituloValorDesconto) {
    this.tituloValorDesconto = tituloValorDesconto;
  }

  public String getTituloCodigoJuros() {
    return this.tituloCodigoJuros;
  }

  public void setTituloCodigoJuros(final String tituloCodigoJuros) {
    this.tituloCodigoJuros = tituloCodigoJuros;
  }

  public String getTituloDataJuros() {
    return this.tituloDataJuros;
  }

  public void setTituloDataJuros(final String tituloDataJuros) {
    this.tituloDataJuros = tituloDataJuros;
  }

  public String getTituloValorJuros() {
    return this.tituloValorJuros;
  }

  public void setTituloValorJuros(final String tituloValorJuros) {
    this.tituloValorJuros = tituloValorJuros;
  }

  public String getTituloCodigoMulta() {
    return this.tituloCodigoMulta;
  }

  public void setTituloCodigoMulta(final String tituloCodigoMulta) {
    this.tituloCodigoMulta = tituloCodigoMulta;
  }

  public String getTituloDataMulta() {
    return this.tituloDataMulta;
  }

  public void setTituloDataMulta(final String tituloDataMulta) {
    this.tituloDataMulta = tituloDataMulta;
  }

  public String getTituloValorMultaTaxa() {
    return this.tituloValorMultaTaxa;
  }

  public void setTituloValorMultaTaxa(final String tituloValorMultaTaxa) {
    this.tituloValorMultaTaxa = tituloValorMultaTaxa;
  }

  public String getTituloValorMulta() {
    return this.tituloValorMulta;
  }

  public void setTituloValorMulta(final String tituloValorMulta) {
    this.tituloValorMulta = tituloValorMulta;
  }

  public String getTituloCodProtesto() {
    return this.tituloCodProtesto;
  }

  public void setTituloCodProtesto(final String tituloCodProtesto) {
    this.tituloCodProtesto = tituloCodProtesto;
  }

  public String getTituloPrazoProtesto() {
    return this.tituloPrazoProtesto;
  }

  public void setTituloPrazoProtesto(final String tituloPrazoProtesto) {
    this.tituloPrazoProtesto = tituloPrazoProtesto;
  }

  public String getTituloCodBaixaDevolucao() {
    return this.tituloCodBaixaDevolucao;
  }

  public void setTituloCodBaixaDevolucao(final String tituloCodBaixaDevolucao) {
    this.tituloCodBaixaDevolucao = tituloCodBaixaDevolucao;
  }

  public String getTituloPrazoBaixa() {
    return this.tituloPrazoBaixa;
  }

  public void setTituloPrazoBaixa(final String tituloPrazoBaixa) {
    this.tituloPrazoBaixa = tituloPrazoBaixa;
  }

  public String getTituloMensagem01() {
    return this.tituloMensagem01;
  }

  public void setTituloMensagem01(final String tituloMensagem01) {
    this.tituloMensagem01 = tituloMensagem01;
  }

  public String getTituloMensagem02() {
    return this.tituloMensagem02;
  }

  public void setTituloMensagem02(final String tituloMensagem02) {
    this.tituloMensagem02 = tituloMensagem02;
  }

  public String getTituloSacadorAvalista() {
    return this.tituloSacadorAvalista;
  }

  public void setTituloSacadorAvalista(final String tituloSacadorAvalista) {
    this.tituloSacadorAvalista = tituloSacadorAvalista;
  }

  public String getTituloSacadorAvalistaEndereco() {
    return this.tituloSacadorAvalistaEndereco;
  }

  public void setTituloSacadorAvalistaEndereco(final String tituloSacadorAvalistaEndereco) {
    this.tituloSacadorAvalistaEndereco = tituloSacadorAvalistaEndereco;
  }

  public String getTituloSacadorAvalistaCidade() {
    return this.tituloSacadorAvalistaCidade;
  }

  public void setTituloSacadorAvalistaCidade(final String tituloSacadorAvalistaCidade) {
    this.tituloSacadorAvalistaCidade = tituloSacadorAvalistaCidade;
  }

  public String getTituloSacadorAvalistaCEP() {
    return this.tituloSacadorAvalistaCEP;
  }

  public void setTituloSacadorAvalistaCEP(final String tituloSacadorAvalistaCEP) {
    this.tituloSacadorAvalistaCEP = tituloSacadorAvalistaCEP;
  }

  public String getTituloSacadorAvalistaUF() {
    return this.tituloSacadorAvalistaUF;
  }

  public void setTituloSacadorAvalistaUF(final String tituloSacadorAvalistaUF) {
    this.tituloSacadorAvalistaUF = tituloSacadorAvalistaUF;
  }

  public String getTituloInscricaoSacadorAvalista() {
    return this.tituloInscricaoSacadorAvalista;
  }

  public void setTituloInscricaoSacadorAvalista(final String tituloInscricaoSacadorAvalista) {
    this.tituloInscricaoSacadorAvalista = tituloInscricaoSacadorAvalista;
  }

  public String getTituloEmissaoBoleto() {
    return this.tituloEmissaoBoleto;
  }

  public void setTituloEmissaoBoleto(final String tituloEmissaoBoleto) {
    this.tituloEmissaoBoleto = tituloEmissaoBoleto;
  }

  public String getTituloCategoria() {
    return this.tituloCategoria;
  }

  public void setTituloCategoria(final String tituloCategoria) {
    this.tituloCategoria = tituloCategoria;
  }

  public String getTituloPostagemBoleto() {
    return this.tituloPostagemBoleto;
  }

  public void setTituloPostagemBoleto(final String tituloPostagemBoleto) {
    this.tituloPostagemBoleto = tituloPostagemBoleto;
  }

  public String getTituloCodEmissaoBloqueto() {
    return this.tituloCodEmissaoBloqueto;
  }

  public void setTituloCodEmissaoBloqueto(final String tituloCodEmissaoBloqueto) {
    this.tituloCodEmissaoBloqueto = tituloCodEmissaoBloqueto;
  }

  public String getTituloOutrosAcrescimos() {
    return this.tituloOutrosAcrescimos;
  }

  public void setTituloOutrosAcrescimos(final String tituloOutrosAcrescimos) {
    this.tituloOutrosAcrescimos = tituloOutrosAcrescimos;
  }

  public String getTituloInformacoesAdicionais() {
    return this.tituloInformacoesAdicionais;
  }

  public void setTituloInformacoesAdicionais(final String tituloInformacoesAdicionais) {
    this.tituloInformacoesAdicionais = tituloInformacoesAdicionais;
  }

  public String getTituloInstrucoes() {
    return this.tituloInstrucoes;
  }

  public void setTituloInstrucoes(final String tituloInstrucoes) {
    this.tituloInstrucoes = tituloInstrucoes;
  }

  public String getTituloParcela() {
    return this.tituloParcela;
  }

  public void setTituloParcela(final String tituloParcela) {
    this.tituloParcela = tituloParcela;
  }

  public String getTituloVariacaoCarteira() {
    return this.tituloVariacaoCarteira;
  }

  public void setTituloVariacaoCarteira(final String tituloVariacaoCarteira) {
    this.tituloVariacaoCarteira = tituloVariacaoCarteira;
  }

}
