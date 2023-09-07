package com.hkjava.bootcamp;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SpyTest {

  @Spy
  Calculator calculator;

  @InjectMocks
  Checkout checkout;

  @Test
  void testAdd1(){
    when(calculator.substract(3,4)).thenReturn(100);
    int result = checkout.add(3,4);
    Assertions.assertEquals(104,result);
    verify(calculator,times(1)).substract(3,4);
  }

  @Test
  void testAdd2() {
    int result = checkout.add(3, 4);
    Assertions.assertEquals(3, result); // 4 +
  }
}
