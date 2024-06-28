package com.example.studysample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studysample.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
