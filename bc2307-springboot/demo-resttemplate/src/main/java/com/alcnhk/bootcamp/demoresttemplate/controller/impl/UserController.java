package com.alcnhk.bootcamp.demoresttemplate.controller.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alcnhk.bootcamp.demoresttemplate.controller.UserOperation;
import com.alcnhk.bootcamp.demoresttemplate.infra.ApiResponse;
import com.alcnhk.bootcamp.demoresttemplate.infra.BusinessException;
import com.alcnhk.bootcamp.demoresttemplate.infra.Code;
import com.alcnhk.bootcamp.demoresttemplate.mapper.UserMapper;
import com.alcnhk.bootcamp.demoresttemplate.model.User;
import com.alcnhk.bootcamp.demoresttemplate.model.UserDTO;
import com.alcnhk.bootcamp.demoresttemplate.service.UserService;

@RestController
@RequestMapping(value = "/api/v1")
public class UserController implements UserOperation {

  @Autowired
  UserService userService;

  @Override
  public ResponseEntity<ApiResponse<List<User>>> findUsers()
      throws Exception  {
    List<User> users = userService.findUsers();
    if (users == null) {
      ApiResponse<List<User>> response = ApiResponse.<List<User>>builder()
          .status(Code.JPH_NOTFOUND).data(userService.findUsers()) //
          .build(); //
      return ResponseEntity.badRequest().body(response);
    }
    ApiResponse<List<User>> response = ApiResponse.<List<User>>builder()
        // .code(Code.OK.getCode())
        // .message(Code.OK.getDesc())
        // .status(Code.OK) // .ok()
        .ok().data(userService.findUsers()) //
        .build(); //
    return ResponseEntity.ok().body(response);
  }

  @Override
  public ResponseEntity<ApiResponse<List<UserDTO>>> findUsersDTO()
      throws Exception   {
    List<User> users = userService.findUsers();

    // Conversion (user -> userDTO)
    List<UserDTO> userDTOs = users.stream() //
        .map(user -> UserMapper.map(user)) //
        .collect(Collectors.toList());

    ApiResponse<List<UserDTO>> response = ApiResponse.<List<UserDTO>>builder() //
        .ok() //
        .data(userDTOs) //
        .build();
    return ResponseEntity.ok().body(response);
  }


  @Override
  public User findUser(int id) {
    return userService.findUser(id);
  }



  @Override
  public List<String> test() {
    return List.of(new String("John"), new String("Smith"));
  }

  @Override
  public String print() {
    return userService.print();
  }
}
