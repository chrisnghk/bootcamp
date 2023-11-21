package com.hkjava.demo.demofinnhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hkjava.demo.demofinnhub.entity.ECompanyProfile;


public interface CompanyProfileRepository extends JpaRepository<ECompanyProfile,Long> {
  
}
