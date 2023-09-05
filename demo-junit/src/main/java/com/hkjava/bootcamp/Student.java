package com.hkjava.bootcamp;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;


// @NoArgsConstructor
public class Student {
  @NonNull List<Subject> subjects;

  public Student(){
    this.subjects = new ArrayList<>();
  }

  public List<Subject>getSubjects(){
    return this.subjects;
  }
}
