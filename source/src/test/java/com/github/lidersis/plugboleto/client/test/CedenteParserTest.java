package com.github.lidersis.plugboleto.client.test;

import java.io.File;
import java.nio.charset.Charset;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.lidersis.plugboleto.client.model.CedenteResponse;
import com.github.lidersis.plugboleto.client.model.ErrorResponse;
import com.github.lidersis.plugboleto.client.model.ResponseWrapper;
import com.github.lidersis.plugboleto.client.service.JsonUtils;
import com.google.common.io.Files;

public class CedenteParserTest {

  public CedenteParserTest() {
    super();
  }

  @Test
  @Ignore
  public void test1() throws Exception {
    File file = new File("src/test/resources/cedente-response.json");
    String json = Files.asCharSource(file, Charset.defaultCharset()).read();
    ResponseWrapper wrapper = JsonUtils.toObject(json, ResponseWrapper.class);
    System.out.println(wrapper.getStatus());
    if ("sucesso".equals(wrapper.getStatus())) {
      CedenteResponse response = JsonUtils.toObject(wrapper.getDados(), CedenteResponse.class);
      System.out.println(response.getRazaosocial());
    }
  }

  @Test
  public void test2() throws Exception {
    File file = new File("src/test/resources/error-response.json");
    String json = Files.asCharSource(file, Charset.defaultCharset()).read();
    ResponseWrapper wrapper = JsonUtils.toObject(json, ResponseWrapper.class);
    System.out.println(wrapper.getStatus());
    if ("erro".equals(wrapper.getStatus())) {
      System.out.println(wrapper.getMensagem());
      List<ErrorResponse> response = JsonUtils.toObject(wrapper.getDados(), new TypeReference<List<ErrorResponse>>() {

      });
      for (ErrorResponse error : response) {
        System.out.println(error.getCampo() + " - " + error.getErro());
      }
    }
  }

}
