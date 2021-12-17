package com.jc.livraria.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jc.livraria.dto.BooksDTO;
import com.jc.livraria.entities.Books;
import com.jc.livraria.repositories.BooksRepository;

@Service
public class BooksService {

	@Autowired
	private BooksRepository repository;
	
	@Transactional(readOnly = true)
	public List<BooksDTO> findAll() {
		List<Books> listBooks = repository.findAll();
		return listBooks.stream().map(x -> new BooksDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public BooksDTO findById(Integer id) {
		Optional<Books> obj = repository.findById(id);
		Books entity = obj.orElseThrow();
		return new BooksDTO(entity);
	}
}
