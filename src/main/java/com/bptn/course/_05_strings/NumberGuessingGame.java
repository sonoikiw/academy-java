package com.bptn.course._05_strings;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("targetNumber: " + 23);
			System.out.print("guess: ");
			int num = scan.nextInt();
			
			if (num > 23){
				System.out.println("Too high! Try again.");
			}
			
			else if (num == 23){
				System.out.println("Congratulations! You guessed the number correctly!");
			}
			
			else {
			   System.out.println("Too low! Try again.");
			}
			scan.close();
			}
			

	}


////This program asks the user to guess a number (which is always 23). It then tells the user if their guess is too high, too low, or correct. The program only checks one guess and ends right after giving feedback.

//Good part: The code is straightforward and easy to follow.
//Downside: You only get one chance to guess, and the game stops whether you get it right or wrong.