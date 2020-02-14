package com.github.lidersis.plugboleto.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class IConvClientLog {

  private static final String LOG_NAME = "br.com.lidersis.iconv.client";

  private static Logger log = LoggerFactory.getLogger(IConvClientLog.LOG_NAME);

  private IConvClientLog() {
    super();
  }

  public static Logger getLog() {
    return IConvClientLog.log;
  }

}
