package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor // annotaion
@NoArgsConstructor
@Setter
@Getter
@ToString(onlyExplicitlyIncluded = true)

public class PersonLombok {
  @ToString.Include
  private String name;
  private int age;



  public static void main(String[] arg) {
    PersonLombok personlombok = new PersonLombok("Peter", 30);
    PersonLombok p2 = new PersonLombok();
    p2.setAge(13);
    p2.setName("Eric");
    System.out.println(p2.getAge());
    System.out.println(p2.getName());
    System.out.println(p2.toString());
  }

}
