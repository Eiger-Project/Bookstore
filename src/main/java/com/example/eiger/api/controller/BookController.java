package com.example.eiger.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.eiger.api.model.Book;
import com.example.eiger.service.BookService;

@RestController
public class BookController {
    private BookService bookService;

    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("/user")
    public Book getBook(@RequestParam Integer id) {
        Optional<Book> book = bookService.getBook(id);
        if (book.isPresent()) {
            return book.get();
        }
        return null;
    }
}
