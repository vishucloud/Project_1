package com.purplewisteria.ClassesConstructorsObjects.constructors;

public class BankAccount {
	
    private String accountNumber;
    private String accountType;
    private double accountBalance;
    private String accountHolderName;
    private String accountHolderEmail;
    private String accountHolderrPhoneNumber;
   // private AccountDetails ad;
   
    // Using empty constructor, we can create an object with some default values.
    public BankAccount() {
    	//Use 'this()' to call a constructor from another overloaded constructor in the same class.
    	// 'this' will call the constructor with all these parameters, and will give some default values for the five fields.
    	// 'this' is calling an another constructor within a constructor
        this("111222333", "Savings", 0.00d, "XXXX", "XXX XXX XXX", "XXXXXXXXX");
        System.out.println("Default values are set using default constructor...");
    }
    
    public BankAccount(String accountNumber, String accountType, double accountBalance, String accountHolderName, String accountHolderEmail,
                   String accountHolderrPhoneNumber ) {
        System.out.println("Initializing BankAccount object by calling the parameterized constructor ");
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
        this.accountHolderName = accountHolderName;
        this.accountHolderEmail = accountHolderEmail;
        this.accountHolderrPhoneNumber = accountHolderrPhoneNumber;
    }
    
	
    public BankAccount(String accountNumber, String accountHolderName, String accountHolderEmail,
			String accountHolderPhoneNumber) {
    	//Use 'this()' to call a constructor from another overloaded constructor in the same class.
    	// It's used with constructor chaining..
    	 this(accountNumber, "Savings", 0.00d, accountHolderName, accountHolderEmail, accountHolderPhoneNumber);
	  
    }
    
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public String getAccountHolderEmail() {
		return accountHolderEmail;
	}
	public String getAccountHolderrPhoneNumber() {
		return accountHolderrPhoneNumber;
	}
	
	public void deposit(double depositedAmount) {
        this.accountBalance += depositedAmount;
        System.out.println("Deposit of " + depositedAmount + " made. New balance is " + this.accountBalance);
        
    }

    public void withdrawal(double withdrawalAmount) {
        if(this.accountBalance - withdrawalAmount < 0) {
            System.out.println("Only " + this.accountBalance + " available. Withdrawal not processed");
        } else {
            this.accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed, Remaining balance = " + this.accountBalance);
        }
    }

    
    
}
