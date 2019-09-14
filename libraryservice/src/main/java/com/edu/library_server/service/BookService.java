package com.edu.library_server.service;


import com.edu.library_server.models.Book;
import com.edu.library_server.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookService implements IBookService {

    private final BookRepository bookRepository;

    @Override
    public void saveBook(Book book) {
        bookRepository.save(book);
    }


    @Override
    public Book findBook(Integer bookID) {
        return bookRepository.findById(bookID).orElse(new Book());
    }

    @Override
    public void deleteBook(Integer bookID) {
        bookRepository.deleteById(bookID);
    }

}
