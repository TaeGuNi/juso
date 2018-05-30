package com.github.TaeGuNi.juso.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Request {
  @Builder.Default private Integer currentPage = 1;
  @Builder.Default private Integer countPerPage = 10;
  private String keyword;
  private String confmKey;
}
