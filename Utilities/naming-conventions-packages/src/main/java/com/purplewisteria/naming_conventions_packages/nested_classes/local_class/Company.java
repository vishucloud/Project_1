package com.purplewisteria.naming_conventions_packages.nested_classes.local_class;

public class Company {

	private int i =100;
	
    public String createEmployee(String empName) {
 
      class ProjectLeader implements Employee {
        
    		String empName;
    		
    		ProjectLeader(){
    			
    		}
    		public ProjectLeader(String empName) {
                  this.empName = empName;
             }
            @Override
    		public String getEmployeeName() {
                 return "Project Leader Object's method: " + empName;
            }
    		
    		
    	    void show () {
           	 System.out.println ( i  );
            }
        
        }
    	
      class P extends ProjectLeader {
    	  
      }
      
      Employee emp =  new ProjectLeader(empName);
      
         String ss=   emp.getEmployeeName();
         return ss;
    
    }  
   
}