package com.alcnhk.bootcamp.demoresttemplate.exception;

import com.alcnhk.bootcamp.demoresttemplate.infra.BusinessException;
import com.alcnhk.bootcamp.demoresttemplate.infra.Code;

public class JPHException extends BusinessException {

  public JPHException(Code code) {
    super(code);
  }

}