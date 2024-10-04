package com.bptn.course._09_Abstraction;

//Abstraction using Abstract class

//Abstract class cannot be instantiated (it cannot be used to create objects)

abstract class Shape {

	// create a concrete(normal) method that has some implementation
	void moveTo(int x, int y) {
		System.out.println("Move to: " + x + y);
	}

	// Abstract method- has no implementation
	abstract void draw();

	abstract void print();

}

//Create a subclass(child class) that extends Shape class
class Circle extends Shape {

	@Override
	void draw() {

		System.out.println("Draw a circle");
	}

	@Override
	void print() {

		System.out.println("Print a circle");
	}

}

class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("Draw a rectangle");

	}

	@Override
	void print() {

		System.out.println("Print a rectangle");
	}

}

public class Abstraction1 {

	public static void main(String[] args) {

		// Create an object from Circle class
		Circle c1 = new Circle();
		c1.draw();

		c1.moveTo(2, 3);

		// Create an object from Rectangle class
		Rectangle r1 = new Rectangle();
		r1.draw();
		r1.print();

	}

}

//Major key takeaways:
//1. Abstract class cannot be instantiated (it cannot be used to create objects)
//2. Abstract method- has no implementation
//3. Abstract class can consist of concrete(normal) methods(has implementation) and abstract methods(no implementation)
//4. The only way abstract methods can be implemented is by creating a subclass
//that extends the abstract class
//5. Abstract class may have abstract methods (no implementation) so that the sub class can implement it

//Properties of abstract class:
//1. Can have both abstract and concrete methods
//2. It can also have instance variables, subclasses inherit those instance variables
//3. Abstract class can have constructors
//4. Supports only single inheritance- Meaning a sub class can only extend one abstract class
//5.Sub class that extends the abstract class can inherit all the properties and methods from
//abstract class that improves code's reusability