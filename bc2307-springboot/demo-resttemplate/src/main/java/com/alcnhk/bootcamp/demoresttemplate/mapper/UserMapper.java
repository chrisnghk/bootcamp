package com.alcnhk.bootcamp.demoresttemplate.mapper;

import com.alcnhk.bootcamp.demoresttemplate.model.User;
import com.alcnhk.bootcamp.demoresttemplate.model.UserDTO;

public class UserMapper {

  public static UserDTO map(User user) {
    return UserDTO.builder() //
        .id(user.getId()) //
        .name(user.getName()) //
        .username(user.getUsername()) //
        .build();
  }
}