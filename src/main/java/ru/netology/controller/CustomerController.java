package ru.netology.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.entity.Customer;
import ru.netology.repository.CustomerRepository;

import java.util.List;

@RestController
public class CustomerController {
    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/persons/by-city")
    public List<Customer> getPersonsByCity(@RequestParam String city) {
        List<Customer> customers = customerRepository.getPersonsByCity(city);
        return customers;
    }

    @GetMapping("/persons/all")
    public List<Customer> getAllPersons() {
        return customerRepository.findAll();
    }
}





