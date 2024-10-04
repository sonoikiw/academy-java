package com.bptn.course._builtin_exceptions._02_unchecked_exceptions;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		
		String text = null;
		
		try {
			System.out.println("Lenght of the String is: " + text.length());
		}

	}

}
