package com.rental.backend.service;


import com.rental.backend.entity.Customer;
import com.rental.backend.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllUsers() {
        return customerRepository.findAll();
    }

    public Customer createUser(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer getUserById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    public void deleteUser(Long id) {
        customerRepository.deleteById(id);
    }
}