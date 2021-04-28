package com.purplewisteria.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

        public HomeController() {
        
    }

    @RequestMapping("/")
    //Passing Spring MVC Modal
    public String getAuthors(Model model){

        //model.addAttribute("authors", "");

        return "home";
    }
}