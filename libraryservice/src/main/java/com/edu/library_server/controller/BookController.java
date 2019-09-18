package com.edu.library_server.controller;

import com.edu.library_server.models.Book;
import com.edu.library_server.service.IBookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class BookController {

    private IBookService IBookService;

    @PostMapping("/admin/add_book")
    public void saveBook(@RequestBody Book book) {
        IBookService.saveBook(book);
    }

    @GetMapping("/user/find_book/{bookID}")
    public Book findBook(@PathVariable("bookID") Integer authorID) {
        return IBookService.findBook(authorID);
    }

    @DeleteMapping("/admin/delete_book/{bookID}")
    public void deleteBook(@PathVariable("bookID") Integer authorID) {
        IBookService.deleteBook(authorID);
    }

}
