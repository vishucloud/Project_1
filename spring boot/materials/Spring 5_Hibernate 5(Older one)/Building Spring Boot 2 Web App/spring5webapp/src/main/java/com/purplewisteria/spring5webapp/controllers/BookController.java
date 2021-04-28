package com.purplewisteria.spring5webapp.controllers;


import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.purplewisteria.spring5webapp.modal.Book;
import com.purplewisteria.spring5webapp.repositories.BookRepository;

@Controller
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    // Passing Spring MVC Modal
    public String getBooks(Model model){

        model.addAttribute("books", bookRepository.findAll());

        return "books";
    }
    
    
    @RequestMapping("/book_authors/{bookId}")
    // Passing Spring MVC Modal
    public String getAuthorsByBook(Model model, @PathVariable("bookId") Long bookId) {
    	
    	 try {
    	Optional<Book> bookOptional = bookRepository.findById(bookId);
    	   
    	Book book = bookOptional.get();
    	    
    	 model.addAttribute("bookId", bookId);
        model.addAttribute("authors", book.getAuthors());
    	 }
 	    catch(NoSuchElementException nse) {}

        return "books";
    }
}