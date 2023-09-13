package com.alcnhk.bootcamp;


import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static com.alcnhk.bootcamp.UppercaseMatcher.*;

import org.junit.jupiter.api.Test;
public class CustomerMatcherTest {
  @Test
  void CustomMatcherTest() {
    String str = "HELLOWORLD";
    String str2 = "HELLO world";
    String str3 = "hello world";

    assertThat(str, containUppercaseOnly());
    assertThat(str2, not(containUppercaseOnly()));
    assertThat(str3, not(containUppercaseOnly()));
  }
}
