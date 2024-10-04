package com.bptn.course._09_Abstraction;

//Create an interface
interface ShapeInterface{
	
	//Before Java 8- interface only used to have abstract methods and constants
	void draw();
	
	double getArea();
}


class RectangleClass implements ShapeInterface{

	private double width;
	private double height;
	
	@Override
	public void draw() {
		 
		System.out.println("Draw a rectangle");
	}

	@Override
	public double getArea() {
		 
		return width * height;
	}
	
}

public class Abstraction2 {

	public static void main(String[] args) {
	

		//create an instance of Rectangle class
		RectangleClass r1 = new RectangleClass();
		r1.draw();
		
	}

}

//Major key takeways:
//1. Interfaces cannot be instantiated
//2. Before Java 8- Interface only used to have abstract methods and constants
//3. Abstract methods within an interface is implemented using sub-class