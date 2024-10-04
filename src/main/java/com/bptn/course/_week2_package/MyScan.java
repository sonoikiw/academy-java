package com.bptn.course._week2_package;

import java.util.Scanner;

public class MyScan {

	public static void main(String[] args) {
Scanner scan = new Scanner (System.in);
		
System.out.println("Enter a number");
		int negName = scan.nextInt();
		
		if (negName > 0) {
			System.out.println("Number is positive");
			
		}else {
			System.out.println("Number is negative");
		}
		
	scan.close();
	

	}

}
