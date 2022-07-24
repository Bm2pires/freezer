package com.spring.freezer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.freezer.repositories.FoodRepository;
import com.spring.freezer.responsemodels.FoodAddResponseModel;

@Service
public class FoodService {

    @Autowired
    FoodRepository foodRepo;

    private FoodAddResponseModel addFood(FoodAddResponseModel request) {

    }

}
