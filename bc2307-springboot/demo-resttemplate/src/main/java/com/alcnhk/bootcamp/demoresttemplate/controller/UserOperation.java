package com.alcnhk.bootcamp.demoresttemplate.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.alcnhk.bootcamp.demoresttemplate.infra.ApiResponse;
import com.alcnhk.bootcamp.demoresttemplate.infra.BusinessException;
import com.alcnhk.bootcamp.demoresttemplate.model.User;
import com.alcnhk.bootcamp.demoresttemplate.model.UserDTO;
import org.springframework.web.bind.annotation.RequestParam;


public interface UserOperation {
  
  @GetMapping(value ="/findUsers")
  ResponseEntity<ApiResponse<List<User>>> findUsers()  throws Exception ;

  @GetMapping(value ="/findUser/{id}")
  public User findUser(@PathVariable(name = "id") int id);

  @GetMapping(value = "/users")
  ResponseEntity<ApiResponse<List<UserDTO>>> findUsersDTO() throws Exception;


  @GetMapping(value="/test")
  public List<String> test();

  @GetMapping(value="/print")
  public String print();
  
}
