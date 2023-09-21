package com.alcnhk.bootcamp.exfinnhub.model;
// https://finnhub.io/api/v1/quote?symbol=AAPL&token=ck4fng1r01qus81pv5jgck4fng1r01qus81pv5k0

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Quote {

    public double c;
    public double d;
    public double dp;
    public double h;
    public double l;
    public double o;
    public double pc;
    public int t;

}
