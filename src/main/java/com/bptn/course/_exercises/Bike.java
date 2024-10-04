package com.bptn.course._exercises;

//Bike.java
public class Bike extends Vehicle {
 String bikeHandle;  // Made public to directly access in main

 // Parameterized constructor for Bike
 public Bike(String colour, String brand, String bikeHandle) {
     // Call the superclass (Vehicle) constructor
     super(colour, brand);
     this.bikeHandle = bikeHandle;
 }
}
