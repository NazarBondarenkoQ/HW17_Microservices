package com.edu.library_server.controller;

import com.edu.library_server.models.Author;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.edu.library_server.service.IAuthorService;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class AuthorController {

    private IAuthorService IAuthorService;

    @PostMapping("/admin/add_author")
    public void saveAuthor(@RequestBody Author author) {
        IAuthorService.saveAuthor(author);
    }

    @GetMapping("/user/find_author/{authorID}")
    public Optional<Author> findAuthor(@PathVariable("authorID") Integer authorID) {
        return IAuthorService.findAuthor(authorID);
    }

    @DeleteMapping("/admin/delete_author/{authorID}")
    public void deleteAuthor(@PathVariable("authorID") Integer authorID) {
        IAuthorService.deleteAuthor(authorID);
    }

}
