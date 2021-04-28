package com.purplewisteria.ClassesConstructorsObjects.constructors;

public class AccountDetails {

    public static void main(String[] args) {

 // BankAccount rickAccount = new BankAccount();
     
BankAccount rickAccount = new BankAccount("5566788", "Savings", 10000.00, "Rick", "rick@gm.com", "(404) 355 4386");
   
// BankAccount rickAccount = new BankAccount("11220505", "Rick", "rick@gm.com", "404355076" );
    	
        System.out.println("Account  Holder Number: " + rickAccount.getAccountNumber());
        System.out.println("Account Type: " + rickAccount.getAccountType());
        System.out.println("Account Balance: " + rickAccount.getAccountBalance());
        System.out.println("Account Holder Name: " + rickAccount.getAccountHolderName());
        System.out.println("Account Holder Email: " + rickAccount.getAccountHolderEmail());
        System.out.println("Account Holder Contact Number: " + rickAccount.getAccountHolderrPhoneNumber());
        
        System.out.println("------------------------------------------------------------------------");
        rickAccount.withdrawal(200.0);

        rickAccount.deposit(250.0);
        rickAccount.withdrawal(100.0);

        rickAccount.deposit(150.0);
        rickAccount.withdrawal(200.0);
        
        //Account rickAccount = new Account();
        
   
    }
}
