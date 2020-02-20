package com.github.lidersis.plugboleto.client.service.v1;

import com.github.lidersis.plugboleto.client.model.ContaRepresentation;

public class ContaConverter extends AbstractConverter<ContaRepresentation, ContaRequest> {

  private static final ContaConverter INSTANCE = new ContaConverter();

  private ContaConverter() {
    super();
  }

  @Override
  public ContaRequest convert(final ContaRepresentation obj) {
    if (obj == null) {
      return null;
    }
    ContaRequest req = new ContaRequest();
    req.setContaAgencia(obj.getAgencia());
    req.setContaAgenciaDV(obj.getAgenciaDv());
    req.setContaCodigoBanco(obj.getCodigoBanco());
    req.setContaCodigoBeneficiario(obj.getCodBeneficiario());
    req.setContaNumero(obj.getConta());
    req.setContaNumeroDV(obj.getContaDv());
    req.setContaTipo(obj.getTipoConta());
    return req;
  }

  public static ContaConverter getInstance() {
    return ContaConverter.INSTANCE;
  }

}
