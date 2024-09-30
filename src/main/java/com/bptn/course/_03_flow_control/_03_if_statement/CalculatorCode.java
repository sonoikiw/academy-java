package com.bptn.course._03_flow_control._03_if_statement;

import java.util.Scanner;

public class CalculatorCode {

	public static void main(String[] args) {
		// Step 1: Create an object from the scanner class
				Scanner myObj= new Scanner(System.in);
				
			//print out calculator menu	
				System.out.println("/…Calculator Menu…/");
				System.out.println("Press 1 for addition");
				System.out.println("Press 2 for subtraction");
				System.out.println("Press 3 for multiplication");
				System.out.println("Press 4 for division");
				System.out.println("Press 5 to square a number");
				System.out.println("Press 6 to find a square root");
				System.out.println("Press 7 to find the reciprocal");
				
				int choice = myObj.nextInt(); //Read user's Input
				// Variables to store numbers
		        double num1, num2, result;
				
				if (choice == 1) {
		            // Addition
		            System.out.println("Enter first number:");
		            num1 = myObj.nextDouble();
		            System.out.println("Enter second number:");
		            num2 = myObj.nextDouble();
		            result = num1 + num2;
		            System.out.println("Result of addition: " + result);
		        } 
		        else if (choice == 2) {
		            // Subtraction
		            System.out.println("Enter first number:");
		            num1 = myObj.nextDouble();
		            System.out.println("Enter second number:");
		            num2 = myObj.nextDouble();
		            result = num1 - num2;
		            System.out.println("Result of subtraction: " + result);
		        } 
		        else if (choice == 3) {
		            // Multiplication
		            System.out.println("Enter first number:");
		            num1 = myObj.nextDouble();
		            System.out.println("Enter second number:");
		            num2 = myObj.nextDouble();
		            result = num1 * num2;
		            System.out.println("The product of the numbers is: " + result);
		        } 
		        else if (choice == 4) {
		            // Division
		            System.out.println("Enter first number:");
		            num1 = myObj.nextDouble();
		            System.out.println("Enter second number:");
		            num2 = myObj.nextDouble();
		            if (num2 != 0) {
		                result = num1 / num2;
		                System.out.println("Result of division: " + result);
		            } else {
		                System.out.println("Error: Division by zero is not allowed.");
		            }
		        } 
		        else if (choice == 5) {
		            // Square a number
		            System.out.println("Enter a number to square:");
		            num1 = myObj.nextDouble();
		            result = Math.pow(num1, 2);
		            System.out.println("Square of the number: " + result);
		        } 
		        else if (choice == 6) {
		            // Square root
		            System.out.println("Enter a number to find its square root:");
		            num1 = myObj.nextDouble();
		            if (num1 >= 0) {
		                result = Math.sqrt(num1);
		                System.out.println("Square root of the number: " + result);
		            } else {
		                System.out.println("Error: Square root of a negative number is not possible.");
		            }
		        } 
		        else if (choice == 7) {
		            // Reciprocal
		            System.out.println("Enter a number to find its reciprocal:");
		            num1 = myObj.nextDouble();
		            if (num1 != 0) {
		                result = 1 / num1;
		                System.out.println("The Reciprocal of the number is: " + result);
		            } else {
		                System.out.println("Error: Reciprocal of zero is not defined.");
		            }
		        } 
		        else {
		            // Invalid choice
		            System.out.println("Invalid choice! Please make a valid choice.");
		            System.out.println("To continue calculation Press 1, else press any other number to exit");
		            
		        }

		        // Close the scanner
		        myObj.close();
		    }
		}
				



