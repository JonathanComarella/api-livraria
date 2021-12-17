package com.jc.livraria.dto;

import java.io.Serializable;

import com.jc.livraria.entities.Books;

public class BooksDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private String author;
	private Integer anoPublicacao;
	
	public BooksDTO() {
	}

	public BooksDTO(Integer id, String name, String author, Integer anoPublicacao) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.anoPublicacao = anoPublicacao;
	}
	
	public BooksDTO(Books entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.author = entity.getAuthor();
		this.anoPublicacao = entity.getAnoPublicacao();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(Integer anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
}
