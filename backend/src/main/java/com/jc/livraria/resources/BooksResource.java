package com.jc.livraria.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jc.livraria.dto.BooksDTO;
import com.jc.livraria.services.BooksService;

@RestController
@RequestMapping(value = "/books")
public class BooksResource {
	
	@Autowired
	private BooksService service;

	@GetMapping
	public ResponseEntity<List<BooksDTO>> findAll() {
		List<BooksDTO> booksList = service.findAll();
		return ResponseEntity.ok().body(booksList);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<BooksDTO> finById(@PathVariable Integer id) {
		try {
		BooksDTO book = service.findById(id);
		return ResponseEntity.ok().body(book);
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}
}
