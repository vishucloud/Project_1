package com.purplewisteria.SpringRESTClient.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.purplewisteria.SpringRESTClient.services.ApiService;


@Controller
@RequestMapping ("quote_controller")
public class QuoteController {

    private ApiService apiService;

    public QuoteController(ApiService apiService) {
        this.apiService = apiService;
    }


    @GetMapping("/quote")
    public String getQuote(Model model){
   
        model.addAttribute("quote", apiService.getQuote());
             
        return "quote";
    }
    
    
    
    
}