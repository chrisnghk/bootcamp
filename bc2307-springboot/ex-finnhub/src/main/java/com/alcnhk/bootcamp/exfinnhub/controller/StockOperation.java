package com.alcnhk.bootcamp.exfinnhub.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.alcnhk.bootcamp.exfinnhub.infra.ApiResponse;
import com.alcnhk.bootcamp.exfinnhub.model.Profile2;
import com.alcnhk.bootcamp.exfinnhub.model.Quote;
import com.alcnhk.bootcamp.exfinnhub.model.StockDTO;

public interface StockOperation {

    @GetMapping(value = "/findQuote")
    public ResponseEntity<ApiResponse<Quote>> findQuote(String Symbol) throws Exception;

    @GetMapping(value = "/findProfile")
    public Profile2 findStockProfile(String symbol);

    @GetMapping(value = "/stock")
    ResponseEntity<ApiResponse<StockDTO>> findStockDTO(String symbol)
            throws Exception;

}
