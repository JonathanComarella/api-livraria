package com.jc.livraria.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jc.livraria.entities.Books;
import com.jc.livraria.services.BooksService;

@RestController
@RequestMapping(value = "/books")
public class BooksResource {
	
	@Autowired
	private BooksService service;

	@GetMapping
	public ResponseEntity<List<Books>> findAll() {
		List<Books> booksList = service.findAll();
		return ResponseEntity.ok().body(booksList);
	}
}
