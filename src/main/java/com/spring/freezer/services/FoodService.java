package com.spring.freezer.services;

import java.lang.reflect.Method;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.freezer.entities.Food;
import com.spring.freezer.repositories.FoodRepository;
import com.spring.freezer.requestmodels.FoodAddRequestModel;
import com.spring.freezer.responsemodels.FoodIDResponseModel;
import com.spring.freezer.responsemodels.FoodResponseModel;

@Service
public class FoodService {

    @Autowired
    FoodRepository foodRepo;

    // add food method
    public FoodIDResponseModel addFood(FoodAddRequestModel request) {
        ModelMapper mapper = new ModelMapper();
        // convert the request into a food object and save to repo
        Food newFood = mapper.map(request, Food.class);
        foodRepo.save(newFood);

        // map this new food object to a response object and return
        FoodIDResponseModel returnObject = mapper.map(newFood, FoodIDResponseModel.class);
        return returnObject;
    }

    // find by id food method
    public FoodResponseModel findById(int id) {
        ModelMapper mapper = new ModelMapper();
        Optional<Food> food = foodRepo.findById(id);
        if (food.isPresent()) {
            FoodResponseModel response = mapper.map(food.get(), FoodResponseModel.class);
            System.out.println(response);
            return response;
        } else {
            return null;
        }
    }
}
