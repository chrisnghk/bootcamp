package com.alcnhk.bootcamp.demo.demohelloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping(value = "/api/v1") // version 1 api rest)
public class HelloworldController {

  @GetMapping(value = "/helloworld")
  // @RequestMapping(method = RequestMethod.Get)
  public String helloworld() {
    return "Hello World!";
  }
}
