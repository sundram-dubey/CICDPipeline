package com.hcl.persist;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.model.Book;

public interface Persistence extends JpaRepository<Book, Integer> {

}
