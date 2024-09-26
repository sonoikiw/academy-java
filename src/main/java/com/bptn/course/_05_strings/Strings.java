package com.bptn.course._05_strings;

public class Strings {

	public static void main(String[] args) {
		
		//to create a new string
		String s = "Hello World";
		
		//find total length of string and store in a variable
		int stringLength= s.length();
		
		System.out.println("The lenght of the string is : "+stringLength);
		
		String sub = s.substring(0, 8);
		
		System.out.println("The substring with start index 0 and end index 8: "+ sub );
		
		String sub1= s.substring(3);
		
		System.out.println("The substring with start index 3 " + sub1);
		
		//toLowerCase() -Converts all the lettes of the string to lowercase
		
		String lowerCaseString = s.toLowerCase();
		
		System.out.println("The Lowercase of the string is: " + lowerCaseString);
		
		//toUpperCase() -Converts all the lettes of the string to Uppercase
		
        String UpperCaseString = s.toUpperCase();
		
		System.out.println("The Uppercase of the string is: " + UpperCaseString);
		
		int index = s.indexOf("World");
		
	    System.out.println("The index of World is: "+index);
	    
	    //find the chaaracter at the specified index -0
	    
	    char c = s.charAt(0);
	    
	    System.out.println("The character at index 0: "+ c);
	    
	    //Find the character at the specified index -3
	    
	    char c1 = s.charAt(3);
	    
	    System.out.println("The character at index 3: "+ c1);
	    
//	    for(int i= s.length()-1 : i>=0 );
		
		
		
	}
	
}
