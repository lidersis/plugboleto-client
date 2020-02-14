package com.github.lidersis.plugboleto.client.service;

import java.util.List;

import com.github.lidersis.plugboleto.client.model.ConvenioRepresentation;

public interface PlugBoletoConvenio {

  ConvenioRepresentation get(String cedente, Integer id);

  List<ConvenioRepresentation> list(String cedente);

  ConvenioRepresentation save(String cedente, ConvenioRepresentation rep);

  ConvenioRepresentation update(String cedente, ConvenioRepresentation rep);

}
