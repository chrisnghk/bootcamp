package com.alcnhk.bootcamp.exfinnhub.service;

import com.alcnhk.bootcamp.exfinnhub.infra.BusinessException;
import com.alcnhk.bootcamp.exfinnhub.model.Profile2;
import com.alcnhk.bootcamp.exfinnhub.model.Quote;

public interface StockService {
  
  Quote findQuote(String symbol)throws BusinessException;

  Profile2 findStockProfile(String symbol);
}
