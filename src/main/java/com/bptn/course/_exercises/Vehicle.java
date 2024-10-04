package com.bptn.course._exercises;

//Vehicle.java
public class Vehicle {
	protected String colour;  // Made public to directly access in main
	protected String brand;  // Made public to directly access in main
	
	

	// Parameterized constructor
	public Vehicle(String colour, String brand) {
		this.colour = colour;
		this.brand = brand;
	}
    public static void main(String[] args) {
        // Creating a Car object
        Car car = new Car("White", "Audi", "Chromecoloured");

        // Creating a Bike object
        Bike bike = new Bike("Grey", "BMW", "Silvercoloured");

        // Printing the car details directly
        System.out.println(car.colour + " " + car.brand + " " + car.steeringWheel);

        // Printing the bike details directly
        System.out.println(bike.colour + " " + bike.brand + " " + bike.bikeHandle);
    }
}