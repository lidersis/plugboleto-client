package com.github.lidersis.plugboleto.client.test;

import java.io.File;
import java.nio.charset.Charset;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.lidersis.plugboleto.client.model.CedenteRepresentation;
import com.github.lidersis.plugboleto.client.model.ErrorRepresentation;
import com.github.lidersis.plugboleto.client.model.ResponseRepresentation;
import com.github.lidersis.plugboleto.client.utils.JsonUtils;
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
    ResponseRepresentation wrapper = JsonUtils.toObject(json, ResponseRepresentation.class);
    System.out.println(wrapper.getStatus());
    if ("sucesso".equals(wrapper.getStatus())) {
      CedenteRepresentation response = JsonUtils.toObject(wrapper.getDados(), CedenteRepresentation.class);
      System.out.println(response.getRazaosocial());
    }
  }

  @Test
  public void test2() throws Exception {
    File file = new File("src/test/resources/error-response.json");
    String json = Files.asCharSource(file, Charset.defaultCharset()).read();
    ResponseRepresentation wrapper = JsonUtils.toObject(json, ResponseRepresentation.class);
    System.out.println(wrapper.getStatus());
    if ("erro".equals(wrapper.getStatus())) {
      System.out.println(wrapper.getMensagem());
      List<ErrorRepresentation> response = JsonUtils.toObject(wrapper.getDados(), new TypeReference<List<ErrorRepresentation>>() {

      });
      for (ErrorRepresentation error : response) {
        System.out.println(error.getCampo() + " - " + error.getErro());
      }
    }
  }

}
