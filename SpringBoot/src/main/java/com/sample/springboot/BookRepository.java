package com.sample.springboot;

import org.springframework.data.repository.CrudRepository;

import com.sample.springboot.beans.Book;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findByName(String name);

}
