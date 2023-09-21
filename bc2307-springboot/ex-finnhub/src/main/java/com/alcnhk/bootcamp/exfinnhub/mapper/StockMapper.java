package com.alcnhk.bootcamp.exfinnhub.mapper;

import com.alcnhk.bootcamp.exfinnhub.model.CompanyProfile;
import com.alcnhk.bootcamp.exfinnhub.model.Profile2;
import com.alcnhk.bootcamp.exfinnhub.model.Quote;
import com.alcnhk.bootcamp.exfinnhub.model.StockDTO;

public class StockMapper {
  public static StockDTO map(Quote quote,Profile2 profile2){
    CompanyProfile companyProfile = new CompanyProfile();
    companyProfile.setCountry(profile2.getCountry());
    companyProfile.setCompanyName(profile2.getName());
    companyProfile.setIpoDate(profile2.getIpo());
    companyProfile.setLogo(profile2.getLogo());
    companyProfile.setMarketCap(profile2.getMarketCapitalization());
    companyProfile.setCurrency(profile2.getCurrency());
    return StockDTO.builder() //
    .currentPrice(quote.getC())//
    .dayHigh(quote.getH())//
    .dayLow(quote.getL())//
    .dayOpen(quote.getO())//
    .prevDayClose(quote.getPc())//
    .companyProfile(companyProfile)
    .build();
    
  }
}


/*
 * class Stock{ // https://finnhub.io/api/v1/quote?symbol=AAPL&token=ck4fng1r01qus81pv5jgck4fng1r01qus81pv5k0
    public CompanyProfile companyProfile; 
    public double currentPrice; // 'c
    public double dayHigh; //'h
    public double dayLow; // 'l
    public double dayOpen;// 'o
    public double prevDayClose;// 'pc
}

class CompanyProfile{ // https://finnhub.io/api/v1/stock/profile2?symbol=AAPL&token=ck4fng1r01qus81pv5jgck4fng1r01qus81pv5k0
    public String country; //  'country
    public String companyName; // 'name
    public String ipoDate; // 'ipo
    public String logo; //  'logo
    public int marketCap; // 'marketCapitalization
    public String currency; //'currency
}
 */

