package com.purplewisteria.Lambdas.fi.function;

public class Employee {
    
	   public Employee(String fName, Integer age   ){
	       this.age = age;
	       this.firstName = fName;
	   }
	     

	   private Integer age;
	   private String firstName;
	   //Please generate Getter and Setters
	 
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}	
}