package com.alcnhk.bootcamp.projectcryptocoingecko.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import com.alcnhk.bootcamp.projectcryptocoingecko.model.dto.coingecko.resp.SymbolDTO;

public interface MarketOperation {
  
  @GetMapping(value = "/coin/market")
  List<SymbolDTO> findaAll();
}
