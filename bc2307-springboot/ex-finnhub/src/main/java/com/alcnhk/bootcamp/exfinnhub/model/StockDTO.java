package com.alcnhk.bootcamp.exfinnhub.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class StockDTO { // https://finnhub.io/api/v1/quote?symbol=AAPL&token=ck4fng1r01qus81pv5jgck4fng1r01qus81pv5k0
    public CompanyProfile companyProfile;
    public double currentPrice; // 'c
    public double dayHigh; // 'h
    public double dayLow; // 'l
    public double dayOpen;// 'o
    public double prevDayClose;// 'pc
}

