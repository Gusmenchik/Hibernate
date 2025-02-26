package ru.netology.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "customers")
@IdClass(CustomerId.class)
public class Customer implements Serializable {
    @Id
    private String name;

    @Id
    private String surname;

    @Id
    private int age;

    private String phoneNumber;
    private String city;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}



