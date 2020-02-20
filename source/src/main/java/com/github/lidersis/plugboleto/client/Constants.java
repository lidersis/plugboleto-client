package com.github.lidersis.plugboleto.client;

public abstract class Constants {

  // 1.0.0
  public static final long VERSION = 100;
  
  // Tipo Impressao
  public static final Integer TIPO_IMPRESSAO_PDF_NORMAL = Integer.valueOf(0);

  public static final Integer TIPO_IMPRESSAO_PDF_CARNE_DUPLO = Integer.valueOf(1);

  public static final Integer TIPO_IMPRESSAO_PDF_CARNE_TRIPLO = Integer.valueOf(2);

  public static final Integer TIPO_IMPRESSAO_PDF_DUPLA = Integer.valueOf(3);

  public static final Integer TIPO_IMPRESSAO_PDF_NORMAL_COM_MARCA_DAGUA = Integer.valueOf(4);

  public static final Integer TIPO_IMPRESSAO_PDF_PERSONALIZADA = Integer.valueOf(99);

  private Constants() {
    //
  }

}
