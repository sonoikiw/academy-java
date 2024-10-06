package com.bptn.course._exercises;

public class Testing {


	public static void main(String[] args) {
		try {
			System.out.println("In the kitchen (outer try block)");

			try {

				int[] temperatures = {200, 300, 400};
				System.out.println(temperatures[5]); // Might cause stove fire (ArrayIndexOutOfBoundsException)
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Handled stove fire! (inner catch block)");
			}
			try {

				// Simulating another problem in the kitchen
				int water = 10 / 0; // Might cause a general kitchen problem (ArithmeticException)

			} catch (NullPointerException e) {
				System.out.println("The gas is broken !(inner catch block)");
			}
		} catch (Exception e) {
			System.out.println("Handled kitchen-wide problem (outer catch block)");
		}
	}
}
