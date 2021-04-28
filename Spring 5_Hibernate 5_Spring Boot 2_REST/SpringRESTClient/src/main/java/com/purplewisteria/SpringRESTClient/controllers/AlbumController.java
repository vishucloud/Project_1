package com.purplewisteria.SpringRESTClient.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.purplewisteria.SpringRESTClient.services.ApiService;


@Controller
@RequestMapping ("album_controller")
public class AlbumController {

    private ApiService apiService;

    public AlbumController(ApiService apiService) {
        this.apiService = apiService;
    }


    @GetMapping("/albums")
    public String getAlbums(Model model){
   
        model.addAttribute("albums", apiService.getAlbums());
             
        return "albums";
    }
    
    
    
    
}