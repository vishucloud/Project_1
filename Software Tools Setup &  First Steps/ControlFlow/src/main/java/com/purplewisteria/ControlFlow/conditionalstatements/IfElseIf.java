package com.purplewisteria.ControlFlow.conditionalstatements;

public class IfElseIf {
	
    public static void main(String[] args) {

        int testscore = 96;
        char grade;

        if (testscore >= 90)  {
        	
            grade = 'A';
     //   System.out.println("Status is not updated! check it later");
        }
        
         else if (  (testscore >= 80)  && (testscore <=90)  ) 
        	 
            grade = 'B';
      
         
                 
        else if (testscore >= 70) 
            grade = 'C';
            
    else if (testscore >= 60) 
            grade = 'D';
        
        else 
            grade = 'F';
        
        System.out.println("Grade = " + grade);
        
    }
}
