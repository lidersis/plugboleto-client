package com.github.lidersis.plugboleto.client.service.internal;

import com.github.lidersis.plugboleto.client.model.BoletoRepresentation;

public class BoletoConverter extends AbstractConverter<BoletoRepresentation, BoletoRequest> {

  private static final BoletoConverter INSTANCE = new BoletoConverter();

  private BoletoConverter() {
    super();
  }

  @Override
  public BoletoRequest convert(final BoletoRepresentation obj) {
    if (obj == null) {
      return null;
    }

    BoletoRequest req = new BoletoRequest();
    req.setCedenteContaCodigoBanco(obj.getCedenteCodigoBanco());
    req.setCedenteContaNumero(obj.getCedenteConta());
    req.setCedenteContaNumeroDV(obj.getCedenteContaNumeroDV());
    req.setCedenteConvenioNumero(obj.getCedenteNumeroConvenio());
    req.setSacadoCelular(obj.getSacadoCelular());
    req.setSacadoCPFCNPJ(obj.getSacadoCPFCNPJ());
    req.setSacadoEmail(obj.getSacadoEmail());
    req.setSacadoEnderecoBairro(obj.getSacadoEnderecoBairro());
    req.setSacadoEnderecoCep(obj.getSacadoEnderecoCEP());
    req.setSacadoEnderecoCidade(obj.getSacadoEnderecoCidade());
    req.setSacadoEnderecoComplemento(obj.getSacadoEnderecoComplemento());
    req.setSacadoEnderecoLogradouro(obj.getSacadoEnderecoLogradouro());
    req.setSacadoEnderecoNumero(obj.getSacadoEnderecoNumero());
    req.setSacadoEnderecoPais(obj.getSacadoEnderecoPais());
    req.setSacadoEnderecoUf(obj.getSacadoEnderecoUF());
    req.setSacadoNome(obj.getSacadoNome());
    req.setSacadoTelefone(obj.getSacadoTelefone());
    req.setTituloDataEmissao(obj.getTituloDataEmissao());
    req.setTituloDataVencimento(obj.getTituloDataVencimento());
    req.setTituloDocEspecie(obj.getTituloDocEspecie());
    req.setTituloMensagem01(obj.getTituloMensagem01());
    req.setTituloMensagem02(obj.getTituloMensagem02());
    req.setTituloNossoNumero(obj.getTituloNossoNumero());
    req.setTituloNumeroDocumento(obj.getTituloNumeroDocumento());
    req.setTituloValor(obj.getTituloValor());
    req.setTituloLocalPagamento(obj.getTituloLocalPagamento());
    return req;
  }

  public static BoletoConverter getInstance() {
    return BoletoConverter.INSTANCE;
  }

}
