package com.purplewisteria.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.purplewisteria.spring5webapp.modal.Book;


public interface BookRepository extends CrudRepository<Book, Long> {
	
	// An interface 'CrudRepository' for handing CRUD Operations
	
	
}