package com.bptn.course._builtin_exceptions._01_checked_exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {

	public static void main(String[] args) {
		
          try {
			readFile("Result.txt");
		} catch (FileNotFoundException e) {
			
			System.out.println("an error occured: " + e.getMessage());
		}
	}
	
	//create a method which reads a file
	
	public static void readFile(String fileName) throws FileNotFoundException {
		
		//create an object of FileReader
		
		FileReader fileReader =new FileReader(fileName);

}
}
