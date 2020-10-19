package com.springframework.springmvcrest.service;

import com.springframework.springmvcrest.domain.Customer;

import java.util.List;

public interface CustomerService {
    Customer findCustomerById(Long id);
    List<Customer> finAllCustomers();
}
