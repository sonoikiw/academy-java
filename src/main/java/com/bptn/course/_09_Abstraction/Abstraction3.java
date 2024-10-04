package com.bptn.course._09_Abstraction;



//implementation of interface after java 8
//From Java 8 version, interfaces can support abstract methods, default methods and static methods

interface Operations{
	
	void draw(); //abstract method- no implementation
	
	//default method - it has some implementation
	default int add(int a, int b) {
		return a+b;
	}
	
	//static method
	static double getRandomNumber() {
		return Math.random();
	}
	
}


class Calculator implements Operations{

	//Compiler enforces the sub class to implement/override the abstract methods from the interface
	@Override
	public void draw() {
		
		System.out.println("Draw method implemented by Calculator class");
		
	}
	
//Compiler do not enforce us to override the default methods- but sub-class can be override if required 	
//static methods cannot be overridden
	
	
}

public class Abstraction3 {

	public static void main(String[] args) {
		
		//Create an object from the Calculator class
		Calculator c1= new Calculator();
		c1.draw();
		
		int result = c1.add(2, 3);
		
		System.out.println("Result: "+ result);
		
		//Calling the static method using the interface name
		System.out.println("Random number: "+ Operations.getRandomNumber());

	}

}


//Major key takeways:
//1. Interfaces cannot be instantiated
//2. Abstract methods within an interface is implemented using sub-class
//3. Interfaces support multiple inheritance
//4. From Java 8 version, interfaces can support abstract methods, default methods and static methods

//Properties:
//1. Interfaces cannot have instance variables
//2. Interfaces cannot have constructors
//3. it can consist of constants 