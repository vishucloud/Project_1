package com.purplewisteria.naming_conventions_packages.nested_classes.local_class;

public class TestEmployee {

	public static void main(String[] args) {
		
        Company company = new Company();
        
        String nameEmp= company.createEmployee("Rick");
        
        System.out.println( nameEmp  );
        
    }
}
