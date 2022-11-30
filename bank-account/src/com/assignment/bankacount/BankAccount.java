package com.assignment.bankacount;
import java.util.Random;

public class BankAccount {
	private double checkingBalance;
	private double savingsBalance;
	
	public static int numOfAccounts = 0;
	public static int totalOfAllAccounts = 0;
	
//	Constructor
	public BankAccount() {
		this(0,0);
	}
	
	public BankAccount(double checkingBalance, double savingsBalance) {
		super();
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
		numOfAccounts++;
		totalOfAllAccounts += checkingBalance + savingsBalance;
	}
	
// Getters and Setters

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public static int getNumOfAccounts() {
		return numOfAccounts;
	}

	public static void setNumOfAccounts(int numOfAccounts) {
		BankAccount.numOfAccounts = numOfAccounts;
	}

	public static int getTotalOfAllAccounts() {
		return totalOfAllAccounts;
	}

	public static void setTotalOfAllAccounts(int totalOfAllAccounts) {
		BankAccount.totalOfAllAccounts = totalOfAllAccounts;
	}
	
//	Methods
	public void deposit(String accountType, double amount) {
		accountType = accountType.toLowerCase();
		if(accountType.equals("savings")) {
			savingsBalance+= amount;
			System.out.println("Savings balance " + savingsBalance);
		} else if (accountType.equals("checking")) {
			checkingBalance+= amount;
			System.out.println("Checking balance " + checkingBalance);
		} else if (!accountType.equals("savings") || !accountType.equals("checking")){
			System.out.println("Enter a valid account type"); 
		}
	}
	
	public void withdraw(String accountType, double amount) {
		accountType = accountType.toLowerCase();
		
		// Savings Deposit
		if(accountType.equals("savings")) {
			//	Checking to see if balance is high enough
			if(savingsBalance > amount) {
				//	Enough Funds
				savingsBalance-= amount;
				System.out.println("You withdrew " + amount + " Your savings balance is now " + savingsBalance);
				// Not Enough Funds
			} else {
				System.out.println("Your balance is " + savingsBalance + " you dont have enough in your account");
			}
			
			// Checking Deposit
		} else if  (accountType.equals("checking")) {
			// Checking to see if balance is high enough
			if(checkingBalance > amount) {
				// Enough Funds
				checkingBalance-= amount;
				System.out.println("You withdrew " + amount + " Your checking balance is now " + checkingBalance);
				// Not Enough Funds
			} else {
				System.out.println("Your balance is " + checkingBalance + " you dont have enough in your account");
			}
			// Wrong Account Type
		} else if (!accountType.equals("savings") || !accountType.equals("checking")){
			System.out.println("Enter a valid account type"); 
		}	
	}
	
	public void checkTotal() {
		double total = checkingBalance + savingsBalance;
		System.out.println("Total from both checking and Savings " + total);
	}
	
}
