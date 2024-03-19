-- Active: 1709300074551@@127.0.0.1@3306
CREATE DATABASE belajar_spring_data_jpa
    DEFAULT CHARACTER SET = 'utf8mb4';

use belajar_spring_data_jpa;

CREATE TABLE categories(
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    PRIMARY KEY(id)
);

show tables;