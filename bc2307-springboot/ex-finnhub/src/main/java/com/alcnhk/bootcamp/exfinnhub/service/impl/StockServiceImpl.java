package com.alcnhk.bootcamp.exfinnhub.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.alcnhk.bootcamp.exfinnhub.controller.StockOperation;
import com.alcnhk.bootcamp.exfinnhub.exception.FHException;
import com.alcnhk.bootcamp.exfinnhub.infra.BusinessException;
import com.alcnhk.bootcamp.exfinnhub.infra.Code;
import com.alcnhk.bootcamp.exfinnhub.infra.Protocol;
import com.alcnhk.bootcamp.exfinnhub.model.Profile2;
import com.alcnhk.bootcamp.exfinnhub.model.Quote;
import com.alcnhk.bootcamp.exfinnhub.service.StockService;

@Service
public class StockServiceImpl implements StockService {

  @Autowired
  private RestTemplate restTemplate;

  @Value(value = "${api.finnhub.domain}")
  private String finnhubDomain; // 

  @Value(value = "${api.finnhub.stockprofile2endpoints}")
  private String sPF2Endpoint; //

  @Value(value = "${api.finnhub.quoteendpoints}")
  private String qutoeEndpoint; //

    @Value(value = "${api.finnhub.api-token}")
  private String apiToken; //

  @Override
  public Quote findQuote(String symbol)throws BusinessException{
        String url = UriComponentsBuilder.newInstance() //
        .scheme("https") //
        .host(finnhubDomain)//
        .path(qutoeEndpoint)//
        .queryParam("symbol", symbol) //
        .queryParam("token", apiToken)
        .toUriString();

    // System.out.println("url = " + url);
    try{
      Quote quote = restTemplate.getForObject(url, Quote.class);
      return quote;
    }catch(RestClientException e){
      throw new FHException(Code.FINNHUB_NOTFOUND);
    }
  }

  @Override
  public Profile2 findStockProfile(String symbol){
        String url = UriComponentsBuilder.newInstance() //
        .scheme(Protocol.HTTPS.name()) //
        .host(finnhubDomain)//
        .path(sPF2Endpoint)//
        .queryParam("symbol", symbol) //
        .queryParam("token", apiToken)
        .toUriString();

    // System.out.println("url = " + url);
    return restTemplate.getForObject(url, Profile2.class);

  }

}
