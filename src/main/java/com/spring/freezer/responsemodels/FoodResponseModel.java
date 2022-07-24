package com.spring.freezer.responsemodels;

import lombok.Data;

// food response model
@Data
public class FoodResponseModel {

    private int id;

    private String name;

    private String description;

    private String type;

    private int quantity;

}
