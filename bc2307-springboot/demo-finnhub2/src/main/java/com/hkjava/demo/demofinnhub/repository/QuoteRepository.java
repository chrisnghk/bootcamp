package com.hkjava.demo.demofinnhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hkjava.demo.demofinnhub.entity.EQuote;

public interface QuoteRepository extends JpaRepository<EQuote,Long>{

}
  

