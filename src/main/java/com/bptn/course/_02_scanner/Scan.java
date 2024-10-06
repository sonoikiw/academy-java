package com.bptn.course._02_scanner;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		String userName;
		       
		System.out.println("Enter username: ");
		userName = scan.nextLine();
		
		System.out.println("The username entered is " + userName);
		
		scan.close();

	}
}
