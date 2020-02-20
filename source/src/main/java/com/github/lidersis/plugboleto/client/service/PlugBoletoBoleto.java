package com.github.lidersis.plugboleto.client.service;

import java.util.List;

import com.github.lidersis.plugboleto.client.model.BoletoRepresentation;
import com.google.common.io.ByteSource;

public interface PlugBoletoBoleto {

  BoletoRepresentation get(String cedente, String id);

  ByteSource getPdf(String cedente, String id, Integer tipo);

  List<BoletoRepresentation> list(String cedente);

  BoletoRepresentation save(String cedente, BoletoRepresentation rep);

  BoletoRepresentation update(String cedente, BoletoRepresentation rep);

}
