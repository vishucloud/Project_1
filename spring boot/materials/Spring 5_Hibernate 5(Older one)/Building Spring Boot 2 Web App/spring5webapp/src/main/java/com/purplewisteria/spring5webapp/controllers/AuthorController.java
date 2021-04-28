package com.purplewisteria.spring5webapp.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.purplewisteria.spring5webapp.modal.Author;
import com.purplewisteria.spring5webapp.modal.Book;
import com.purplewisteria.spring5webapp.repositories.AuthorRepository;

@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    //Passing Spring MVC Modal
    public String getAuthors(Model model){

        model.addAttribute("authors", authorRepository.findAll());

        return "authors";
    }
    
    @RequestMapping("/author_books/{authorId}")
    // Passing Spring MVC Modal
    public String getBooksByAuthor(Model model, @PathVariable("authorId") Long authorId){
    	
    	Optional<Author> bookOptional = authorRepository.findById(authorId);
    	 Author author = bookOptional.get();
    	 
    	 model.addAttribute("authorId", authorId);
    	 
        model.addAttribute("books", author.getBooks());

        return "authors";
    }

}