package com.purplewisteria.springboothibernatewebapp.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.purplewisteria.springboothibernatewebapp.modal.Instructor;
import com.purplewisteria.springboothibernatewebapp.modal.InstructorDetail;
import com.purplewisteria.springboothibernatewebapp.repositories.InstructorRepository;
import com.purplewisteria.springboothibernatewebapp.repositories.InstructorDetailRepository;

@Controller
@RequestMapping("/instructor_detail_controller")
public class InstructorDetailController {
        
        private InstructorDetailRepository instructorDetailRepository;
        
        public InstructorDetailController( InstructorDetailRepository instructorDetailRepository) {

            this.instructorDetailRepository = instructorDetailRepository;
        }
    
    @GetMapping("/instructorDetails")
    public String getInstructor( Model model) {
    	
    	model.addAttribute("instructorDetails", instructorDetailRepository.findAll());
    	 
        return "instructor_detail_form";
    }
        
}