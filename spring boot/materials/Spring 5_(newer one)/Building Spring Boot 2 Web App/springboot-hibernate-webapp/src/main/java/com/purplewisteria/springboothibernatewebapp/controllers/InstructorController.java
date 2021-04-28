package com.purplewisteria.springboothibernatewebapp.controllers;

import java.util.Optional;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.purplewisteria.springboothibernatewebapp.modal.Course;
import com.purplewisteria.springboothibernatewebapp.modal.Instructor;
import com.purplewisteria.springboothibernatewebapp.modal.InstructorDetail;
import com.purplewisteria.springboothibernatewebapp.repositories.InstructorRepository;
import com.purplewisteria.springboothibernatewebapp.repositories.InstructorDetailRepository;

@Controller
@RequestMapping("/instructor_controller")
public class InstructorController {
        
        private InstructorRepository instructorRepository;
        private InstructorDetailRepository instructorDetailRepository;
        
        public InstructorController(InstructorRepository instructorRepository, InstructorDetailRepository instructorDetailRepository) {
            this.instructorRepository = instructorRepository;
            this.instructorDetailRepository = instructorDetailRepository;
        }

        @RequestMapping("/showInstructorForm")
        //Passing Spring MVC Modal
        public String showInstructorForm(Model model){        
        	model.addAttribute("instructor", new Instructor());
            return "instructorform";
        }
        
        
    @RequestMapping("/saveInstructor")
    //Passing Spring MVC Modal
    public String saveInstructor(@ModelAttribute("instructor") Instructor instructor, Model model){
    	            InstructorDetail instructorDetail = instructor.getInstructorDetail();
    	instructorDetailRepository.save(instructorDetail);
    	
    	instructor.setInstructorDetail(instructorDetail);
    	instructor = instructorRepository.save(instructor);
    	 model.addAttribute("instructor", instructor );
    
        return "home";
    }
    
    @RequestMapping("/instructors")
    
    public String getInstructors(Model model){
    	
    	Iterable <Instructor> instructors = instructorRepository.findAll();

        model.addAttribute("instructors", instructors);
       
        return "instructors";
    }
    
    @GetMapping("/findInstructor")
    public String getInstructor(@ModelAttribute("instructor") Instructor instructor, Model model) {
    	
    	Optional <Instructor> optionalInstructor = instructorRepository.findById(instructor.getId());
    	instructor = optionalInstructor.get();
    	
    	 List <Course> courses = instructor.getCourses();
    	 model.addAttribute("instructor", instructor);
    	 model.addAttribute("courses", courses);
    	 
        return "instructorform";
    }
    
    
    @GetMapping("/instructor/{instructorId}/edit")
    public String updateInstructor(@PathVariable Long instructorId, Model model, @ModelAttribute("instructor") Instructor instructor) {
    	Optional <Instructor> optionalInstructor = instructorRepository.findById(instructorId);
    	instructor = optionalInstructor.get();
        model.addAttribute("instructor", instructor );
        return "instructorform";
    }
    
    @GetMapping("/instructor/{instructorId}/delete")
    public String deleteInstructor(@PathVariable Long instructorId, Model model) {
    	instructorRepository.deleteById(instructorId);
    
    	return "redirect:/instructor_controller/instructors/";
              
    }
    
  
    
}