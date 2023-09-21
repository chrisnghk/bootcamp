package com.alcnhk.bootcamp.exfinnhub.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alcnhk.bootcamp.exfinnhub.controller.StockOperation;
import com.alcnhk.bootcamp.exfinnhub.infra.ApiResponse;
import com.alcnhk.bootcamp.exfinnhub.infra.Code;
import com.alcnhk.bootcamp.exfinnhub.mapper.StockMapper;
import com.alcnhk.bootcamp.exfinnhub.model.CompanyProfile;
import com.alcnhk.bootcamp.exfinnhub.model.Profile2;
import com.alcnhk.bootcamp.exfinnhub.model.Quote;
import com.alcnhk.bootcamp.exfinnhub.model.StockDTO;
import com.alcnhk.bootcamp.exfinnhub.service.StockService;

@RestController
@RequestMapping(value = "/api/v1")
public class StockController implements StockOperation {

  @Autowired
  private StockService stockService;

  @Override
  public ResponseEntity<ApiResponse<Quote>> findQuote(String Symbol)
      throws Exception {
    Quote quote = stockService.findQuote(Symbol);
    if ( quote == null){
      ApiResponse<Quote> response = ApiResponse.<Quote>builder()//
      .status(Code.FINNHUB_NOTFOUND).data(quote)//
      .build();//
      return ResponseEntity.badRequest().body(response);
    }
    ApiResponse<Quote> response = ApiResponse.<Quote>builder()
    .ok().data(quote)//
    .build();
    return ResponseEntity.ok().body(response);
  }

  @Override
  public Profile2 findStockProfile(String Symbol) {
    return stockService.findStockProfile(Symbol);
  }

  @Override
  public ResponseEntity<ApiResponse<StockDTO>> findStockDTO(String symbol)
      throws Exception {
    StockDTO stockDto = StockMapper.map(stockService.findQuote(symbol),
        stockService.findStockProfile(symbol));
    ApiResponse<StockDTO> response = ApiResponse.<StockDTO>builder()//
        .ok() //
        .data(stockDto) //
        .build(); //
    return ResponseEntity.badRequest().body(response);
  }
}
