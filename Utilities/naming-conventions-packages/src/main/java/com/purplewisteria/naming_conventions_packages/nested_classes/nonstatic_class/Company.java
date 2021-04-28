package com.purplewisteria.naming_conventions_packages.nested_classes.nonstatic_class;

public class Company {
	
	private int i =100;
	
   public class Programmer  implements Employee {
         
	   private String name;
       
	     Programmer(String name) {
              this.name = name;
          }
    
         void show () {
        	 System.out.println ( i  );
         }

		@Override
		public String getEmployeeName() {
			// TODO Auto-generated method stub
			return name;
		}
        
    }
    
	
  private class ProjectLeader  implements Employee {

	@Override
	public String getEmployeeName() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getEmployeeId() {
		// TODO Auto-generated method stub
		return i;
	}
	  
  }
   
  
  private class HR  implements Employee {
	  String name;
	  
	  public HR(String name) {
		  this.name = name;
	  }

	@Override
	public String getEmployeeName() {
		// TODO Auto-generated method stub
		return name;
	}
	  
  }
  
  
  private  class ITDepartment  implements  Department {
    
    	private String name;
    	
          ITDepartment (String name) {
              this.name = name;
          }
          @Override
          public String getDeptName() {
          
        	  return name;
        }
    }
    
    public Employee employed(String empName) {
    	
        return new HR(empName);
    }
    
    public Department department(String deptName) {
    	
        return new ITDepartment(deptName);
    }
    
    public void newStarter(String name, String department) {
    
    	Employee emp = employed(name);
        
    	Department dpt = department(department);
        
    	System.out.println(emp.getEmployeeName() + " is a member of " +    dpt.getDeptName() );
     }
  
}  // closing the outer class.




