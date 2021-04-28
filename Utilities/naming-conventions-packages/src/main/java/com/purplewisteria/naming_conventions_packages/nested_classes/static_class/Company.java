package com.purplewisteria.naming_conventions_packages.nested_classes.static_class;



public class Company {
	
	int i=10;
	
	final static  double pi = 3.14;
	
	public static class NewEmployee  implements Employee     {
         
		private String empName;
         
            NewEmployee(String empName) {
              this.empName = empName;
            }
         public String getEmployeeName() {
              return empName;
          }
         
         void show () {
        Company c = new Company();
        	 
        	 System.out.println ( c.i  );
        	 System.out.println ( pi  );
         }
         
        
    }
	
    protected static class EmployeeDepartment implements  Department  {
        
    	private String deptName;

          EmployeeDepartment (String deptName) {
               this.deptName = deptName;
          }
            public String getDeptName() {
                return deptName;
           }
        
         }
    
    static class BusinessUnit {
        static String bu = " Finance ";
            static String getBU() {
               return bu;
          }
      }

    
    public static Employee employed(String empName) {
        return new NewEmployee(empName);
    }
    
    public static Department department(String deptName) {
        return new EmployeeDepartment(deptName);
    }

    public void newStarter(String name, String department) {
        
    	Employee emp = employed(name);
        
    	Department dpt = department(department);
        
    	System.out.println(emp.getEmployeeName() + " is a member of " +    dpt.getDeptName());
     }
  
    
}