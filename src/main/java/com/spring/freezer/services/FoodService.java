package com.spring.freezer.services;

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
            return response;
        } else {
            return null;
        }
    }

    // update a food item method
    public FoodResponseModel updateItem(FoodAddRequestModel request) {
        ModelMapper mapper = new ModelMapper();
        // check if there is an existing food object in the db
        Optional<Food> food = foodRepo.findById(request.getId());
        if (food.isPresent()) {
            // map the request onto a food class, this will not have an id field filled in
            Food updateFood = mapper.map(request, Food.class);
            // set the id of the update food to the object that we found
            updateFood.setId(food.get().getId());
            foodRepo.save(updateFood);
            FoodResponseModel response = mapper.map(updateFood, FoodResponseModel.class);
            return response;
        } else {
            return null;
        }
    }

    // find by name method
    public FoodResponseModel findByName(String name) {
        ModelMapper mapper = new ModelMapper();

        Optional<Food> food = foodRepo.findByName(name);
        if (food.isPresent()) {
            FoodResponseModel response = mapper.map(food.get(), FoodResponseModel.class);
            return response;
        } else {
            return null;
        }
    }
}
