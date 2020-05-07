package com.vbaixinho.springboot.basics.springbootin10steps;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	@GetMapping(path = "/books")
	public List<Book> getAllBooks() {
		
		return Arrays.asList(new Book(1L, "Mastering Spring 5.1", "Rashes"));
	}
}