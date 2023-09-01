package com.vtxlab.g2307.model;

public class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public static void main(String[] arg) {
    Person person = new Person("Peter", 30);
  }

}


