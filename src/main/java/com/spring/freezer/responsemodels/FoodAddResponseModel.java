package com.spring.freezer.responsemodels;

import lombok.Data;

@Data
public class FoodAddResponseModel {

    private long id;

    private String name;

    private String description;

    private String type;

    private int quantity;

}
