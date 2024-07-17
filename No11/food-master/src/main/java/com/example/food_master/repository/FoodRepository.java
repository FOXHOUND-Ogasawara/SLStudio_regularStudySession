package com.example.food_master.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.food_master.model.Foodstock;

@Repository
public interface FoodRepository extends JpaRepository<Foodstock, Long> {
    // 標準的なCRUDメソッドとクエリメソッドが自動的に提供される
}