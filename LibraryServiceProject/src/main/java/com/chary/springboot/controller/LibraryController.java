package com.chary.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.chary.springboot.entities.Book;
import com.chary.springboot.entities.Library;
import com.chary.springboot.service.LibraryService;

@RestController
@RequestMapping("/api")
public class LibraryController {
    @Autowired
	private LibraryService libraryService;
    
    @Autowired
	private RestTemplate restTemplate;
    
    @GetMapping("/library/{id}")
	public Library getLibraryById(@PathVariable int id) {
    	Book book=restTemplate.getForObject("http://localhost:9091/api/book/"+id, Book.class);
		Library library=libraryService.getLibraryById(id);
		library.setBook(book);
    	return library;
		//return libraryService.getLibraryById(id);
	}

	@PostMapping("/insert")
	public Library inserBook(@RequestBody Library library) {
		return libraryService.insertBook(library);
	}
    
    
}
