package com.chary.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.chary.springboot.entities.Book;
import com.chary.springboot.entities.Library;
import com.chary.springboot.repository.LibraryRepository;

@Service
public class LibraryService {
	@Autowired
	private LibraryRepository libraryRepository;
	
	
	public Library getLibraryById(int id)
	{
		return libraryRepository.findById(id).get();
	}
	
	public Library insertBook(Library library)
	{
		return libraryRepository.save(library);
	}

}
