package com.edu.book_consumer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class Book {
    private Integer id;
    private String title;
    private String genre;
    private String description;
    private int rate;
}