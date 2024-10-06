package com.bptn.course._14_Custom_exceptions._01_customs_exception;

import com.bptn.course._14_Custom_exceptions.BankAccount;

public class Main {

	public static void main(String[] args) {

      BankAccount ba = new BankAccount(1000, "43589");
      
      try {
    	  ba.withdraw(200);
    	  ba.withdraw(600);
    	  ba.withdraw(600);
    	  
      }catch (InsufficientFundsException e) {
    	  
    	  System.out.println("Insufficient Funds. You need $sni");
      }

	}

}
