package com.alcnhk.bootcamp.demoresttemplate.service;

import java.util.List;
import java.util.Optional;
import com.alcnhk.bootcamp.demoresttemplate.infra.BusinessException;
import com.alcnhk.bootcamp.demoresttemplate.model.User;

public interface UserService {

  List<User> findUsers() throws BusinessException;

  User findUser(int id);

  public String print();
}
