package com.spring.freezer.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.freezer.entities.Food;

public interface FoodRepository extends JpaRepository<Food, Integer> {
    public Optional<Food> findByName(String name);
}
