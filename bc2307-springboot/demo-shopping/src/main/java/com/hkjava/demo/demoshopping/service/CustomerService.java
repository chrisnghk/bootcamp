package com.hkjava.demo.demoshopping.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import com.hkjava.demo.demoshopping.model.Customer;

public interface CustomerService {
  
  Customer create(String name, String email, LocalDate dob);

  List<Customer> findAll();

  Optional<Customer> find(long id);

  Customer create(Customer customer);

  Customer remove(long id);

  Customer update(long id, Customer customer);

  Customer patchEmail(long id, String email);

  Customer patchName(long id, String name);
}
