package com.edu.author_consumer.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Author {
    private Integer id;
    private String firstName;
    private String lastName;
    private String country;
    private int age;
}