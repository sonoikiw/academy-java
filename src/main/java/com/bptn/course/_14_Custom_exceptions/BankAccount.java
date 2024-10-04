package com.bptn.course._14_Custom_exceptions;

public class BankAccount {
	
	private double balance;
	private String accountNumber;
	
	public BankAccount(double balance, String accountNumber ) {
		this.balance = balance;
		this.accountNumber =accountNumber;
		
	}

	public void withdraw(double amount) {
		
		balance -= amount; //balance = balance - amount;
		
		System.out.println("Withdraw of $" +amount + " successful");
	}
	public static void main(String[] args) {
		

	}

}
