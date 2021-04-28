package com.purplewisteria.RestfulWebServices.controllers.filtering;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {
	
	@GetMapping("/filtering")
		public MappingJacksonValue retrieveSomeBean() {
			
		// Implementing Dynamic Filtering for RESTful Service
		 SomeBean someBean = new SomeBean("value1", "value2", "value3");
		 
		 //Creating the 'MappingJacksonValue' for this 'someBean'
		MappingJacksonValue mapping = new MappingJacksonValue(someBean);
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field2"); 
		
		
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter",filter);
		
		mapping.setFilters(filters); // configuring the filters..
		
			return mapping;
			
			
		}

}
