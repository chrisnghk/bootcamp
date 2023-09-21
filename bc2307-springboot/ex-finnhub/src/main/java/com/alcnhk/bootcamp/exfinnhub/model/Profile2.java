package com.alcnhk.bootcamp.exfinnhub.model;
// https://finnhub.io/api/v1/stock/profile2?symbol=AAPL&token=ck4fng1r01qus81pv5jgck4fng1r01qus81pv5k0

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Profile2 {

  public String country;
  public String currency;
  public String exchange;
  public String ipo;
  public int marketCapitalization;
  public String name;
  public String phone;
  public double shareOutstanding;
  public String ticker;
  public String weburl;
  public String logo;
  public String finnhubIndustry;
}
