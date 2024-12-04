package com.rental.backend.controller;


import com.rental.backend.entity.Customer;
import com.rental.backend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> getUsers() {
        return customerService.getAllUsers();
    }

    @PostMapping
    public Customer createUser(@RequestBody Customer customer) {
        return customerService.createUser(customer);
    }

    @GetMapping("/{id}")
    public Customer getUserById(@PathVariable Long id) {
        return customerService.getUserById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        customerService.deleteUser(id);
    }
}