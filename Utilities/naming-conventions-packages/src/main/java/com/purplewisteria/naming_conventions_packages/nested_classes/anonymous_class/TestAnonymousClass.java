package com.purplewisteria.naming_conventions_packages.nested_classes.anonymous_class;

public class TestAnonymousClass {

	public static void main (String a[] ){
	 
		Auto auto = new Car().getCarType (
				
				new Auto () {
					
					 @Override
					public void drive() {

						System.out.println("anonymous Ferrari");
			        }
			       }   

				);

	auto.drive();
		
	}
}

