package com.sample.springboot;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
    private BookRepository repository;
	
	@GetMapping
    public User getUser(@RequestParam(value="page", defaultValue = "1") int page,
                                     @RequestParam(value="limit", defaultValue ="50",  required = false) int limit,
                                     @RequestParam(value="sort", defaultValue ="asc",  required = false) String sort){
        
        //return "get user was called with details of pageno "+ page + " with limit " +limit + " sort " + sort;
		
		return new User();
    }
	
	@PostMapping("/book")
	public void insertBook() {
		
	}
}
