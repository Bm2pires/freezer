package com.spring.freezer.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "item", length = 50, nullable = false)
    private String name;

    @Column(name = "description", length = 250, nullable = false)
    private String description;

    @Column(name = "type", length = 50, nullable = false)
    private String type;

    @Column(name = "quantity", nullable = false)
    private int quantity;
}
