package com.alcnhk.bootcamp.demohello2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/api/v1")
@ResponseBody
public class HelloWorldController {

  @GetMapping(value = "/hello")
  public String helloword(){
    return "Hello";
  }
}
