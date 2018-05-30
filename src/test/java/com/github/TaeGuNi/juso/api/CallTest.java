package com.github.TaeGuNi.juso.api;

import static org.junit.jupiter.api.Assertions.*;

import com.github.TaeGuNi.juso.model.Results;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Slf4j
@RunWith(JUnitPlatform.class)
class CallTest {
  @Test
  @DisplayName("Request")
  void requestTest() throws Exception {
    Results results = new Call().result("강서로7길");
    assertTrue(results.getJusoList().size() > 0);
  }
}
