package com.github.lidersis.plugboleto.client.test;

import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class HttpsIgnoreValidation {

  private static boolean status = false;

  public static void configure() throws Exception {
    if (HttpsIgnoreValidation.status) {
      return;
    }

    System.out.println("Configuring HTTPS...");

    // Create a trust manager that does not validate certificate chains
    TrustManager[] trustAllCerts = new TrustManager[] {new X509TrustManager() {

      @Override
      public java.security.cert.X509Certificate[] getAcceptedIssuers() {
        return null;
      }

      @Override
      public void checkClientTrusted(final X509Certificate[] certs, final String authType) {
        //
      }

      @Override
      public void checkServerTrusted(final X509Certificate[] certs, final String authType) {
        //
      }

    }};

    // Install the all-trusting trust manager
    SSLContext sc = SSLContext.getInstance("SSL");
    sc.init(null, trustAllCerts, new java.security.SecureRandom());
    HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

    // Create all-trusting host name verifier
    HostnameVerifier allHostsValid = new HostnameVerifier() {

      @Override
      public boolean verify(final String hostname, final SSLSession session) {
        return true;
      }
    };

    // Install the all-trusting host verifier
    HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);

    HttpsIgnoreValidation.status = true;
  }

}
