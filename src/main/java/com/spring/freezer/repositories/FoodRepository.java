package com.spring.freezer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.freezer.entities.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
