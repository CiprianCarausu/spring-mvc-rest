package com.springframework.springmvcrest.service;

import com.springframework.springmvcrest.domain.Customer;
import com.springframework.springmvcrest.repositories.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    private final CustomerRepository customerRepository;


    @Override
    public Customer findCustomerById(Long id) {
        return customerRepository.getOne(id);
    }

    @Override
    public List<Customer> finAllCustomers() {
        return customerRepository.findAll();
    }
}
