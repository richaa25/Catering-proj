package com.Catering.Catering.project.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Catering.Catering.project.entity.Customer;
import com.Catering.Catering.project.repo.CustomerRepo;
import com.Catering.Catering.project.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepo customerRepository;

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}