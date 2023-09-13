package com.alcnhk.bootcamp.democalculator.service;

import java.util.List;

public interface CalculatorService {
  /**
   * 
   * @return
   */
  List<String> getStrings();


  /**
   * 
   * @param x
   * @param y
   * @return
   */
  int add(int x, int y);

  /**
   * 
   * @param x - A int value
   * @param y - B int value
   * @return - return x -y
   */
  int substract(int x, int y);
}
