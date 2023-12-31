package com.hkjava.demo.demofinnhub.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hkjava.demo.demofinnhub.controller.DataOperation;
import com.hkjava.demo.demofinnhub.entity.Stock;
import com.hkjava.demo.demofinnhub.service.CompanyService;

@RestController
@RequestMapping(value = "/api/v1")
public class DataController implements DataOperation {

  @Autowired
  private CompanyService companyService;

  @Override
  public List<Stock> findAll() {
    return companyService.findAll();
  }

  @Override
  public List<Stock> findAllById2(Long id) {
    return companyService.findAllById2(id);
  }

  @Override
  public List<Stock> findByCountryAndMarketCap(String country, double marketCap) {
    return companyService.findByCountryAndMarketCap(country, marketCap);
  }

  @Override
  public Stock save(Stock stock) {
    return companyService.save(stock);
  }

  @Override
  public void deleteById(Long id) {
    companyService.deleteById(id);
  }

  @Override
  public void updateById(Long id, Stock stock) {
    companyService.updateById(id, stock);
  }

  @Override
  public void updateCompanyNameById(Long id, String companyName) {
    companyService.updateCompanyNameById(id, companyName);
  }

  

}
