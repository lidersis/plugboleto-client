package com.github.lidersis.plugboleto.client.service.v1;

import java.util.Objects;

import com.github.lidersis.plugboleto.client.model.ConvenioRepresentation;

public class ConvenioConverter extends AbstractConverter<ConvenioRepresentation, ConvenioRequest> {

  private static final ConvenioConverter INSTANCE = new ConvenioConverter();

  private ConvenioConverter() {
    super();
  }

  @Override
  public ConvenioRequest convert(final ConvenioRepresentation obj) {
    if (obj == null) {
      return null;
    }
    ConvenioRequest req = new ConvenioRequest();
    req.setConta(obj.getIdConta());
    req.setConvenioCarteira(obj.getCarteira());
    req.setConvenioDescricao(obj.getDescricaoConvenio());
    req.setConvenioEspecie(obj.getEspecie());
    req.setConvenioNumero(obj.getNumeroConvenio());
    req.setConvenioNumeroRemessa(Objects.toString(obj.getNumeroRemessa(), null));
    req.setConvenioPadraoCNAB(obj.getPadraoCNAB());
    req.setConvenioReiniciarDiariamente(obj.getReiniciarDiariamente());
    return req;
  }

  public static ConvenioConverter getInstance() {
    return ConvenioConverter.INSTANCE;
  }

}
