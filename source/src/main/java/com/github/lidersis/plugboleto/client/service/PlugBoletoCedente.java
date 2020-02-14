package com.github.lidersis.plugboleto.client.service;

import java.util.List;

import com.github.lidersis.plugboleto.client.model.CedenteRequest;
import com.github.lidersis.plugboleto.client.model.CedenteResponse;

public interface PlugBoletoCedente {

  CedenteResponse get(String cnpj);

  List<CedenteResponse> list();

  CedenteResponse save(CedenteRequest cedenteRequest);
  
  CedenteResponse update(Integer id, CedenteRequest cedenteRequest);

}
