package com.spring.freezer.requestmodels;

import lombok.Data;

// request entity model
@Data
public class FoodAddRequestModel {

    private int id;

    private String name;

    private String description;

    private String type;

    private int quantity;

}
