package com.bptn.course._builtin_exceptions._02_unchecked_exceptions;

public class ArithmeticExceptiosExample {

	public static void main(String[] args) {

		// critical statement

		try {
			int result =10/0;
			System.out.println(result);
		}
		catch(ArithmeticException e) {

			System.out.println("An Error occured: "+ e.getMessage());
		}
	}
}

