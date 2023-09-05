package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@AllArgsConstructor // abstract class , can't create new object 
// @NoArgsConstructor
@EqualsAndHashCode
@SuperBuilder
public class Human {
 private String name;
  
}
