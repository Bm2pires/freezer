package com.spring.freezer.requestmodels;

import lombok.Data;

@Data
public class FoodAddRequestModel {

    private long id;

    private String name;

    private String description;

    private String type;

    private int quantity;

}
