package com.currencycloud.pp;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for {@link RomanNumeralConverter}.
 */
public final class RomanNumeralConverterTest {
  @Test
  public void convert_i_returns1() {
    assertEquals(1, RomanNumeralConverter.convert("i"));
  }
}