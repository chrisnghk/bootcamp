package com.alcnhk.bootcamp.demo.demohelloworld.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alcnhk.bootcamp.demo.demohelloworld.controller.HelloworldController;
import com.alcnhk.bootcamp.demo.demohelloworld.service.HelloworldService;

@Controller
@ResponseBody
@RequestMapping(value = "/api/v1") // version 1 api rest)
public class HelloworldControllerimpl implements HelloworldController {

  @Autowired
  HelloworldService helloworldService;

  @Override
  public String hello(){
    return helloworldService.generate(80);
  }
}