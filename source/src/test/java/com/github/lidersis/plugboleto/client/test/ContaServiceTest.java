package com.github.lidersis.plugboleto.client.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.github.lidersis.plugboleto.client.model.ContaRepresentation;
import com.github.lidersis.plugboleto.client.service.PlugBoletoClient;

public class ContaServiceTest {

  private PlugBoletoClient plugBoletoClient;

  public ContaServiceTest() {
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
    ContaRepresentation rep = this.getClient().conta().get("01001001000113", Integer.valueOf(7219));
    this.print(rep);
  }

  @Test
  @Ignore
  public void test2() throws Exception {
    List<ContaRepresentation> list = this.getClient().conta().list("01001001000113");
    for (ContaRepresentation item : list) {
      this.print(item);
    }
  }

  @Test
  @Ignore
  public void test3() throws Exception {
    ContaRepresentation rep = new ContaRepresentation();
    rep.setAgencia("3477");
    rep.setAgenciaDv("0");
    rep.setCodBeneficiario("596989");
    rep.setCodigoBanco("001");
    rep.setConta("37554");
    rep.setContaDv("3");
    rep.setTipoConta("CORRENTE");
    rep = this.getClient().conta().save("01001001000113", rep);
    this.print(rep);
    // 7219
  }

  private void print(final ContaRepresentation rep) {
    System.out.println("======================================================");
    System.out.println(rep.getId());
    System.out.println(rep.getCodigoBanco());
    System.out.println(rep.getAgencia() + "-" + rep.getAgenciaDv());
    System.out.println(rep.getConta() + "-" + rep.getContaDv());
  }

}
