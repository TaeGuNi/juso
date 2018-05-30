package com.github.TaeGuNi.juso.model;

import com.google.api.client.util.Key;
import java.util.List;
import lombok.Data;

@Data
public class Results {
  @Key("common")
  private Common common;

  @Key("juso")
  private List<Juso> jusoList;
}
