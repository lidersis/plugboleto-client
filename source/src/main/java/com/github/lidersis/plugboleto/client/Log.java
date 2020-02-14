package com.github.lidersis.plugboleto.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Log {

  private static final String LOG_NAME = "com.github.lidersis.plugboleto.client";

  private static Logger log = LoggerFactory.getLogger(Log.LOG_NAME);

  private Log() {
    super();
  }

  public static Logger getLog() {
    return Log.log;
  }

}
