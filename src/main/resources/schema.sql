-- schema.sql
CREATE TABLE customers (
    name VARCHAR(50),
    surname VARCHAR(50),
    age INT,
    phone_number VARCHAR(20),
    city VARCHAR(50),
    PRIMARY KEY (name, surname, age)
);


