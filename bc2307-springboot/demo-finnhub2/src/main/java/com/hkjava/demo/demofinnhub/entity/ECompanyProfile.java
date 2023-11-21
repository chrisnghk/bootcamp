package com.hkjava.demo.demofinnhub.entity;

import java.io.Serializable;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonProperty;
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
@Table(name = "finnhub_companyprofile")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder


public class ECompanyProfile implements Serializable {
  @Id // primary key
 
  private String country;

  private String currency;

  private String estimateCurrency;

  private String exchange;

  private String finnhubIndustry;

  @Column(name = "ipo")
  private LocalDate ipoDate;

  private String logo;

  @Column(name = "marketCapitalization")
  private double marketCap;

  @Column(name = "name")
  private String companyName;

  private String phone;

  private double shareOutstanding;

  private String ticker;

  private String weburl;

}
