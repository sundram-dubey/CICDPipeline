package com.hcl.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.hcl.model.Book;

public interface IService {
   public ResponseEntity<?> save(@RequestBody Book book);
}
