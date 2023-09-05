package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor // The minimal args to create Student Object
@AllArgsConstructor
public class Student {
  // no final and no @NonNull attribute in this class
  private int age;

  public static void main(String[] args) {
    Student student = new Student(); // come from RequiredArgsConstructor 
    Student s2 = new Student(10);
  }
  
}
