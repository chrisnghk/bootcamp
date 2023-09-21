package com.alcnhk.bootcamp.exfinnhub.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.alcnhk.bootcamp.exfinnhub.infra.ApiResponse;
import com.alcnhk.bootcamp.exfinnhub.infra.Code;
import com.alcnhk.bootcamp.exfinnhub.model.StockDTO;

@RestControllerAdvice
public class GlobalExceptionHander {
  
  @ExceptionHandler(value = FHException.class)
  public ResponseEntity<ApiResponse<StockDTO>> getUserExceptionHandler(){
    ApiResponse<StockDTO> response = ApiResponse.<StockDTO>builder()
    .status(Code.FINNHUB_NOTFOUND)//
    .data(null)//
    .build();
    return ResponseEntity.ok().body(response);
  }
}
