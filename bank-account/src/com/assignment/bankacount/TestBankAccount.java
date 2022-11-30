package com.assignment.bankacount;

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount bensPoorAssAccount = new BankAccount();
		
		System.out.println(bensPoorAssAccount.getCheckingBalance());
		System.out.println(bensPoorAssAccount.getSavingsBalance());
		
		bensPoorAssAccount.deposit("checking", 100.1);
		System.out.println(bensPoorAssAccount.getCheckingBalance());
		bensPoorAssAccount.deposit("Savings", 50.1);
		bensPoorAssAccount.deposit("checking", 100.1);
		
		bensPoorAssAccount.withdraw("Savings", 25.1);
		bensPoorAssAccount.withdraw("Checking", 25.1);
		
		bensPoorAssAccount.checkTotal();
	}

}
