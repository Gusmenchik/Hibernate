package ru.netology.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.netology.entity.Customer;
import ru.netology.entity.CustomerId;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, CustomerId> {

    // Метод для получения списка клиентов по городу
    List<Customer> findByCity(String city);

    // Метод для получения списка клиентов по возрасту, отсортированного по возрастанию
    List<Customer> findByAgeLessThanOrderByAgeAsc(int age);

    // Метод для получения клиента по имени и фамилии
    Optional<Customer> findByNameAndSurname(String name, String surname);
}




