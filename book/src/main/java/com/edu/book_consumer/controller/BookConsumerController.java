package com.edu.book_consumer.controller;

import com.edu.book_consumer.dto.LibraryFeignClient;
import com.edu.book_consumer.model.Book;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BookConsumerController {

    private LibraryFeignClient libraryFeignClient;

    @GetMapping("/find_book/{bookID}")
    public Book findAuthor(@PathVariable("bookID") Integer authorID){
        return libraryFeignClient.findAuthor(authorID);
    }
}
