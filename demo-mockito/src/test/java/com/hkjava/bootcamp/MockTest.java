package com.hkjava.bootcamp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Unit test for simple App.
 */
@ExtendWith(MockitoExtension.class)
class MockTest {

  @Mock
  Calculator calculator;

  @InjectMocks
  Checkout checkout;

  @Test
  void testSubstract() {
    assertEquals(0, calculator.substract(10, 6));
  }

  @Test
    void testAdd(){
      when(calculator.substract(3, 4)).thenReturn(100);
      // Checkout checkout = new Checkout(calculator);
      //Testing Start
      int result = checkout.add(3,4); // Scenario: x > 1 
      assertEquals(104,result);
      verify(calculator, times(1)).substract(3, 4);
    }

  @Test
  void testAdd2() {
    lenient().when(calculator.substract(1, 4)).thenReturn(1000);
    // Checkout checkout = new Checkout(calculator);
    // Testing Start
    int result = checkout.add(1, 4); // Scenario: x <= 1
    assertEquals(5, result);
    verify(calculator, never()).substract(1, 4);

  }

  @Test
    void testMultiply(){
      lenient().when(calculator.substract(7, 9)).thenReturn(10000);
      when(calculator.multiply(7, 9)).thenReturn(10000);
      int result = checkout.multiply(7, 9); // Scenario: x <= 1
      assertEquals(10009,result);
    }

  @Test
    void testMultiply2(){
      when(calculator.substract(3, 8)).thenReturn(10000);;
      int result = checkout.multiply(3, 8); // Scenario: x <= 1
      assertEquals(8,result);
    }
}
