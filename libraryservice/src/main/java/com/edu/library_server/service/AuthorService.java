package com.edu.library_server.service;



import com.edu.library_server.models.Author;
import com.edu.library_server.repository.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class AuthorService implements IAuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public void saveAuthor(Author author) {
        authorRepository.save(author);
    }

    @Override
    public Optional<Author> findAuthor(Integer authorID) {
        try {
            return Optional.ofNullable(authorRepository.findById(authorID).orElseThrow(ChangeSetPersister.NotFoundException::new));
        } catch (ChangeSetPersister.NotFoundException e) {
            e.printStackTrace();
        }
        return authorRepository.findById(authorID);
    }

    @Override
    public void deleteAuthor(Integer authorID) {
        authorRepository.deleteById(authorID);
    }

}
