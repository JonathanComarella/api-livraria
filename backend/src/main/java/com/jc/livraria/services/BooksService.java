package com.jc.livraria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jc.livraria.entities.Books;
import com.jc.livraria.repositories.BooksRepository;

@Service
public class BooksService {

	@Autowired
	private BooksRepository repository;
	
	@Transactional(readOnly = true)
	public List<Books> findAll() {
		return repository.findAll();
	}
}
