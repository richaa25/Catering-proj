package com.Catering.Catering.project.service;

import java.util.List;

import com.Catering.Catering.project.entity.Customer;

public interface CustomerService {
    Customer getCustomerById(Long id);
    Customer createCustomer(Customer customer);
    List<Customer> getAllCustomers();
}

