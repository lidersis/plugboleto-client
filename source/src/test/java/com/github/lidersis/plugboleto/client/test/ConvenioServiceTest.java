package com.github.lidersis.plugboleto.client.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.github.lidersis.plugboleto.client.model.ConvenioRepresentation;
import com.github.lidersis.plugboleto.client.service.PlugBoletoClient;

public class ConvenioServiceTest {

  private PlugBoletoClient plugBoletoClient;

  public ConvenioServiceTest() {
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
    ConvenioRepresentation rep = this.getClient().convenio().get("01001001000113", Integer.valueOf(5207));
    this.print(rep);
  }

  @Test
  @Ignore
  public void test2() throws Exception {
    List<ConvenioRepresentation> list = this.getClient().convenio().list("01001001000113");
    for (ConvenioRepresentation item : list) {
      this.print(item);
    }
  }

  @Test
  @Ignore
  public void test3() throws Exception {
    ConvenioRepresentation rep = new ConvenioRepresentation();
    rep.setIdConta(Integer.valueOf(7219));
    rep.setCarteira("01");
    rep.setDescricaoConvenio("Teste Lidersis");
    rep.setEspecie("R$");
    rep.setNumeroConvenio("11122233344455");
    rep.setNumeroRemessa(null);
    rep.setPadraoCNAB("240");
    rep.setReiniciarDiariamente(Boolean.FALSE);
    rep = this.getClient().convenio().save("01001001000113", rep);
    this.print(rep);
    // 5207
  }

  private void print(final ConvenioRepresentation rep) {
    System.out.println("======================================================");
    System.out.println(rep.getId());
    System.out.println(rep.getDescricaoConvenio());
  }

}
