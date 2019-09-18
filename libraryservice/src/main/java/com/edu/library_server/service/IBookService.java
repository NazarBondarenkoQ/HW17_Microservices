package com.edu.library_server.service;


import com.edu.library_server.models.Book;

public interface IBookService {
    void saveBook(Book book);

    Book findBook(Integer bookID);

    void deleteBook(Integer bookID);

}
