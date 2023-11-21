package com.hkjava.demo.demofinnhub.entity;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "finnhub_quote")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class EQuote implements Serializable {
  @Id // primary key


  @Column(name = "c")
  private double currentPrice;

  @Column(name = "d")
  private double change;

  @Column(name = "dp")
  private double percentChange;

  @Column(name = "h")
  private double dayHigh;

  @Column(name = "l")
  private double dayLow;

  @Column(name = "o")
  private double dayOpen;

  @Column(name = "pc")
  private double prevDayClose;

  @Column(name = "t")
  private long unixtime;
}
