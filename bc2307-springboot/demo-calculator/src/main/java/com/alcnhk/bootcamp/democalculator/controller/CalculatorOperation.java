package com.alcnhk.bootcamp.democalculator.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public interface CalculatorOperation {

  @GetMapping(value= "/strings")
  List<String> getStrings();
  
  // http://lovalhost:8080/api/v1/add?x=10&y=20
  @GetMapping(value = "/add")
  Integer add(@RequestParam(name = "x") int salary,
      @RequestParam(name = "y") int bonus, @RequestParam(name = "z",
          required = false, defaultValue = "100") String divdend,
      @RequestParam int k);

  // http://lovalhost:8080/api/v1/substract/10/20
  @GetMapping(value = {"/substract/{x}/{y}/{z}", "/substract/{x}/{y}"})
  Integer substract(@PathVariable(name = "x") int salary, @PathVariable int y,
      @PathVariable(required = false) String z);
}
