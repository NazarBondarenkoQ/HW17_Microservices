package com.edu.library_server.service;

import com.edu.library_server.models.Author;

import java.util.Optional;

public interface IAuthorService {
    void saveAuthor(Author author);

    Optional<Author> findAuthor(Integer authorID);

    void deleteAuthor(Integer authorID);

}
