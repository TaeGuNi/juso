package com.github.TaeGuNi.juso.api;

import com.github.TaeGuNi.juso.model.Request;
import com.github.TaeGuNi.juso.model.Results;
import com.github.TaeGuNi.juso.property.JusoProperties;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.xml.XmlNamespaceDictionary;
import com.google.api.client.xml.XmlObjectParser;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Call {
  public Results result(Request request)
      throws IOException, InvocationTargetException, IllegalAccessException {
    final JusoProperties properties = JusoProperties.init();

    request.setConfmKey(properties.getApiKey());

    GenericUrl url = new GenericUrl(properties.getUrl());
    convertObjectToMap(request).forEach(url::set);

    log.info(url.toString());

    HttpRequestFactory requestFactory = new NetHttpTransport().createRequestFactory();
    HttpRequest httpRequest = requestFactory.buildGetRequest(url);
    httpRequest.setParser(new XmlObjectParser(new XmlNamespaceDictionary().set("", "")));

    Results results = httpRequest.execute().parseAs(Results.class);
    log.info(results.toString());

    return results;
  }

  public Results result(String keyword)
      throws IllegalAccessException, IOException, InvocationTargetException {
    return result(Request.builder().keyword(keyword).build());
  }

  private Map<String, Object> convertObjectToMap(Object obj)
      throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    Method[] methods = obj.getClass().getMethods();

    Map<String, Object> map = new HashMap<>();
    for (Method m : methods) {
      if (m.getName().startsWith("get") && !m.getName().startsWith("getClass")) {
        Object value = m.invoke(obj);
        String key = m.getName().substring(3, 4).toLowerCase() + m.getName().substring(4);
        map.put(key, value);
      }
    }
    return map;
  }
}
