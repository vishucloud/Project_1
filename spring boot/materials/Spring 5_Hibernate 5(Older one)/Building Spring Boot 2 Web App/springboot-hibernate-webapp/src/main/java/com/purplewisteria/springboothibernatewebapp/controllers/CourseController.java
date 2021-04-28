package com.purplewisteria.springboothibernatewebapp.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.purplewisteria.springboothibernatewebapp.modal.Course;
import com.purplewisteria.springboothibernatewebapp.modal.Instructor;
import com.purplewisteria.springboothibernatewebapp.modal.InstructorDetail;
import com.purplewisteria.springboothibernatewebapp.repositories.CourseRepository;
import com.purplewisteria.springboothibernatewebapp.repositories.InstructorRepository;

@Controller
@RequestMapping("/course_controller")
public class CourseController {
	
	private CourseRepository courseRepository;
    private InstructorRepository instructorRepository;
    
	public CourseController(CourseRepository courseRepository, InstructorRepository instructorRepository) {
		this.instructorRepository = instructorRepository;
		this.courseRepository = courseRepository;
	}

	@RequestMapping("/showCourseForm")
	public String index(Model model) {
		model.addAttribute("course", new Course());
		return "courseform";
	}

	  @RequestMapping("/courses")
	    public String saveCourse(@ModelAttribute("course") Course course, Model model){
		  
	       Instructor instructor = course.getInstructor();
	       Optional <Instructor> optionalInstructor = instructorRepository.findById(instructor.getId());
	    	instructor = optionalInstructor.get();
	      
	              course.setTitle(course.getTitle());
	    instructor.getCourses().add(course);
		    	instructorRepository.save(instructor);
		    	
		    
	   	return "redirect:/course_controller/showCourseForm/";
	    }
	

	    
}
