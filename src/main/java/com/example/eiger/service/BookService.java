package com.example.eiger.service;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.eiger.api.model.Book;

@Service
public class BookService {
    
    private List<Book> bookList;

    public BookService(){
        bookList = new ArrayList<>();

        Book book1 = new Book(1, "Caraval", 70);
        Book book2 = new Book(2, "Legandary", 80);
        Book book3 = new Book(3, "Finale", 75);

        bookList.addAll(Arrays.asList(book1,book2,book3));
    }

    public Optional<Book> getBook(Integer id) {
    for (Book book : bookList) {
        if (id == book.getId()) {
            return Optional.of(book);
        }
    }
        return Optional.empty();
    }
}
