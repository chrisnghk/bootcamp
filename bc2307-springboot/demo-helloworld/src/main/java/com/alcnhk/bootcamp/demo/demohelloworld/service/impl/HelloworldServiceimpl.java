package com.alcnhk.bootcamp.demo.demohelloworld.service.impl;

import org.springframework.stereotype.Service;
import com.alcnhk.bootcamp.demo.demohelloworld.service.HelloworldService;

@Service
public class HelloworldServiceimpl implements HelloworldService {

  @Override
  public String generate(int x) {
    if (x > 100)
      return "hello world";
    return "ABC";
  }

}
