package com.hkjava.bootcamp;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Calculator {

  private int weight;

  public int substract(int x, int y) {
    return y - x - this.weight;
  }

  public int multiply(int x, int y) {
    return x * y;
  }
}
