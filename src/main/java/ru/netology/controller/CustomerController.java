package ru.netology.controller;

import org.springframework.web.bind.annotation.*;
import ru.netology.entity.Customer;
import ru.netology.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class CustomerController {
    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/by-city")
    public List<Customer> getPersonsByCity(@RequestParam String city) {
        return customerRepository.findByCity(city);
    }

    @GetMapping("/by-age")
    public List<Customer> getPersonsByAge(@RequestParam int age) {
        return customerRepository.findByAgeLessThanOrderByAgeAsc(age);
    }

    @GetMapping("/by-name-surname")
    public Optional<Customer> getPersonByNameAndSurname(@RequestParam String name, @RequestParam String surname) {
        return customerRepository.findByNameAndSurname(name, surname);
    }

    @GetMapping("/all")
    public List<Customer> getAllPersons() {
        return customerRepository.findAll();
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    @DeleteMapping
    public void deleteCustomer(@RequestBody Customer customer) {
        customerRepository.delete(customer);
    }
}






