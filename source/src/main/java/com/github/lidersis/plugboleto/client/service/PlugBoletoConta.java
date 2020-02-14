package com.github.lidersis.plugboleto.client.service;

import java.util.List;

import com.github.lidersis.plugboleto.client.model.ContaRepresentation;

public interface PlugBoletoConta {
  
  ContaRepresentation get(String cedente, Integer id);

  List<ContaRepresentation> list(String cedente);

  ContaRepresentation save(String cedente, ContaRepresentation rep);

  ContaRepresentation update(String cedente, ContaRepresentation rep);

}
