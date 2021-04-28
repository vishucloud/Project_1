package com.purplewisteria.jacksondatabindingjsondemo.controllers;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.purplewisteria.jacksondatabindingjsondemo.modal.Student;

@Controller
@RequestMapping("/student_controller")
public class StudentController {
	
	public StudentController() {
	}
	

	@RequestMapping("/student")
	public String index(Model model) {
		Student student=null;
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			student = objectMapper.readValue(new File("data/sample-full.json"), Student.class);
		}
		catch (Exception exec) {
			exec.printStackTrace();
		}
		model.addAttribute("student", student);
		return "student";
	}


	    
}

