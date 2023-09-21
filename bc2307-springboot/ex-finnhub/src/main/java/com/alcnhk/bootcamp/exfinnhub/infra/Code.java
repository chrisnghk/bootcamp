package com.alcnhk.bootcamp.exfinnhub.infra;

import lombok.Getter;

@Getter
public enum Code {
  OK(20000,"OK"),
  NOTFOUND(40000,"Resource NOT FOUND"),
  FINNHUB_NOTFOUND(40001,"Finnhub RestClientException"),
  // Server
  SERVER_TIMEOUT(50000,"Server Timeout");

  int code;
  String desc;

  private Code(int code,String desc){
    this.code = code;
    this.desc = desc;
  }

  
  
}
