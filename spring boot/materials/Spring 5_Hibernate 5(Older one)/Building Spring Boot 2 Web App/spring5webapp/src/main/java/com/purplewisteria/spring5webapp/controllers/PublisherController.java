package com.purplewisteria.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.purplewisteria.spring5webapp.repositories.PublisherRepository;

@Controller
public class PublisherController {

    private PublisherRepository publisherRepository;

    public PublisherController(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @RequestMapping("/publishers")
    // Passing Spring MVC Modal
    public String getBooks(Model model){

        model.addAttribute("publishers", publisherRepository.findAll());

        return "publishers";
    }
    
}