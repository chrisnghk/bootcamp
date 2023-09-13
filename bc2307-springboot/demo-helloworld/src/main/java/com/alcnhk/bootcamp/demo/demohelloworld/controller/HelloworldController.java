package com.alcnhk.bootcamp.demo.demohelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface HelloworldController {

  @GetMapping(value = "/hello")
  // @RequestMapping(method = RequestMethod.Get)
   public String hello(); 

}
