package com.jc.livraria.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jc.livraria.entities.Books;

@RestController
@RequestMapping(value = "/books")
public class BooksResource {

	@GetMapping
	public ResponseEntity<List<Books>> findAll() {
		List<Books> booksList = new ArrayList<>();
		booksList.add(new Books(1, "Livro A", "Author A", 2021));
		booksList.add(new Books(2, "Livro B", "Author B", 2021));
		booksList.add(new Books(3, "Livro C", "Author C", 2021));
		return ResponseEntity.ok().body(booksList);
	}
}
