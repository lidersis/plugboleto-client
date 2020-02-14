package com.github.lidersis.plugboleto.client.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.github.lidersis.plugboleto.client.model.CedenteRepresentation;
import com.github.lidersis.plugboleto.client.service.PlugBoletoClient;
import com.github.lidersis.plugboleto.client.service.PlugBoletoClient;

public class CedenteServiceTest {

  private PlugBoletoClient plugBoletoClient;

  public CedenteServiceTest() {
    super();
  }

  private PlugBoletoClient getClient() {
    if (this.plugBoletoClient == null) {
      String baseUrl = "http://homologacao.plugboleto.com.br/api/v1";
      String cnpj = "01001001000113";
      String token = "f22b97c0c9a3d41ac0a3875aba69e5aa";
      this.plugBoletoClient = new PlugBoletoClient(baseUrl, cnpj, token);
    }
    return this.plugBoletoClient;
  }

  @Test
  public void test1() throws Exception {
    // CedenteRepresentation rep = this.getClient().cedente().get("11717421000154");
    CedenteRepresentation rep = this.getClient().cedente().get();
    this.print(rep);
  }

  @Test
  @Ignore
  public void test2() throws Exception {
    List<CedenteRepresentation> list = this.getClient().cedente().list();
    for (CedenteRepresentation item : list) {
      this.print(item);
    }
  }

  @Test
  @Ignore
  public void test3() throws Exception {
    CedenteRepresentation rep = new CedenteRepresentation();
    rep.setBairro("Águas Claras");
    rep.setCep("71953000");
    rep.setCidadeibge(Integer.valueOf(5300108));
    rep.setComplemento(null);
    rep.setCpfCnpj("11717421000154");
    rep.setEmail("admin@lidersis.com.br");
    rep.setLogradouro("Q QS 03 LOTES 3, 5, 7 E 9 SALA 1309 EDIFICIO PATIO CAPITAL ");
    rep.setNomefantasia("LIDERSIS");
    rep.setNumero("SN");
    rep.setRazaosocial("LIDERSIS SISTEMAS E TECNOLOGIAS DA INFORMACAO EIRELI");
    rep.setTelefone("6135511006");
    rep.setUf("DF");
    rep = this.getClient().cedente().save(rep);
    this.print(rep);
    // 4356
    // LIDERSIS SISTEMAS E TECNOLOGIAS DA INFORMACAO EIRELI
  }

  private void print(final CedenteRepresentation rep) {
    System.out.println(rep.getId());
    System.out.println(rep.getRazaosocial());
  }

}
