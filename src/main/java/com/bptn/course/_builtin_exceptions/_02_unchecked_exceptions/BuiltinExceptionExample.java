package com.bptn.course._builtin_exceptions._02_unchecked_exceptions;

public class BuiltinExceptionExample {
	
	//create a method-which checks if the number of positive or negative
	//throws- always comes in the method signature which warns
	//method has the ability to ensounter a cituation and should be in a position to handle it

	public static void checkPositive(int number) throws IllegalArgumentException {
		
		if(number <0) {
			throw new IllegalArgumentException("The number must be postitve");
		}
		
		System.out.println("The number is positive");

	}
	
	public static void main(String[] args) {
		
		try {
			checkPositive(10); //this call is expected to be fine
			checkPositive(-10);
			
		}
		catch(IllegalArgumentException e) {
			System.out.println("Caught and exception: "+ e.getMessage());
		}
		
		
	}

}
