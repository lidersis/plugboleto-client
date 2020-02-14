package com.github.lidersis.plugboleto.client.service.internal;

import java.util.Objects;

import com.github.lidersis.plugboleto.client.model.CedenteRepresentation;

public class CedenteConverter extends AbstractConverter<CedenteRepresentation, CedenteRequest> {

  private static final CedenteConverter INSTANCE = new CedenteConverter();

  private CedenteConverter() {
    super();
  }

  @Override
  public CedenteRequest convert(final CedenteRepresentation obj) {
    if (obj == null) {
      return null;
    }
    CedenteRequest req = new CedenteRequest();
    req.setCedenteCPFCNPJ(obj.getCpfCnpj());
    req.setCedenteEmail(obj.getEmail());
    req.setCedenteEnderecoBairro(obj.getBairro());
    req.setCedenteEnderecoCEP(obj.getCep());
    req.setCedenteEnderecoCidadeIBGE(Objects.toString(obj.getCidadeibge(), null));
    req.setCedenteEnderecoComplemento(obj.getComplemento());
    req.setCedenteEnderecoLogradouro(obj.getLogradouro());
    req.setCedenteEnderecoNumero(obj.getNumero());
    req.setCedenteNomeFantasia(obj.getNomefantasia());
    req.setCedenteRazaoSocial(obj.getRazaosocial());
    req.setCedenteTelefone(obj.getTelefone());
    return req;
  }

  public static CedenteConverter getInstance() {
    return CedenteConverter.INSTANCE;
  }

}
