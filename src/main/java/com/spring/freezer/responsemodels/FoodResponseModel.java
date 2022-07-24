package com.spring.freezer.responsemodels;

import lombok.Data;

@Data
public class FoodResponseModel {

    private String name;

    private String description;

    private String type;

    private int quantity;

}
