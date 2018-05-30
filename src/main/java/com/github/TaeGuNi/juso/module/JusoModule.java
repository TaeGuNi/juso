package com.github.TaeGuNi.juso.module;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JusoModule extends AbstractModule {
  @Override
  protected void configure() {
    Properties defaults = new Properties();
    defaults.setProperty("api-key", "TESTJUSOGOKR");
    defaults.setProperty("url", "http://www.juso.go.kr/addrlink/addrLinkApi.do");

    InputStream is = null;
    try {
      Properties properties = new Properties(defaults);
      is = getClass().getClassLoader().getResourceAsStream("juso.properties");
      if (is != null) {
        properties.load(is);
        log.info(properties.toString());
        Names.bindProperties(binder(), properties);
      }
    } catch (IOException e) {
      log.error("Error", e);
    } finally{
      if (is != null) {
        try{
          is.close();
        } catch (IOException ignored) {}
      } else {
        Names.bindProperties(binder(), defaults);
      }
    }
  }
}
