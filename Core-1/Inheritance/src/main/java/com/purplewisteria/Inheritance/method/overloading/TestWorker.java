package com.purplewisteria.Inheritance.method.overloading;

public class TestWorker {
	
// Overloaded Methods...
	public Worker getWorker(Teacher teacher) {
			 
                 return teacher;
		 }
	
		 public Worker getWorker(  Principal principal) {
			
			 return principal;
		 }
		 		
		 
		 
		 public static void main(String[] args) {
			  
			 TestWorker testworker = new TestWorker();
		 
/*
 When a class "TestWorker" object receives a message to execute the getWorker method, the appropriate 
 definition will be selected according to the argument(s)
 */
			 Worker worker; 
			 
			 worker = testworker.getWorker( new Teacher() ); // compile time polymorphism..
		 
		     System.out.println( worker.doIt()  ); // Runtime time polymorphism..

		 
		  worker = testworker.getWorker( new Principal() );
		  
		 
		       System.out.println(worker.doIt());

		 }
		 
		}