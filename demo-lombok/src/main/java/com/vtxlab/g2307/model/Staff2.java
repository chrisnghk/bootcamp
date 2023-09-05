package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@SuperBuilder
// @AllArgsConstructor
public class Staff2 extends Human {
  private double salary;

  // You have to manually code the constructor with parent's attribrate
  public Staff2(String name, double salary) {
    super(name);
    this.salary = salary;
  }

  public static void main(String[] args) {
    Staff2 s1 = new Staff2("John", 3000.0);
    Staff2 s2 = new Staff2("Peter", 3000.0);
    System.out.println(s1.equals(s2));

    Staff2 s3 = new Staff2("Peter",3000.0);
    System.out.println(s2.equals(s3));

    Staff2 s4 = Staff2.builder()
    .name("Mary")
    .salary(20000)
    .build();
  }

}
