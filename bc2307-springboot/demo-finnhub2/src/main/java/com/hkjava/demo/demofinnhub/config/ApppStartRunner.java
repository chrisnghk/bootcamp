package com.hkjava.demo.demofinnhub.config;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.hkjava.demo.demofinnhub.entity.EQuote;
import com.hkjava.demo.demofinnhub.model.Quote;
import com.hkjava.demo.demofinnhub.repository.CompanyProfileRepository;
import com.hkjava.demo.demofinnhub.repository.QuoteRepository;


@Component
public class ApppStartRunner implements CommandLineRunner {

  @Autowired
  QuoteRepository quoteRepository;

  @Autowired
  CompanyProfileRepository companyProfileRepository;
  


  @Override
  public void run(String... args) {
    // Before Server Start:
    // 0.Get all symbols(US) from the below API.
    // 1 .Get Company Profile 2 and insert into database
    // 2. Get stock
    System.out.println("Server start....");
    EQuote quote = new EQuote();
    quote.setChange(1.1);
    quote.setCurrentPrice(1.1);
    quote.setDayHigh(1.1);
    quote.setDayLow(1.1);
    quote.setDayOpen(1.1);
    quote.setPercentChange(1.1);
    quote.setPrevDayClose(1.1);
    quote.setUnixtime(123131L);
    quoteRepository.save(quote);

  }
}
