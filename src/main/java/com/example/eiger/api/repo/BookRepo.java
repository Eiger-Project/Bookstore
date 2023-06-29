package com.example.eiger.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eiger.api.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {
    
}
