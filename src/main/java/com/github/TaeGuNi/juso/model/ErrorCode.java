package com.github.TaeGuNi.juso.model;

import lombok.Getter;
import lombok.ToString;

/** ErrorCode */
@Getter
@ToString
public enum ErrorCode {
  /** 0 정상 */
  NORMAL("0"),
  /** -999 시스템에러 */
  ERROR("-999"),
  /** E0001 승인되지 않은 KEY 입니다. */
  E0001("E0001"),
  /** E0002 승인되지 않은 사이트 입니다. */
  E0002("E0002"),
  /** E0003 정상적인 경로로 접속하시기 바랍니다. */
  E0003("E0003"),
  /** E0005 검색어가 입력되지 않았습니다. */
  E0005("E0005"),
  /** E0006 주소를 상세히 입력해 주시기 바랍니다. */
  E0006("E0006"),
  /** E0008 검색어는 한글자 이상 입력되어야 합니다. */
  E0008("E0008"),
  /** E0009 검색어는 문자와 숫자 같이 입력되어야 합니다. (숫자만 검색 불가) */
  E0009("E0009"),
  /** E0010 검색어가 너무 깁니다. (한글40자, 영문,숫자 80자 이하) */
  E0010("E0010");

  private final String value;

  ErrorCode(String errorCode) {
    this.value = errorCode;
  }

  public Boolean equalsErrorCode(String errorCode) {
    return this.value.equals(errorCode);
  }
}
