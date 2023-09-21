package com.alcnhk.bootcamp.exfinnhub.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompanyProfile { // https://finnhub.io/api/v1/stock/profile2?symbol=AAPL&token=ck4fng1r01qus81pv5jgck4fng1r01qus81pv5k0
    public String country; // 'country
    public String companyName; // 'name
    public String ipoDate; // 'ipo
    public String logo; // 'logo
    public int marketCap; // 'marketCapitalization
    public String currency; // 'currency
}


