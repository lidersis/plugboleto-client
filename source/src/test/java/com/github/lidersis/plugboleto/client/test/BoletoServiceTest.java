package com.github.lidersis.plugboleto.client.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.github.lidersis.plugboleto.client.model.BoletoRepresentation;
import com.github.lidersis.plugboleto.client.service.PlugBoletoClient;

public class BoletoServiceTest {

  private PlugBoletoClient plugBoletoClient;

  public BoletoServiceTest() {
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
  @Ignore
  public void test1() throws Exception {
    BoletoRepresentation rep = this.getClient().boleto().get("01001001000113", "rkxXnf9Bqx");
    this.print(rep);
  }

  @Test
  @Ignore
  public void test2() throws Exception {
    List<BoletoRepresentation> list = this.getClient().boleto().list("01001001000113");
    for (BoletoRepresentation item : list) {
      this.print(item);
    }
  }

  @Test
  public void test3() throws Exception {
    BoletoRepresentation rep = new BoletoRepresentation();
    
    rep.setCedenteCodigoBanco("341");
    rep.setCedenteConta("12345");
    rep.setCedenteContaNumeroDV("6");
    rep.setCedenteNumeroConvenio("1234123456");
    
    /*rep.setCedenteCodigoBanco("001");
    rep.setCedenteConta("2863");
    rep.setCedenteContaNumeroDV("0");
    rep.setCedenteNumeroConvenio("5207");*/
    
    rep.setSacadoCPFCNPJ("86216503120");
    rep.setSacadoCelular("61998281006");
    rep.setSacadoEmail("lourival@lidersis.com.br");
    rep.setSacadoEnderecoBairro("Águas Claras");
    rep.setSacadoEnderecoCEP("71953000");
    rep.setSacadoEnderecoCidade("Brasília");
    rep.setSacadoEnderecoComplemento("Sala 1309");
    rep.setSacadoEnderecoLogradouro("QS 03 Ed. Pátio Capital");
    rep.setSacadoEnderecoNumero("SN");
    rep.setSacadoEnderecoPais("Brasil");
    rep.setSacadoEnderecoUF("DF");
    rep.setSacadoNome("Lourival Sabino");
    rep.setSacadoTelefone("6135511006");
    rep.setTituloDataEmissao(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    rep.setTituloDataVencimento(LocalDate.now().plusDays(15).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    rep.setTituloDocEspecie("01");
    rep.setTituloLocalPagamento("Pagável em qualquer banco até o vencimento.");
    rep.setTituloMensagem01("Primeiro campo de mensagem");
    rep.setTituloMensagem02("Segundo campo de mensagem");
    rep.setTituloMensagem03("Terceiro campo de mensagem");
    rep.setTituloNossoNumero("12345678999");
    rep.setTituloNumeroDocumento("01012020");
    rep.setTituloValor("1,23");
    rep = this.getClient().boleto().save("01001001000113", rep);
    this.print(rep);
    // 7219
  }

  private void print(final BoletoRepresentation rep) {
    System.out.println("======================================================");
    System.out.println(rep.getIdIntegracao());
    System.out.println(rep.getSacadoNome());
    System.out.println(rep.getTituloValor());
  }

}
