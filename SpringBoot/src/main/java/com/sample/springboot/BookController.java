package com.sample.springboot;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sample.springboot.beans.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
	
	@Autowired
    private BookRepository bookRepository;
	
	@GetMapping
    public List<Book> getBooks(){
        
		Iterator<Book> books =bookRepository.findAll().iterator();
		List<Book> booksLst = new ArrayList<Book>();
		while (books.hasNext()) {
			booksLst.add(books.next());
		}
		return booksLst;
    }
	
	@GetMapping(path="/{bookName}", produces={MediaType.APPLICATION_XML_VALUE,
            MediaType.APPLICATION_JSON_VALUE})
	
    public List<Book> getBook(@PathVariable ("bookName") String name){
        
        //return "get user was called with details of pageno "+ page + " with limit " +limit + " sort " + sort;
		List<Book> books = bookRepository.findByName(name);
		return books;
    }
	
	@PostMapping (
            consumes={MediaType.APPLICATION_XML_VALUE,
                                     MediaType.APPLICATION_JSON_VALUE},
            produces={MediaType.APPLICATION_XML_VALUE,
                                    MediaType.APPLICATION_JSON_VALUE}
    )
    public ResponseEntity<Book> createBook(@RequestBody Book book){

		   bookRepository.save(book);
           return ResponseEntity.status(HttpStatus.CREATED).body(book);

    }
	
	
}
