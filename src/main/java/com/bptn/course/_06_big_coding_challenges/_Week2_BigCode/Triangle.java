package com.bptn.course._06_big_coding_challenges._Week2_BigCode;

public class Triangle {

	// Introduce the method to calculate perimeter which is a+b+c
	public int perimeterCalculator(int a, int b, int c) {
		return a + b + c ;
	}

	// Introduce a method to calculate the area of the triangle wich is 1/2b*h
	public int areaCalculator(int a, int b) {
		return (a*b)/2 ;
	}

	// Do not modify the code below:
	public static void main (String[]args){

		Triangle object = new Triangle();

		int a = 7;
		int b = 10;
		int c = 35;

		int perimeter = object.perimeterCalculator(a,b,c);
		int area = object.areaCalculator(7,10);

		System.out.println("Perimeter of the triangle is: " + perimeter + "\nThe Area of the Triangle is: " + area);
	}
}



//To calculate the perimeter of a triangle, you add all the sides of the triangle.
//Being three sides, perimeter = a + b + c
// We create an instance of the Triangle class.
// Variables a, b, and c are defined for the sides of the triangle.
// The perimeterCalculator method calculates the perimeter.
// The areaCalculator method calculates the area based on the base and height.
// The results are printed using System.out.println().




