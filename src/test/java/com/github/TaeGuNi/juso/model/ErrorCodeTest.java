package com.github.TaeGuNi.juso.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Slf4j
@RunWith(JUnitPlatform.class)
class ErrorCodeTest {
  @Test
  @DisplayName("NORMAL")
  void normalTest() {
    final ErrorCode errorCode = ErrorCode.NORMAL;
    final String value1 = "0";
    final String value2 = "TEST";

log.debug(errorCode.getValue());
    assertEquals(errorCode.getValue(), value1);
    assertNotEquals(errorCode.getValue(), value2);

    log.debug(String.valueOf(errorCode.equalsErrorCode(value1)));
    assertTrue(errorCode.equalsErrorCode(value1));
    assertFalse(errorCode.equalsErrorCode(value2));
  }

  @Test
  @DisplayName("ERROR")
  void errorTest() {
    final ErrorCode errorCode = ErrorCode.ERROR;
    final String value1 = "-999";
    final String value2 = "TEST";

log.debug(errorCode.getValue());
    assertEquals(errorCode.getValue(), value1);
    assertNotEquals(errorCode.getValue(), value2);

    log.debug(String.valueOf(errorCode.equalsErrorCode(value1)));
    assertTrue(errorCode.equalsErrorCode(value1));
    assertFalse(errorCode.equalsErrorCode(value2));
  }

  @Test
  @DisplayName("E0001")
  void e0001Test() {
    final ErrorCode errorCode = ErrorCode.E0001;
    final String value1 = "E0001";
    final String value2 = "TEST";

log.debug(errorCode.getValue());
    assertEquals(errorCode.getValue(), value1);
    assertNotEquals(errorCode.getValue(), value2);

    log.debug(String.valueOf(errorCode.equalsErrorCode(value1)));
    assertTrue(errorCode.equalsErrorCode(value1));
    assertFalse(errorCode.equalsErrorCode(value2));
  }

  @Test
  @DisplayName("E0002")
  void e0002Test() {
    final ErrorCode errorCode = ErrorCode.E0002;
    final String value1 = "E0002";
    final String value2 = "TEST";

log.debug(errorCode.getValue());
    assertEquals(errorCode.getValue(), value1);
    assertNotEquals(errorCode.getValue(), value2);

    log.debug(String.valueOf(errorCode.equalsErrorCode(value1)));
    assertTrue(errorCode.equalsErrorCode(value1));
    assertFalse(errorCode.equalsErrorCode(value2));
  }

  @Test
  @DisplayName("E0003")
  void e0003Test() {
    final ErrorCode errorCode = ErrorCode.E0003;
    final String value1 = "E0003";
    final String value2 = "TEST";

log.debug(errorCode.getValue());
    assertEquals(errorCode.getValue(), value1);
    assertNotEquals(errorCode.getValue(), value2);

    log.debug(String.valueOf(errorCode.equalsErrorCode(value1)));
    assertTrue(errorCode.equalsErrorCode(value1));
    assertFalse(errorCode.equalsErrorCode(value2));
  }

  @Test
  @DisplayName("E0005")
  void e0005Test() {
    final ErrorCode errorCode = ErrorCode.E0005;
    final String value1 = "E0005";
    final String value2 = "TEST";

log.debug(errorCode.getValue());
    assertEquals(errorCode.getValue(), value1);
    assertNotEquals(errorCode.getValue(), value2);

    log.debug(String.valueOf(errorCode.equalsErrorCode(value1)));
    assertTrue(errorCode.equalsErrorCode(value1));
    assertFalse(errorCode.equalsErrorCode(value2));
  }

  @Test
  @DisplayName("E0006")
  void e0006Test() {
    final ErrorCode errorCode = ErrorCode.E0006;
    final String value1 = "E0006";
    final String value2 = "TEST";

log.debug(errorCode.getValue());
    assertEquals(errorCode.getValue(), value1);
    assertNotEquals(errorCode.getValue(), value2);

    log.debug(String.valueOf(errorCode.equalsErrorCode(value1)));
    assertTrue(errorCode.equalsErrorCode(value1));
    assertFalse(errorCode.equalsErrorCode(value2));
  }

  @Test
  @DisplayName("E0008")
  void e0008Test() {
    final ErrorCode errorCode = ErrorCode.E0008;
    final String value1 = "E0008";
    final String value2 = "TEST";

log.debug(errorCode.getValue());
    assertEquals(errorCode.getValue(), value1);
    assertNotEquals(errorCode.getValue(), value2);

    log.debug(String.valueOf(errorCode.equalsErrorCode(value1)));
    assertTrue(errorCode.equalsErrorCode(value1));
    assertFalse(errorCode.equalsErrorCode(value2));
  }

  @Test
  @DisplayName("E0009")
  void e0009Test() {
    final ErrorCode errorCode = ErrorCode.E0009;
    final String value1 = "E0009";
    final String value2 = "TEST";

log.debug(errorCode.getValue());
    assertEquals(errorCode.getValue(), value1);
    assertNotEquals(errorCode.getValue(), value2);

    log.debug(String.valueOf(errorCode.equalsErrorCode(value1)));
    assertTrue(errorCode.equalsErrorCode(value1));
    assertFalse(errorCode.equalsErrorCode(value2));
  }

  @Test
  @DisplayName("E0010")
  void e0010Test() {
    final ErrorCode errorCode = ErrorCode.E0010;
    final String value1 = "E0010";
    final String value2 = "TEST";

    log.debug(errorCode.getValue());
    assertEquals(errorCode.getValue(), value1);
    assertNotEquals(errorCode.getValue(), value2);

    log.debug(String.valueOf(errorCode.equalsErrorCode(value1)));
    assertTrue(errorCode.equalsErrorCode(value1));
    assertFalse(errorCode.equalsErrorCode(value2));
  }
}
