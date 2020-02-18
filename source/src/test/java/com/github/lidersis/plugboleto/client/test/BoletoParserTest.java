package com.github.lidersis.plugboleto.client.test;

import java.io.File;
import java.nio.charset.Charset;

import org.junit.Ignore;
import org.junit.Test;

import com.github.lidersis.plugboleto.client.model.ResponseRepresentation;
import com.github.lidersis.plugboleto.client.service.internal.LoteBoletoResponse;
import com.github.lidersis.plugboleto.client.utils.JsonUtils;
import com.google.common.io.Files;

public class BoletoParserTest {

  public BoletoParserTest() {
    super();
  }

  @Test
  @Ignore
  public void test1() throws Exception {
    File file = new File("src/test/resources/boleto-response-ok.json");
    String json = Files.asCharSource(file, Charset.defaultCharset()).read();
    ResponseRepresentation wrapper = JsonUtils.toObject(json, ResponseRepresentation.class);
    System.out.println(wrapper.getStatus());
    if ("sucesso".equals(wrapper.getStatus())) {
      LoteBoletoResponse response = JsonUtils.toObject(wrapper.getDados(), LoteBoletoResponse.class);
      System.out.println(response.getSucesso().get(0).getIdintegracao());
      System.out.println(response.getFalha());
    }
  }

  @Test
  public void test2() throws Exception {
    File file = new File("src/test/resources/error-lote-response-2.json");
    String json = Files.asCharSource(file, Charset.defaultCharset()).read();
    ResponseRepresentation wrapper = JsonUtils.toObject(json, ResponseRepresentation.class);
    System.out.println(wrapper.getStatus());
    if ("sucesso".equals(wrapper.getStatus())) {
      LoteBoletoResponse response = JsonUtils.toObject(wrapper.getDados(), LoteBoletoResponse.class);
      System.out.println(response.getSucesso());
      System.out.println(response.getFalha().get(0).getErro());
    }
  }

}
