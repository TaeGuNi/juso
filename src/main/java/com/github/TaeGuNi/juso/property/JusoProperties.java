package com.github.TaeGuNi.juso.property;

import com.github.TaeGuNi.juso.module.JusoModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import lombok.Getter;

@Getter
public class JusoProperties {
  private final String apiKey;
  private final String url;

  @Inject
  public JusoProperties(
      @Named("api-key") String apiKey,
      @Named("url") String url) {
    this.apiKey = apiKey;
    this.url = url;
  }

  public static JusoProperties init() {
    return Guice.createInjector(new JusoModule()).getInstance(JusoProperties.class);
  }
}
