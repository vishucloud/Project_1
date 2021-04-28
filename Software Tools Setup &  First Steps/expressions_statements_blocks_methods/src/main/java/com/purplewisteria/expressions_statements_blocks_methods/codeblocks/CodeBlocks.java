package com.purplewisteria.expressions_statements_blocks_methods.codeblocks;

	/*
	  An expression is a construct made up of variables, operators, and method invocations.
	  Operators may be used in building expressions, which compute values; expressions are the
	   core components of statements; statements may be grouped into blocks
	 */

    /*
     * Indentation (Code Organization) - use ctrl + I in windows OS
     */
public class CodeBlocks {

	public static void main(String[] args) {

		double score = 68;
		char grade='A';
		boolean isEligible= true;

		if (score >= 95 || score >= 98)  { // Code block starts here..
			grade = 'A';
			isEligible = true;
		}    // Code block ends here..

		else if (  (score >= 80)  && (score <=90) ) {  // Code block starts here..
			grade = 'B';
			isEligible = true;
		}     // Code block ends here..

		else   if (  (score >= 70)  && (score <=80) ) {  // Code block starts here..
			grade = 'C';  
			isEligible = true;
		} // Code block ends here..

		else {   // Code block starts here..
			grade ='D';
			isEligible = false;
		}  // Code block ends here..


		System.out.println("Grade Is: " + grade);

		if(!isEligible) 
			System.out.println("Not Eligible for Scholarship: ");
		else 
			System.out.println("Eligible for Scholarship: ");

		System.out.println("-------------------------------------------------------------------------------------");

		double basicEmployeeSalary = 8000.00d;
		double increment = 10.00d;
		boolean isPermanent= true;

		if (isPermanent ) {  // Code block starts here..
			double updatedSalary = ( 8000.00d + ( 8000.00d * (10.00d/100) ) );
			System.out.println("Updated Employee Salary: " + updatedSalary);
		} // Code block ends here..

		System.out.println("-------------------------------------------------------------------------------------");


		basicEmployeeSalary = 9000.00d;
		increment = 11.00d;
		isPermanent= true;
/*
   Note: variables declared inside the code blocks, can not be accessed outside of the block.
   Methods are taking the code block concept to the next level, so that the code could be reused at several times.
 */
		
		if (isPermanent ) {  // Code block starts here..
			double updatedSalary = ( 9000.00d + ( 9000.00d * (11.00d/100) ) );
			System.out.println("Updated Employee Salary: " + updatedSalary);
		} // Code block ends here..


	}
}
