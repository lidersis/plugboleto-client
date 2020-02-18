package com.github.lidersis.plugboleto.client.utils;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;

public abstract class JsonUtils {

  private static final ObjectMapper MAPPER;

  static {
    MAPPER = new ObjectMapper();
  }

  private JsonUtils() {
    //
  }

  public static String toJson(final Object obj) throws JsonProcessingException, IOException {
    ObjectWriter objectWriter = JsonUtils.MAPPER.writerWithDefaultPrettyPrinter();
    String str = objectWriter.writeValueAsString(obj);
    
    // Log.getLog().warn(str);
    
    return str;
  }

  public static <T> T toObject(final String str, final Class<T> type) throws JsonProcessingException, IOException {
    ObjectReader objectReader = JsonUtils.MAPPER.readerFor(type);
    T obj = objectReader.readValue(str);
    return obj;
  }

  public static <T> T toObject(final String str, final TypeReference<T> type) throws JsonProcessingException, IOException {
    ObjectReader objectReader = JsonUtils.MAPPER.readerFor(type);
    T obj = objectReader.readValue(str);
    return obj;
  }

  public static <T> T toObject(final JsonNode node, final Class<T> type) throws JsonProcessingException {
    T obj = JsonUtils.MAPPER.treeToValue(node, type);
    return obj;
  }

  public static <T> T toObject(final JsonNode node, final TypeReference<T> type) throws IOException {
    ObjectReader objectReader = JsonUtils.MAPPER.readerFor(type);
    T obj = objectReader.readValue(node);
    return obj;
  }

}
