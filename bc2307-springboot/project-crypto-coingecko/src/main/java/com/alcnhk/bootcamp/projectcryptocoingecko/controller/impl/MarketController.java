package com.alcnhk.bootcamp.projectcryptocoingecko.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alcnhk.bootcamp.projectcryptocoingecko.controller.MarketOperation;
import com.alcnhk.bootcamp.projectcryptocoingecko.model.dto.coingecko.resp.SymbolDTO;

@RestController
@RequestMapping(value = "/api/v1/")
public class MarketController implements MarketOperation {

  @Autowired
  private MarketService MarketService;

  @Override
  public List<SymbolDTO> findAll(){
    return marketService.findAll();
  }

}
