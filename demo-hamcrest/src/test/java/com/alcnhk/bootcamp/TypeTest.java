package com.alcnhk.bootcamp;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class TypeTest {
  @Test
  void testType(){
    Object object ="Hello World";
    assertThat(object, instanceOf(String.class));
    assertThat(object,not(instanceOf(Integer.class)));
  }

  @Test
  void testIfClassCompatibleWith(){
    assertThat(Integer.class,is(typeCompatibleWith(Number.class)));
    assertThat(Integer.class,is(typeCompatibleWith(Object.class)));
    assertThat(Number.class,is(not(typeCompatibleWith(Integer.class))));
  }
}
