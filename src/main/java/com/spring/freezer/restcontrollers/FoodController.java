package com.spring.freezer.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.freezer.requestmodels.FoodAddRequestModel;
import com.spring.freezer.responsemodels.FoodIDResponseModel;
import com.spring.freezer.responsemodels.FoodResponseModel;
import com.spring.freezer.services.FoodService;

// rest controller layer to set up API endpoints
@RestController
@RequestMapping("/food")
@CrossOrigin
public class FoodController {

    @Autowired
    FoodService foodService;

    // method to add food to fridge
    @PostMapping(value = "/add", produces = "application/json", consumes = "application/json")
    public ResponseEntity<FoodIDResponseModel> addFood(@RequestBody FoodAddRequestModel request) {
        FoodIDResponseModel response = foodService.addFood(request);
        return new ResponseEntity<FoodIDResponseModel>(response, HttpStatus.OK);
    }

    // method to provide an id through the url and get the detail of the food
    @GetMapping(value = "/get/{id}", produces = "application/json")
    public ResponseEntity<FoodResponseModel> getDetails(@PathVariable int id) {
        FoodResponseModel response = foodService.findById(id);
        return new ResponseEntity<FoodResponseModel>(response, HttpStatus.OK);
    }

    // method to update/edit an item
    @PutMapping(value = "/update", produces = "application/json", consumes = "application/json")
    public ResponseEntity<FoodResponseModel> updateItem(@RequestBody FoodAddRequestModel request) {
        FoodResponseModel response = foodService.updateItem(request);
        return new ResponseEntity<FoodResponseModel>(response, HttpStatus.OK);
    }

    // method to search for food item by name
    @GetMapping(value = "/search", produces = "application/json")
    public ResponseEntity<FoodResponseModel> searchFood(@RequestParam String name) {
        FoodResponseModel response = foodService.findByName(name);
        return new ResponseEntity<FoodResponseModel>(response, HttpStatus.OK);
    }
}
