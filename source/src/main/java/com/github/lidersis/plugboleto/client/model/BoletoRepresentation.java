package com.github.lidersis.plugboleto.client.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.lidersis.plugboleto.client.Constants;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BoletoRepresentation implements Serializable {

  private final static long serialVersionUID = Constants.VERSION;

  @JsonProperty("IdIntegracao")
  public String idIntegracao;

  @JsonProperty("SacadoCPFCNPJ")
  public String sacadoCPFCNPJ;

  @JsonProperty("SacadoEmail")
  public String sacadoEmail;

  @JsonProperty("SacadoEnderecoNumero")
  public String sacadoEnderecoNumero;

  @JsonProperty("SacadoEnderecoBairro")
  public String sacadoEnderecoBairro;

  @JsonProperty("SacadoEnderecoCEP")
  public String sacadoEnderecoCEP;

  @JsonProperty("SacadoEnderecoCidade")
  public String sacadoEnderecoCidade;

  @JsonProperty("SacadoEnderecoComplemento")
  public String sacadoEnderecoComplemento;

  @JsonProperty("SacadoEnderecoLogradouro")
  public String sacadoEnderecoLogradouro;

  @JsonProperty("SacadoEnderecoPais")
  public String sacadoEnderecoPais;

  @JsonProperty("SacadoEnderecoUF")
  public String sacadoEnderecoUF;

  @JsonProperty("SacadoNome")
  public String sacadoNome;

  @JsonProperty("SacadoTelefone")
  public String sacadoTelefone;

  @JsonProperty("TituloDataDesconto")
  public Object tituloDataDesconto;

  @JsonProperty("TituloDataDesconto2")
  public Object tituloDataDesconto2;

  @JsonProperty("TituloDataEmissao")
  public String tituloDataEmissao;

  @JsonProperty("TituloDataVencimento")
  public String tituloDataVencimento;

  @JsonProperty("TituloDataMulta")
  public Object tituloDataMulta;

  @JsonProperty("PagamentoData")
  public Object pagamentoData;

  @JsonProperty("PagamentoDataCredito")
  public Object pagamentoDataCredito;

  @JsonProperty("TituloPrazoProtesto")
  public Object tituloPrazoProtesto;

  @JsonProperty("TituloMensagem01")
  public String tituloMensagem01;

  @JsonProperty("TituloMensagem02")
  public String tituloMensagem02;

  @JsonProperty("TituloMensagem03")
  public String tituloMensagem03;

  @JsonProperty("TituloMensagem04")
  public Object tituloMensagem04;

  @JsonProperty("TituloMensagem05")
  public Object tituloMensagem05;

  @JsonProperty("TituloMensagem06")
  public Object tituloMensagem06;

  @JsonProperty("TituloMensagem07")
  public Object tituloMensagem07;

  @JsonProperty("TituloMensagem08")
  public Object tituloMensagem08;

  @JsonProperty("TituloMensagem09")
  public Object tituloMensagem09;

  @JsonProperty("TituloOcorrencias")
  public List<Object> tituloOcorrencias = null;

  @JsonProperty("TituloMovimentos")
  public List<Object> tituloMovimentos = null;

  @JsonProperty("TituloInstrucao1")
  public Object tituloInstrucao1;

  @JsonProperty("TituloInstrucao2")
  public Object tituloInstrucao2;

  @JsonProperty("TituloNossoNumero")
  public String tituloNossoNumero;

  @JsonProperty("TituloNumeroDocumento")
  public String tituloNumeroDocumento;

  @JsonProperty("TituloOrigemDocumento")
  public Object tituloOrigemDocumento;

  @JsonProperty("PagamentoRealizado")
  public Boolean pagamentoRealizado;

  @JsonProperty("TituloValorJuros")
  public String tituloValorJuros;

  @JsonProperty("PagamentoValorCredito")
  public String pagamentoValorCredito;

  @JsonProperty("TituloValorDesconto")
  public String tituloValorDesconto;

  @JsonProperty("TituloValorDescontoTaxa")
  public String tituloValorDescontoTaxa;

  @JsonProperty("TituloValorDescontoTaxa2")
  public String tituloValorDescontoTaxa2;

  @JsonProperty("TituloValorOutrosAcrescimos")
  public String tituloValorOutrosAcrescimos;

  @JsonProperty("TituloValorMulta")
  public String tituloValorMulta;

  @JsonProperty("TituloValorMultaTaxa")
  public String tituloValorMultaTaxa;

  @JsonProperty("PagamentoValorPago")
  public String pagamentoValorPago;

  @JsonProperty("PagamentoValorTaxaCobranca")
  public String pagamentoValorTaxaCobranca;

  @JsonProperty("TituloValorAbatimento")
  public String tituloValorAbatimento;

  @JsonProperty("PagamentoValorOutrasDespesas")
  public String pagamentoValorOutrasDespesas;

  @JsonProperty("PagamentoValorIOF")
  public String pagamentoValorIOF;

  @JsonProperty("PagamentoValorOutrosCreditos")
  public String pagamentoValorOutrosCreditos;

  @JsonProperty("PagamentoDataTaxaBancaria")
  public Object pagamentoDataTaxaBancaria;

  @JsonProperty("TituloValor")
  public String tituloValor;

  @JsonProperty("situacao")
  public SituacaoBoletoEnum situacao;

  @JsonProperty("impressao_visualizada")
  public Boolean impressaoVisualizada;

  @JsonProperty("motivo")
  public String motivo;

  @JsonProperty("PagamentoValorDesconto")
  public String pagamentoValorDesconto;

  @JsonProperty("PagamentoValorAcrescimos")
  public String pagamentoValorAcrescimos;

  @JsonProperty("PagamentoValorAbatimento")
  public String pagamentoValorAbatimento;

  @JsonProperty("TituloAgenciaCobradora")
  public Object tituloAgenciaCobradora;

  @JsonProperty("TituloAgenciaCobradoraDv")
  public Object tituloAgenciaCobradoraDv;

  @JsonProperty("TituloDataDocumento")
  public Object tituloDataDocumento;

  @JsonProperty("TituloLinhaDigitavel")
  public String tituloLinhaDigitavel;

  @JsonProperty("TituloNossoNumeroImpressao")
  public String tituloNossoNumeroImpressao;

  @JsonProperty("TituloCodigoBarras")
  public String tituloCodigoBarras;

  @JsonProperty("TituloDataImpressaoVisualizada")
  public Object tituloDataImpressaoVisualizada;

  @JsonProperty("SacadoCelular")
  public String sacadoCelular;

  @JsonProperty("TituloValorCobrado")
  public String tituloValorCobrado;

  @JsonProperty("TituloDataJuros")
  public Object tituloDataJuros;

  @JsonProperty("TituloCodigoMulta")
  public Object tituloCodigoMulta;

  @JsonProperty("TituloAceite")
  public Object tituloAceite;

  @JsonProperty("TituloPrazoBaixa")
  public Object tituloPrazoBaixa;

  @JsonProperty("TituloSacadorAvalista")
  public Object tituloSacadorAvalista;

  @JsonProperty("TituloSacadorAvalistaEndereco")
  public Object tituloSacadorAvalistaEndereco;

  @JsonProperty("TituloSacadorAvalistaEnderecoNumero")
  public Object tituloSacadorAvalistaEnderecoNumero;

  @JsonProperty("TituloSacadorAvalistaCidade")
  public Object tituloSacadorAvalistaCidade;

  @JsonProperty("TituloSacadorAvalistaCEP")
  public Object tituloSacadorAvalistaCEP;

  @JsonProperty("TituloSacadorAvalistaUF")
  public Object tituloSacadorAvalistaUF;

  @JsonProperty("TituloSacadorAvalistaBairro")
  public Object tituloSacadorAvalistaBairro;

  @JsonProperty("TituloInscricaoSacadorAvalista")
  public Object tituloInscricaoSacadorAvalista;

  @JsonProperty("TituloCodBaixaDevolucao")
  public Object tituloCodBaixaDevolucao;

  @JsonProperty("TituloCodigoJuros")
  public Object tituloCodigoJuros;

  @JsonProperty("TituloDocEspecie")
  public String tituloDocEspecie;

  @JsonProperty("TituloCodDesconto")
  public Object tituloCodDesconto;

  @JsonProperty("TituloCodDesconto2")
  public Object tituloCodDesconto2;

  @JsonProperty("TituloCodEmissaoBloqueto")
  public Object tituloCodEmissaoBloqueto;

  @JsonProperty("TituloCodDistribuicaoBloqueto")
  public Object tituloCodDistribuicaoBloqueto;

  @JsonProperty("TituloOutrasDeducoes")
  public Object tituloOutrasDeducoes;

  @JsonProperty("TituloUsoBanco")
  public Object tituloUsoBanco;

  @JsonProperty("TituloPagamentoMinimo")
  public String tituloPagamentoMinimo;

  @JsonProperty("TituloLocalPagamento")
  public String tituloLocalPagamento;

  @JsonProperty("TituloForcarFatorVencimento")
  public Object tituloForcarFatorVencimento;

  @JsonProperty("TituloInformacoesAdicionais")
  public Object tituloInformacoesAdicionais;

  @JsonProperty("TituloInstrucoes")
  public Object tituloInstrucoes;

  @JsonProperty("TituloParcela")
  public Object tituloParcela;

  @JsonProperty("TituloVariacaoCarteira")
  public Object tituloVariacaoCarteira;

  @JsonProperty("TituloCategoria")
  public Object tituloCategoria;

  @JsonProperty("TituloModalidade")
  public Object tituloModalidade;

  @JsonProperty("TituloCodCliente")
  public Object tituloCodCliente;

  @JsonProperty("TituloIos")
  public Object tituloIos;

  @JsonProperty("TituloCip")
  public Object tituloCip;

  @JsonProperty("TituloCodProtesto")
  public Object tituloCodProtesto;

  @JsonProperty("TituloEmissaoBoleto")
  public Object tituloEmissaoBoleto;

  @JsonProperty("TituloPostagemBoleto")
  public Object tituloPostagemBoleto;

  @JsonProperty("TituloCodigoReferencia")
  public Object tituloCodigoReferencia;

  @JsonProperty("TituloTipoCobranca")
  public Object tituloTipoCobranca;

  @JsonProperty("CedenteAgencia")
  public String cedenteAgencia;

  @JsonProperty("CedenteAgenciaDV")
  public Object cedenteAgenciaDV;

  @JsonProperty("CedenteCodigoBanco")
  public String cedenteCodigoBanco;

  @JsonProperty("CedenteConta")
  public String cedenteConta;

  @JsonProperty("CedenteContaNumeroDV")
  public String cedenteContaNumeroDV;

  @JsonProperty("CedenteCarteira")
  public String cedenteCarteira;

  @JsonProperty("CedenteNumeroConvenio")
  public String cedenteNumeroConvenio;

  public BoletoRepresentation() {
    super();
  }

  public String getIdIntegracao() {
    return this.idIntegracao;
  }

  public void setIdIntegracao(final String idIntegracao) {
    this.idIntegracao = idIntegracao;
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

  public String getSacadoEnderecoCEP() {
    return this.sacadoEnderecoCEP;
  }

  public void setSacadoEnderecoCEP(final String sacadoEnderecoCEP) {
    this.sacadoEnderecoCEP = sacadoEnderecoCEP;
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

  public String getSacadoEnderecoLogradouro() {
    return this.sacadoEnderecoLogradouro;
  }

  public void setSacadoEnderecoLogradouro(final String sacadoEnderecoLogradouro) {
    this.sacadoEnderecoLogradouro = sacadoEnderecoLogradouro;
  }

  public String getSacadoEnderecoPais() {
    return this.sacadoEnderecoPais;
  }

  public void setSacadoEnderecoPais(final String sacadoEnderecoPais) {
    this.sacadoEnderecoPais = sacadoEnderecoPais;
  }

  public String getSacadoEnderecoUF() {
    return this.sacadoEnderecoUF;
  }

  public void setSacadoEnderecoUF(final String sacadoEnderecoUF) {
    this.sacadoEnderecoUF = sacadoEnderecoUF;
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

  public Object getTituloDataDesconto() {
    return this.tituloDataDesconto;
  }

  public void setTituloDataDesconto(final Object tituloDataDesconto) {
    this.tituloDataDesconto = tituloDataDesconto;
  }

  public Object getTituloDataDesconto2() {
    return this.tituloDataDesconto2;
  }

  public void setTituloDataDesconto2(final Object tituloDataDesconto2) {
    this.tituloDataDesconto2 = tituloDataDesconto2;
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

  public Object getTituloDataMulta() {
    return this.tituloDataMulta;
  }

  public void setTituloDataMulta(final Object tituloDataMulta) {
    this.tituloDataMulta = tituloDataMulta;
  }

  public Object getPagamentoData() {
    return this.pagamentoData;
  }

  public void setPagamentoData(final Object pagamentoData) {
    this.pagamentoData = pagamentoData;
  }

  public Object getPagamentoDataCredito() {
    return this.pagamentoDataCredito;
  }

  public void setPagamentoDataCredito(final Object pagamentoDataCredito) {
    this.pagamentoDataCredito = pagamentoDataCredito;
  }

  public Object getTituloPrazoProtesto() {
    return this.tituloPrazoProtesto;
  }

  public void setTituloPrazoProtesto(final Object tituloPrazoProtesto) {
    this.tituloPrazoProtesto = tituloPrazoProtesto;
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

  public String getTituloMensagem03() {
    return this.tituloMensagem03;
  }

  public void setTituloMensagem03(final String tituloMensagem03) {
    this.tituloMensagem03 = tituloMensagem03;
  }

  public Object getTituloMensagem04() {
    return this.tituloMensagem04;
  }

  public void setTituloMensagem04(final Object tituloMensagem04) {
    this.tituloMensagem04 = tituloMensagem04;
  }

  public Object getTituloMensagem05() {
    return this.tituloMensagem05;
  }

  public void setTituloMensagem05(final Object tituloMensagem05) {
    this.tituloMensagem05 = tituloMensagem05;
  }

  public Object getTituloMensagem06() {
    return this.tituloMensagem06;
  }

  public void setTituloMensagem06(final Object tituloMensagem06) {
    this.tituloMensagem06 = tituloMensagem06;
  }

  public Object getTituloMensagem07() {
    return this.tituloMensagem07;
  }

  public void setTituloMensagem07(final Object tituloMensagem07) {
    this.tituloMensagem07 = tituloMensagem07;
  }

  public Object getTituloMensagem08() {
    return this.tituloMensagem08;
  }

  public void setTituloMensagem08(final Object tituloMensagem08) {
    this.tituloMensagem08 = tituloMensagem08;
  }

  public Object getTituloMensagem09() {
    return this.tituloMensagem09;
  }

  public void setTituloMensagem09(final Object tituloMensagem09) {
    this.tituloMensagem09 = tituloMensagem09;
  }

  public List<Object> getTituloOcorrencias() {
    return this.tituloOcorrencias;
  }

  public void setTituloOcorrencias(final List<Object> tituloOcorrencias) {
    this.tituloOcorrencias = tituloOcorrencias;
  }

  public List<Object> getTituloMovimentos() {
    return this.tituloMovimentos;
  }

  public void setTituloMovimentos(final List<Object> tituloMovimentos) {
    this.tituloMovimentos = tituloMovimentos;
  }

  public Object getTituloInstrucao1() {
    return this.tituloInstrucao1;
  }

  public void setTituloInstrucao1(final Object tituloInstrucao1) {
    this.tituloInstrucao1 = tituloInstrucao1;
  }

  public Object getTituloInstrucao2() {
    return this.tituloInstrucao2;
  }

  public void setTituloInstrucao2(final Object tituloInstrucao2) {
    this.tituloInstrucao2 = tituloInstrucao2;
  }

  public String getTituloNossoNumero() {
    return this.tituloNossoNumero;
  }

  public void setTituloNossoNumero(final String tituloNossoNumero) {
    this.tituloNossoNumero = tituloNossoNumero;
  }

  public String getTituloNumeroDocumento() {
    return this.tituloNumeroDocumento;
  }

  public void setTituloNumeroDocumento(final String tituloNumeroDocumento) {
    this.tituloNumeroDocumento = tituloNumeroDocumento;
  }

  public Object getTituloOrigemDocumento() {
    return this.tituloOrigemDocumento;
  }

  public void setTituloOrigemDocumento(final Object tituloOrigemDocumento) {
    this.tituloOrigemDocumento = tituloOrigemDocumento;
  }

  public Boolean getPagamentoRealizado() {
    return this.pagamentoRealizado;
  }

  public void setPagamentoRealizado(final Boolean pagamentoRealizado) {
    this.pagamentoRealizado = pagamentoRealizado;
  }

  public String getTituloValorJuros() {
    return this.tituloValorJuros;
  }

  public void setTituloValorJuros(final String tituloValorJuros) {
    this.tituloValorJuros = tituloValorJuros;
  }

  public String getPagamentoValorCredito() {
    return this.pagamentoValorCredito;
  }

  public void setPagamentoValorCredito(final String pagamentoValorCredito) {
    this.pagamentoValorCredito = pagamentoValorCredito;
  }

  public String getTituloValorDesconto() {
    return this.tituloValorDesconto;
  }

  public void setTituloValorDesconto(final String tituloValorDesconto) {
    this.tituloValorDesconto = tituloValorDesconto;
  }

  public String getTituloValorDescontoTaxa() {
    return this.tituloValorDescontoTaxa;
  }

  public void setTituloValorDescontoTaxa(final String tituloValorDescontoTaxa) {
    this.tituloValorDescontoTaxa = tituloValorDescontoTaxa;
  }

  public String getTituloValorDescontoTaxa2() {
    return this.tituloValorDescontoTaxa2;
  }

  public void setTituloValorDescontoTaxa2(final String tituloValorDescontoTaxa2) {
    this.tituloValorDescontoTaxa2 = tituloValorDescontoTaxa2;
  }

  public String getTituloValorOutrosAcrescimos() {
    return this.tituloValorOutrosAcrescimos;
  }

  public void setTituloValorOutrosAcrescimos(final String tituloValorOutrosAcrescimos) {
    this.tituloValorOutrosAcrescimos = tituloValorOutrosAcrescimos;
  }

  public String getTituloValorMulta() {
    return this.tituloValorMulta;
  }

  public void setTituloValorMulta(final String tituloValorMulta) {
    this.tituloValorMulta = tituloValorMulta;
  }

  public String getTituloValorMultaTaxa() {
    return this.tituloValorMultaTaxa;
  }

  public void setTituloValorMultaTaxa(final String tituloValorMultaTaxa) {
    this.tituloValorMultaTaxa = tituloValorMultaTaxa;
  }

  public String getPagamentoValorPago() {
    return this.pagamentoValorPago;
  }

  public void setPagamentoValorPago(final String pagamentoValorPago) {
    this.pagamentoValorPago = pagamentoValorPago;
  }

  public String getPagamentoValorTaxaCobranca() {
    return this.pagamentoValorTaxaCobranca;
  }

  public void setPagamentoValorTaxaCobranca(final String pagamentoValorTaxaCobranca) {
    this.pagamentoValorTaxaCobranca = pagamentoValorTaxaCobranca;
  }

  public String getTituloValorAbatimento() {
    return this.tituloValorAbatimento;
  }

  public void setTituloValorAbatimento(final String tituloValorAbatimento) {
    this.tituloValorAbatimento = tituloValorAbatimento;
  }

  public String getPagamentoValorOutrasDespesas() {
    return this.pagamentoValorOutrasDespesas;
  }

  public void setPagamentoValorOutrasDespesas(final String pagamentoValorOutrasDespesas) {
    this.pagamentoValorOutrasDespesas = pagamentoValorOutrasDespesas;
  }

  public String getPagamentoValorIOF() {
    return this.pagamentoValorIOF;
  }

  public void setPagamentoValorIOF(final String pagamentoValorIOF) {
    this.pagamentoValorIOF = pagamentoValorIOF;
  }

  public String getPagamentoValorOutrosCreditos() {
    return this.pagamentoValorOutrosCreditos;
  }

  public void setPagamentoValorOutrosCreditos(final String pagamentoValorOutrosCreditos) {
    this.pagamentoValorOutrosCreditos = pagamentoValorOutrosCreditos;
  }

  public Object getPagamentoDataTaxaBancaria() {
    return this.pagamentoDataTaxaBancaria;
  }

  public void setPagamentoDataTaxaBancaria(final Object pagamentoDataTaxaBancaria) {
    this.pagamentoDataTaxaBancaria = pagamentoDataTaxaBancaria;
  }

  public String getTituloValor() {
    return this.tituloValor;
  }

  public void setTituloValor(final String tituloValor) {
    this.tituloValor = tituloValor;
  }

  public SituacaoBoletoEnum getSituacao() {
    return this.situacao;
  }

  public void setSituacao(final SituacaoBoletoEnum situacao) {
    this.situacao = situacao;
  }

  public Boolean getImpressaoVisualizada() {
    return this.impressaoVisualizada;
  }

  public void setImpressaoVisualizada(final Boolean impressaoVisualizada) {
    this.impressaoVisualizada = impressaoVisualizada;
  }

  public String getMotivo() {
    return this.motivo;
  }

  public void setMotivo(final String motivo) {
    this.motivo = motivo;
  }

  public String getPagamentoValorDesconto() {
    return this.pagamentoValorDesconto;
  }

  public void setPagamentoValorDesconto(final String pagamentoValorDesconto) {
    this.pagamentoValorDesconto = pagamentoValorDesconto;
  }

  public String getPagamentoValorAcrescimos() {
    return this.pagamentoValorAcrescimos;
  }

  public void setPagamentoValorAcrescimos(final String pagamentoValorAcrescimos) {
    this.pagamentoValorAcrescimos = pagamentoValorAcrescimos;
  }

  public String getPagamentoValorAbatimento() {
    return this.pagamentoValorAbatimento;
  }

  public void setPagamentoValorAbatimento(final String pagamentoValorAbatimento) {
    this.pagamentoValorAbatimento = pagamentoValorAbatimento;
  }

  public Object getTituloAgenciaCobradora() {
    return this.tituloAgenciaCobradora;
  }

  public void setTituloAgenciaCobradora(final Object tituloAgenciaCobradora) {
    this.tituloAgenciaCobradora = tituloAgenciaCobradora;
  }

  public Object getTituloAgenciaCobradoraDv() {
    return this.tituloAgenciaCobradoraDv;
  }

  public void setTituloAgenciaCobradoraDv(final Object tituloAgenciaCobradoraDv) {
    this.tituloAgenciaCobradoraDv = tituloAgenciaCobradoraDv;
  }

  public Object getTituloDataDocumento() {
    return this.tituloDataDocumento;
  }

  public void setTituloDataDocumento(final Object tituloDataDocumento) {
    this.tituloDataDocumento = tituloDataDocumento;
  }

  public String getTituloLinhaDigitavel() {
    return this.tituloLinhaDigitavel;
  }

  public void setTituloLinhaDigitavel(final String tituloLinhaDigitavel) {
    this.tituloLinhaDigitavel = tituloLinhaDigitavel;
  }

  public String getTituloNossoNumeroImpressao() {
    return this.tituloNossoNumeroImpressao;
  }

  public void setTituloNossoNumeroImpressao(final String tituloNossoNumeroImpressao) {
    this.tituloNossoNumeroImpressao = tituloNossoNumeroImpressao;
  }

  public String getTituloCodigoBarras() {
    return this.tituloCodigoBarras;
  }

  public void setTituloCodigoBarras(final String tituloCodigoBarras) {
    this.tituloCodigoBarras = tituloCodigoBarras;
  }

  public Object getTituloDataImpressaoVisualizada() {
    return this.tituloDataImpressaoVisualizada;
  }

  public void setTituloDataImpressaoVisualizada(final Object tituloDataImpressaoVisualizada) {
    this.tituloDataImpressaoVisualizada = tituloDataImpressaoVisualizada;
  }

  public String getSacadoCelular() {
    return this.sacadoCelular;
  }

  public void setSacadoCelular(final String sacadoCelular) {
    this.sacadoCelular = sacadoCelular;
  }

  public String getTituloValorCobrado() {
    return this.tituloValorCobrado;
  }

  public void setTituloValorCobrado(final String tituloValorCobrado) {
    this.tituloValorCobrado = tituloValorCobrado;
  }

  public Object getTituloDataJuros() {
    return this.tituloDataJuros;
  }

  public void setTituloDataJuros(final Object tituloDataJuros) {
    this.tituloDataJuros = tituloDataJuros;
  }

  public Object getTituloCodigoMulta() {
    return this.tituloCodigoMulta;
  }

  public void setTituloCodigoMulta(final Object tituloCodigoMulta) {
    this.tituloCodigoMulta = tituloCodigoMulta;
  }

  public Object getTituloAceite() {
    return this.tituloAceite;
  }

  public void setTituloAceite(final Object tituloAceite) {
    this.tituloAceite = tituloAceite;
  }

  public Object getTituloPrazoBaixa() {
    return this.tituloPrazoBaixa;
  }

  public void setTituloPrazoBaixa(final Object tituloPrazoBaixa) {
    this.tituloPrazoBaixa = tituloPrazoBaixa;
  }

  public Object getTituloSacadorAvalista() {
    return this.tituloSacadorAvalista;
  }

  public void setTituloSacadorAvalista(final Object tituloSacadorAvalista) {
    this.tituloSacadorAvalista = tituloSacadorAvalista;
  }

  public Object getTituloSacadorAvalistaEndereco() {
    return this.tituloSacadorAvalistaEndereco;
  }

  public void setTituloSacadorAvalistaEndereco(final Object tituloSacadorAvalistaEndereco) {
    this.tituloSacadorAvalistaEndereco = tituloSacadorAvalistaEndereco;
  }

  public Object getTituloSacadorAvalistaEnderecoNumero() {
    return this.tituloSacadorAvalistaEnderecoNumero;
  }

  public void setTituloSacadorAvalistaEnderecoNumero(final Object tituloSacadorAvalistaEnderecoNumero) {
    this.tituloSacadorAvalistaEnderecoNumero = tituloSacadorAvalistaEnderecoNumero;
  }

  public Object getTituloSacadorAvalistaCidade() {
    return this.tituloSacadorAvalistaCidade;
  }

  public void setTituloSacadorAvalistaCidade(final Object tituloSacadorAvalistaCidade) {
    this.tituloSacadorAvalistaCidade = tituloSacadorAvalistaCidade;
  }

  public Object getTituloSacadorAvalistaCEP() {
    return this.tituloSacadorAvalistaCEP;
  }

  public void setTituloSacadorAvalistaCEP(final Object tituloSacadorAvalistaCEP) {
    this.tituloSacadorAvalistaCEP = tituloSacadorAvalistaCEP;
  }

  public Object getTituloSacadorAvalistaUF() {
    return this.tituloSacadorAvalistaUF;
  }

  public void setTituloSacadorAvalistaUF(final Object tituloSacadorAvalistaUF) {
    this.tituloSacadorAvalistaUF = tituloSacadorAvalistaUF;
  }

  public Object getTituloSacadorAvalistaBairro() {
    return this.tituloSacadorAvalistaBairro;
  }

  public void setTituloSacadorAvalistaBairro(final Object tituloSacadorAvalistaBairro) {
    this.tituloSacadorAvalistaBairro = tituloSacadorAvalistaBairro;
  }

  public Object getTituloInscricaoSacadorAvalista() {
    return this.tituloInscricaoSacadorAvalista;
  }

  public void setTituloInscricaoSacadorAvalista(final Object tituloInscricaoSacadorAvalista) {
    this.tituloInscricaoSacadorAvalista = tituloInscricaoSacadorAvalista;
  }

  public Object getTituloCodBaixaDevolucao() {
    return this.tituloCodBaixaDevolucao;
  }

  public void setTituloCodBaixaDevolucao(final Object tituloCodBaixaDevolucao) {
    this.tituloCodBaixaDevolucao = tituloCodBaixaDevolucao;
  }

  public Object getTituloCodigoJuros() {
    return this.tituloCodigoJuros;
  }

  public void setTituloCodigoJuros(final Object tituloCodigoJuros) {
    this.tituloCodigoJuros = tituloCodigoJuros;
  }

  public String getTituloDocEspecie() {
    return this.tituloDocEspecie;
  }

  public void setTituloDocEspecie(final String tituloDocEspecie) {
    this.tituloDocEspecie = tituloDocEspecie;
  }

  public Object getTituloCodDesconto() {
    return this.tituloCodDesconto;
  }

  public void setTituloCodDesconto(final Object tituloCodDesconto) {
    this.tituloCodDesconto = tituloCodDesconto;
  }

  public Object getTituloCodDesconto2() {
    return this.tituloCodDesconto2;
  }

  public void setTituloCodDesconto2(final Object tituloCodDesconto2) {
    this.tituloCodDesconto2 = tituloCodDesconto2;
  }

  public Object getTituloCodEmissaoBloqueto() {
    return this.tituloCodEmissaoBloqueto;
  }

  public void setTituloCodEmissaoBloqueto(final Object tituloCodEmissaoBloqueto) {
    this.tituloCodEmissaoBloqueto = tituloCodEmissaoBloqueto;
  }

  public Object getTituloCodDistribuicaoBloqueto() {
    return this.tituloCodDistribuicaoBloqueto;
  }

  public void setTituloCodDistribuicaoBloqueto(final Object tituloCodDistribuicaoBloqueto) {
    this.tituloCodDistribuicaoBloqueto = tituloCodDistribuicaoBloqueto;
  }

  public Object getTituloOutrasDeducoes() {
    return this.tituloOutrasDeducoes;
  }

  public void setTituloOutrasDeducoes(final Object tituloOutrasDeducoes) {
    this.tituloOutrasDeducoes = tituloOutrasDeducoes;
  }

  public Object getTituloUsoBanco() {
    return this.tituloUsoBanco;
  }

  public void setTituloUsoBanco(final Object tituloUsoBanco) {
    this.tituloUsoBanco = tituloUsoBanco;
  }

  public String getTituloPagamentoMinimo() {
    return this.tituloPagamentoMinimo;
  }

  public void setTituloPagamentoMinimo(final String tituloPagamentoMinimo) {
    this.tituloPagamentoMinimo = tituloPagamentoMinimo;
  }

  public String getTituloLocalPagamento() {
    return this.tituloLocalPagamento;
  }

  public void setTituloLocalPagamento(final String tituloLocalPagamento) {
    this.tituloLocalPagamento = tituloLocalPagamento;
  }

  public Object getTituloForcarFatorVencimento() {
    return this.tituloForcarFatorVencimento;
  }

  public void setTituloForcarFatorVencimento(final Object tituloForcarFatorVencimento) {
    this.tituloForcarFatorVencimento = tituloForcarFatorVencimento;
  }

  public Object getTituloInformacoesAdicionais() {
    return this.tituloInformacoesAdicionais;
  }

  public void setTituloInformacoesAdicionais(final Object tituloInformacoesAdicionais) {
    this.tituloInformacoesAdicionais = tituloInformacoesAdicionais;
  }

  public Object getTituloInstrucoes() {
    return this.tituloInstrucoes;
  }

  public void setTituloInstrucoes(final Object tituloInstrucoes) {
    this.tituloInstrucoes = tituloInstrucoes;
  }

  public Object getTituloParcela() {
    return this.tituloParcela;
  }

  public void setTituloParcela(final Object tituloParcela) {
    this.tituloParcela = tituloParcela;
  }

  public Object getTituloVariacaoCarteira() {
    return this.tituloVariacaoCarteira;
  }

  public void setTituloVariacaoCarteira(final Object tituloVariacaoCarteira) {
    this.tituloVariacaoCarteira = tituloVariacaoCarteira;
  }

  public Object getTituloCategoria() {
    return this.tituloCategoria;
  }

  public void setTituloCategoria(final Object tituloCategoria) {
    this.tituloCategoria = tituloCategoria;
  }

  public Object getTituloModalidade() {
    return this.tituloModalidade;
  }

  public void setTituloModalidade(final Object tituloModalidade) {
    this.tituloModalidade = tituloModalidade;
  }

  public Object getTituloCodCliente() {
    return this.tituloCodCliente;
  }

  public void setTituloCodCliente(final Object tituloCodCliente) {
    this.tituloCodCliente = tituloCodCliente;
  }

  public Object getTituloIos() {
    return this.tituloIos;
  }

  public void setTituloIos(final Object tituloIos) {
    this.tituloIos = tituloIos;
  }

  public Object getTituloCip() {
    return this.tituloCip;
  }

  public void setTituloCip(final Object tituloCip) {
    this.tituloCip = tituloCip;
  }

  public Object getTituloCodProtesto() {
    return this.tituloCodProtesto;
  }

  public void setTituloCodProtesto(final Object tituloCodProtesto) {
    this.tituloCodProtesto = tituloCodProtesto;
  }

  public Object getTituloEmissaoBoleto() {
    return this.tituloEmissaoBoleto;
  }

  public void setTituloEmissaoBoleto(final Object tituloEmissaoBoleto) {
    this.tituloEmissaoBoleto = tituloEmissaoBoleto;
  }

  public Object getTituloPostagemBoleto() {
    return this.tituloPostagemBoleto;
  }

  public void setTituloPostagemBoleto(final Object tituloPostagemBoleto) {
    this.tituloPostagemBoleto = tituloPostagemBoleto;
  }

  public Object getTituloCodigoReferencia() {
    return this.tituloCodigoReferencia;
  }

  public void setTituloCodigoReferencia(final Object tituloCodigoReferencia) {
    this.tituloCodigoReferencia = tituloCodigoReferencia;
  }

  public Object getTituloTipoCobranca() {
    return this.tituloTipoCobranca;
  }

  public void setTituloTipoCobranca(final Object tituloTipoCobranca) {
    this.tituloTipoCobranca = tituloTipoCobranca;
  }

  public String getCedenteAgencia() {
    return this.cedenteAgencia;
  }

  public void setCedenteAgencia(final String cedenteAgencia) {
    this.cedenteAgencia = cedenteAgencia;
  }

  public Object getCedenteAgenciaDV() {
    return this.cedenteAgenciaDV;
  }

  public void setCedenteAgenciaDV(final Object cedenteAgenciaDV) {
    this.cedenteAgenciaDV = cedenteAgenciaDV;
  }

  public String getCedenteCodigoBanco() {
    return this.cedenteCodigoBanco;
  }

  public void setCedenteCodigoBanco(final String cedenteCodigoBanco) {
    this.cedenteCodigoBanco = cedenteCodigoBanco;
  }

  public String getCedenteConta() {
    return this.cedenteConta;
  }

  public void setCedenteConta(final String cedenteConta) {
    this.cedenteConta = cedenteConta;
  }

  public String getCedenteContaNumeroDV() {
    return this.cedenteContaNumeroDV;
  }

  public void setCedenteContaNumeroDV(final String cedenteContaNumeroDV) {
    this.cedenteContaNumeroDV = cedenteContaNumeroDV;
  }

  public String getCedenteCarteira() {
    return this.cedenteCarteira;
  }

  public void setCedenteCarteira(final String cedenteCarteira) {
    this.cedenteCarteira = cedenteCarteira;
  }

  public String getCedenteNumeroConvenio() {
    return this.cedenteNumeroConvenio;
  }

  public void setCedenteNumeroConvenio(final String cedenteNumeroConvenio) {
    this.cedenteNumeroConvenio = cedenteNumeroConvenio;
  }

}
