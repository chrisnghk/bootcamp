package com.alcnhk.bootcamp;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class TotoranceTest {

  @Test
  void test(){
    double expected = 3.14;
    double tolerance = 0.01;
    assertThat(3.14159,closeTo(expected, tolerance));
    assertThat(3.14999,closeTo(expected, tolerance));
    assertThat(3.15001,not(closeTo(expected, tolerance)));
    assertThat(3.13001,closeTo(expected, tolerance));
    assertThat(3.13001,closeTo(expected, tolerance));
    assertThat(3.15000,closeTo(expected, tolerance));
    assertThat(3.13000,not(closeTo(expected, tolerance)));
  }
  
  
}
