package com.github.lidersis.plugboleto.client.service;

import java.util.List;

import com.github.lidersis.plugboleto.client.model.CedenteRepresentation;

public interface PlugBoletoCedente {

  CedenteRepresentation get(Integer id);

  List<CedenteRepresentation> list();

  CedenteRepresentation save(CedenteRepresentation rep);

  CedenteRepresentation update(CedenteRepresentation rep);

}
