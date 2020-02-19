package com.github.lidersis.plugboleto.client.service.internal;

import java.util.Collections;
import java.util.List;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.github.lidersis.plugboleto.client.model.BoletoRepresentation;
import com.github.lidersis.plugboleto.client.model.ErrorRepresentation;
import com.github.lidersis.plugboleto.client.model.SituacaoBoletoEnum;
import com.github.lidersis.plugboleto.client.service.PlugBoletoBoleto;
import com.github.lidersis.plugboleto.client.service.PlugBoletoException;
import com.github.lidersis.plugboleto.client.utils.JsonUtils;

public class PlugBoletoBoletoImpl implements PlugBoletoBoleto {

  private static final TypeReference<List<BoletoRepresentation>> CONTA_REPRESENTATION_LIST = new TypeReference<List<BoletoRepresentation>>() {
    //
  };

  private HttpClient httpClient;

  private String baseUrl;

  private String cnpj;

  private String token;

  public PlugBoletoBoletoImpl(final HttpClient httpClient, String baseUrl, final String cnpj, final String token) {
    super();
    this.httpClient = httpClient;
    this.baseUrl = baseUrl;
    this.cnpj = cnpj;
    this.token = token;
  }

  @Override
  public BoletoRepresentation get(final String cedente, final String id) {
    try {
      String url = this.baseUrl + "/boletos?idintegracao=" + id;

      HttpGet httpGet = new HttpGet(url);
      httpGet.setHeader("cnpj-sh", this.cnpj);
      httpGet.setHeader("token-sh", this.token);
      httpGet.setHeader("cnpj-cedente", cedente);

      List<BoletoRepresentation> list = HttpHelper.exchange(this.httpClient, httpGet, PlugBoletoBoletoImpl.CONTA_REPRESENTATION_LIST);
      return list.get(0);
    } catch (PlugBoletoException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

  @Override
  public List<BoletoRepresentation> list(final String cedente) {
    try {
      String url = this.baseUrl + "/boletos";

      HttpGet httpGet = new HttpGet(url);
      httpGet.setHeader("cnpj-sh", this.cnpj);
      httpGet.setHeader("token-sh", this.token);
      httpGet.setHeader("cnpj-cedente", cedente);

      List<BoletoRepresentation> list = HttpHelper.exchange(this.httpClient, httpGet, PlugBoletoBoletoImpl.CONTA_REPRESENTATION_LIST);
      return list;
    } catch (PlugBoletoException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

  @Override
  public BoletoRepresentation save(final String cedente, final BoletoRepresentation rep) {
    try {
      BoletoRequest convenioRequest = BoletoConverter.getInstance().convert(rep);
      String url = this.baseUrl + "/boletos/lote";

      HttpPost httpPost = new HttpPost(url);
      httpPost.setHeader("Content-Type", ContentType.APPLICATION_JSON.getMimeType());
      httpPost.setHeader("cnpj-sh", this.cnpj);
      httpPost.setHeader("token-sh", this.token);
      httpPost.setHeader("cnpj-cedente", cedente);
      httpPost.setEntity(new StringEntity(JsonUtils.toJson(Collections.singletonList(convenioRequest)), ContentType.APPLICATION_JSON));

      LoteBoletoResponse output = HttpHelper.exchange(this.httpClient, httpPost, LoteBoletoResponse.class);
      if ((output.getSucesso() != null) && (!output.getSucesso().isEmpty())) {
        BoletoResponse response = output.getSucesso().get(0);
        
        if (SituacaoBoletoEnum.SALVO.name().equals(response.getSituacao())) {
          // Entrar em loop ate o boleto ser emitido
          // SE ELE FICAR EMITIDO Gera a remessa
          // SE RETORNAR FALHA DELE DEVE SER descartado
          // REJEITADO 
        }
        
        return this.get(cedente, response.getIdintegracao());
      }
      if ((output.getFalha() != null) && (!output.getFalha().isEmpty())) {
        FalhaBoletoResponse response = output.getFalha().get(0);
        ErrorRepresentation error = new ErrorRepresentation();

        JsonNode node = response.getErro();
        if (node.isTextual()) {
          error.setErro(node.asText()); // FIXME
        } else {
          error.setErro(node.get("erros").get("boleto").asText()); // FIXME
        }
        throw new PlugBoletoException(Collections.singletonList(error));
      }
      throw new IllegalStateException("Resposta não possui sucesso nem falha");
    } catch (PlugBoletoException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

  @Override
  public BoletoRepresentation update(final String cedente, final BoletoRepresentation rep) {
    try {
      BoletoRequest convenioRequest = BoletoConverter.getInstance().convert(rep);
      String url = this.baseUrl + "/boletos/" + rep.getIdIntegracao();

      HttpPut httpPut = new HttpPut(url);
      httpPut.setHeader("Content-Type", ContentType.APPLICATION_JSON.getMimeType());
      httpPut.setHeader("cnpj-sh", this.cnpj);
      httpPut.setHeader("token-sh", this.token);
      httpPut.setHeader("cnpj-cedente", cedente);
      httpPut.setEntity(new StringEntity(JsonUtils.toJson(convenioRequest), ContentType.APPLICATION_JSON));

      BoletoRepresentation output = HttpHelper.exchange(this.httpClient, httpPut, BoletoRepresentation.class);
      return output;
    } catch (PlugBoletoException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

}
