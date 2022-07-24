package com.spring.freezer.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.freezer.requestmodels.FoodAddRequestModel;
import com.spring.freezer.responsemodels.FoodAddResponseModel;
import com.spring.freezer.services.FoodService;

@RestController
@RequestMapping("/food")
@CrossOrigin
public class FoodController {

    @Autowired
    FoodService foodService;

    @PostMapping(value = "/add", produces = "application/json", consumes = "application/json")
    public ResponseEntity<FoodAddResponseModel> addFood(@RequestBody FoodAddRequestModel request) {
        FoodAddResponseModel response = foodService.add
        return void;
    }

    @GetMapping(value = "/get", produces = "application/json")
    public void getDetails() {

    }

    @PutMapping(value = "/update", produces = "application/json", consumes = "application/json")
    public void updateItem() {

    }

    @GetMapping(value = "/search", produces = "application/json")
    public void searchFood() {

    }
}
