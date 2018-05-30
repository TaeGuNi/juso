package com.github.TaeGuNi.juso.model;

import com.google.api.client.util.Key;
import java.util.Arrays;
import java.util.EnumSet;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Common {
  @Key("totalCount")
  private Integer totalCount;

  @Key("currentPage")
  private Integer currentPage;

  @Key("countPerPage")
  private Integer countPerPage;

  @Key("errorCode")
  private String errorCode;

  @Key("errorMessage")
  private String errorMessage;

  public ErrorCode getErrorCode() {
    for (ErrorCode v : ErrorCode.values()) {
      if (v.getValue().equals(errorCode)) {
        return v;
      }
    }
    return null;
  }

  public void setErrorCode(String errorCode) {
    log.info(errorCode);
    for (ErrorCode v : ErrorCode.values()) {
      if (v.getValue().equals(errorCode)) {
        this.errorCode = errorCode;
        return;
      }
    }
    this.errorCode = null;
  }
}
