package com.spring.freezer.restcontrollers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/food")
@CrossOrigin
public class FoodController {

    @PostMapping(value = "/add", produces = "application/json", consumes = "application/json")
    public void addFood() {

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
