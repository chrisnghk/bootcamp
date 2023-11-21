package com.alcnhk.bootcamp.projectcryptocoingecko.services;

import java.util.List;
import com.alcnhk.bootcamp.projectcryptocoingecko.model.dto.coingecko.resp.SymbolDTO;

public interface MarketService {
  
  List<SymbolDTO> findaAll();
}
