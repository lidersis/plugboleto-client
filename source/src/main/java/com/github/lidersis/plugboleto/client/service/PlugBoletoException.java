package com.github.lidersis.plugboleto.client.service;

import java.util.List;

import com.github.lidersis.plugboleto.client.Constants;
import com.github.lidersis.plugboleto.client.model.ErrorResponse;

public class PlugBoletoException extends RuntimeException {

  private static final long serialVersionUID = Constants.VERSION;

  private List<ErrorResponse> errorResponse;

  public PlugBoletoException(final List<ErrorResponse> errorResponse) {
    super(PlugBoletoException.toString(errorResponse));
    this.errorResponse = errorResponse;
  }

  public List<ErrorResponse> getErrorResponse() {
    return this.errorResponse;
  }

  private static final String toString(final List<ErrorResponse> errorResponse) {
    StringBuilder builder = new StringBuilder("Erros ao executar a operação: ");
    boolean first = true;
    for (ErrorResponse item : errorResponse) {
      if (first) {
        builder.append(" ,");
      }
      builder.append(item.getCampo() + " - " + item.getErro());
      first = false;
    }
    return builder.toString();
  }

}
