package com.alcnhk.bootcamp.demoresttemplate.exception;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.alcnhk.bootcamp.demoresttemplate.infra.ApiResponse;
import com.alcnhk.bootcamp.demoresttemplate.infra.BusinessException;
import com.alcnhk.bootcamp.demoresttemplate.infra.Code;
import com.alcnhk.bootcamp.demoresttemplate.model.UserDTO;

@RestControllerAdvice // @ResponseBody + @ ControllerAdvice
public class GlobalExceptionHander {

  @ExceptionHandler(value = JPHException.class)
  public ResponseEntity<ApiResponse<List<UserDTO>>> getUserExceptionHandler() {
    ApiResponse<List<UserDTO>> response = ApiResponse.<List<UserDTO>>builder() //
        .status(Code.JPH_NOTFOUND) //
        .data(null) //
        .build();
    return ResponseEntity.badRequest().body(response);

  }
}
