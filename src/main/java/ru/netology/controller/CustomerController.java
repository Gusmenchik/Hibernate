package ru.netology.controller;

import ru.netology.entity.Customer;
import ru.netology.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/persons/by-city")
    public List<Customer> getPersonsByCity(@RequestParam String city) {
        return customerRepository.findByCity(city);
    }
}

