package com.github.lidersis.plugboleto.client.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.github.lidersis.plugboleto.client.model.CedenteRequest;
import com.github.lidersis.plugboleto.client.model.CedenteResponse;
import com.github.lidersis.plugboleto.client.service.PlugBoletoClient;
import com.github.lidersis.plugboleto.client.service.PlugBoletoClientImpl;

public class CedenteServiceTest {

  public CedenteServiceTest() {
    super();
  }

  @Test
  @Ignore
  public void test1() throws Exception {
    String baseUrl = "http://homologacao.plugboleto.com.br/api/v1";
    String cnpj = "01001001000113";
    String token = "f22b97c0c9a3d41ac0a3875aba69e5aa";
    PlugBoletoClient plugBoletoService = new PlugBoletoClientImpl(baseUrl, cnpj, token);
    CedenteResponse cedenteResponse = plugBoletoService.cedente().get("01001001000113");
    System.out.println(cedenteResponse.getRazaosocial());
  }
  
  @Test
  public void test2() throws Exception {
    String baseUrl = "http://homologacao.plugboleto.com.br/api/v1";
    String cnpj = "01001001000113";
    String token = "f22b97c0c9a3d41ac0a3875aba69e5aa";
    PlugBoletoClient plugBoletoService = new PlugBoletoClientImpl(baseUrl, cnpj, token);
    List<CedenteResponse> cedenteResponse = plugBoletoService.cedente().list();
    for (CedenteResponse item : cedenteResponse) {
      System.out.println(item.getRazaosocial());
    }
  }

  @Test
  @Ignore
  public void test3() throws Exception {
    String baseUrl = "http://homologacao.plugboleto.com.br/api/v1";
    String cnpj = "01001001000113";
    String token = "f22b97c0c9a3d41ac0a3875aba69e5aa";
    PlugBoletoClient plugBoletoService = new PlugBoletoClientImpl(baseUrl, cnpj, token);
    CedenteRequest cedenteRequest = new CedenteRequest();
    CedenteResponse cedenteResponse = plugBoletoService.cedente().save(cedenteRequest);
    System.out.println(cedenteResponse);
  }

}
