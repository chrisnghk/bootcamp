package com.alcnhk.bootcamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class CollectionTest {
  @Test
  void testList(){
    List<String> strings = Arrays.asList("apple","banana","cherry");
    assertThat(strings,hasItem("cherry"));
    assertThat(strings,hasItems("cherry","apple"));
    assertThat(strings,hasSize(3));
    // number of item + ordering
    assertThat(strings,contains("apple","banana","cherry"));
    assertThat(strings,not(contains("cherry","banana","apple")));
    assertThat(strings,not(contains("apple","cherrry")));
    // number of item + ignore ordering 
    assertThat(strings,containsInAnyOrder("apple","cherry","banana"));
    assertThat(strings,not(containsInAnyOrder("apple","banana")));

    List<String> emtpylist = new ArrayList<>();
    assertThat(emtpylist,empty());



  }
}
