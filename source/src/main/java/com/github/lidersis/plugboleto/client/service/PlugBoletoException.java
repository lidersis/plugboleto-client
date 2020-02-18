package com.github.lidersis.plugboleto.client.service;

import java.util.List;

import com.github.lidersis.plugboleto.client.Constants;
import com.github.lidersis.plugboleto.client.model.ErrorRepresentation;
import com.google.common.base.Strings;

public class PlugBoletoException extends RuntimeException {

  private static final long serialVersionUID = Constants.VERSION;

  private List<ErrorRepresentation> errorResponse;

  public PlugBoletoException(final List<ErrorRepresentation> errorResponse) {
    super(PlugBoletoException.toString(errorResponse));
    this.errorResponse = errorResponse;
  }

  public List<ErrorRepresentation> getErrorResponse() {
    return this.errorResponse;
  }

  private static final String toString(final List<ErrorRepresentation> errorResponse) {
    StringBuilder builder = new StringBuilder("Erros ao executar a operação: ");
    boolean first = true;
    for (ErrorRepresentation item : errorResponse) {
      if (first) {
        builder.append(" ,");
      }
      if (!Strings.isNullOrEmpty(item.getCampo())) {
        builder.append(item.getCampo() + " - ");
      }
      builder.append(item.getErro());
      first = false;
    }
    return builder.toString();
  }

}
