package com.github.lidersis.plugboleto.client.service;

import java.util.List;

import com.github.lidersis.plugboleto.client.model.BoletoRepresentation;

public interface PlugBoletoBoleto {

  BoletoRepresentation get(String cedente, String id);

  List<BoletoRepresentation> list(String cedente);

  BoletoRepresentation save(String cedente, BoletoRepresentation rep);

  BoletoRepresentation update(String cedente, BoletoRepresentation rep);

}
