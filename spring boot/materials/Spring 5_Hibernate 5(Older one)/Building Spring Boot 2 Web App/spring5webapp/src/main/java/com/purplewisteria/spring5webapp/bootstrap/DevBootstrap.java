package com.purplewisteria.spring5webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.purplewisteria.spring5webapp.modal.Author;
import com.purplewisteria.spring5webapp.modal.Book;
import com.purplewisteria.spring5webapp.modal.Publisher;
import com.purplewisteria.spring5webapp.repositories.AuthorRepository;
import com.purplewisteria.spring5webapp.repositories.BookRepository;
import com.purplewisteria.spring5webapp.repositories.PublisherRepository;

/* Real common use case to initialize/ bootstrap data in the database 
  using Spring's eventing framework's one of ht events 'context' 
 */
// Populating data in the 'author' & 'book' tables...

/*
 Once the ContextRefreshedEvent gets thrown, Spring repository interface catches 
 transaction and populates the data in the DB using Hibernate.
 */
@Component // making it as Spring component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;
   
    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository,
    		PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
         }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
      initData();
   
    }

    private void initData(){

        Publisher publisher1 = new Publisher();
        publisher1.setName("foo");
        publisher1.setAddress("12th Street, LA");
        
        publisherRepository.save(publisher1);
        
        Publisher publisher2 = new Publisher();
        publisher2.setName("J& Co,");
        publisher2.setAddress("14 th Street, GA");
        
        publisherRepository.save(publisher2);

        //Rod
        Author rod = new Author("Rod", "Johnson");
        Author eric = new Author("Eric", "Johnson");
        
        Book noEJB = new Book("J2EE Development without EJB", "23444", publisher1 );
        Book springBoot = new Book("Spring Boot", "23444", publisher2 );
        
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
         

        rod.getBooks().add(springBoot);
        springBoot.getAuthors().add(rod);
        
        eric.getBooks().add(springBoot);
        springBoot.getAuthors().add(eric);
        
        authorRepository.save(eric);
        bookRepository.save(springBoot);
        
        
       
       
        
        
    }
}