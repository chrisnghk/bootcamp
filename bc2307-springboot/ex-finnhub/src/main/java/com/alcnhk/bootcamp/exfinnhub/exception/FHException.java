package com.alcnhk.bootcamp.exfinnhub.exception;

import com.alcnhk.bootcamp.exfinnhub.infra.BusinessException;
import com.alcnhk.bootcamp.exfinnhub.infra.Code;

public class FHException extends BusinessException{

  public FHException(Code code){
        super(code);
  }
  
}
