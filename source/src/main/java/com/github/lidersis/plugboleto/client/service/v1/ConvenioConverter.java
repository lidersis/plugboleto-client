package com.github.lidersis.plugboleto.client.service.v1;

import java.util.Objects;

import com.github.lidersis.plugboleto.client.model.ConvenioRepresentation;
import com.google.common.base.Strings;

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
    req.setConvenioApiId(obj.getApiId());
    req.setConvenioApiKey(obj.getApiKey());
    req.setConvenioApiSecret(obj.getApiSecret());
    req.setConvenioCarteira(obj.getCarteira());
    req.setConvenioDensidaDeRemessa(!Strings.isNullOrEmpty(obj.getDensidadeRemessa()) ? Integer.valueOf(obj.getDensidadeRemessa()) : null);
    req.setConvenioDescricao(obj.getDescricaoConvenio());
    req.setConvenioEspecie(obj.getEspecie());
    req.setConvenioEstacao(obj.getEstacao());
    // req.setConvenioNossoNumeroBanco(obj.getNossonumeroControleBanco());
    req.setConvenioNumero(obj.getNumeroConvenio());
    req.setConvenioNumeroRemessa(Objects.toString(obj.getNumeroRemessa(), null));
    req.setConvenioPadraoCNAB(obj.getPadraoCNAB());
    req.setConvenioRegistroInstantaneo(obj.getRegistroAutomatico());
    req.setConvenioReiniciarDiariamente(obj.getReiniciarDiariamente());
    req.setConvenioUtilizaVan(obj.getUtilizaVan());
    return req;
  }

  public static ConvenioConverter getInstance() {
    return ConvenioConverter.INSTANCE;
  }

}
