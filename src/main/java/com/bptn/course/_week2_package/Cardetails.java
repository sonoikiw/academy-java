package com.bptn.course._week2_package;

public class Cardetails {
    // Declare the variables
    String color;
    String brand;
    int price;

    // Constructor that assigns constructor arguments to instance variables using the 'this' keyword
    public Cardetails(String color, String brand, int price) {
        this.color = color;  // 'this' keyword points to the instance variable 'color'
        this.brand = brand;  // 'this' keyword points to the instance variable 'brand'
        this.price = price;  // 'this' keyword points to the instance variable 'price'
    }

    // Function to print car details
    public void printCarDetails() {
        System.out.println("Color: " + this.color);  // 'this' keyword used here to refer to instance variables
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
    }


    public static void main(String args[]) {
        Cardetails car1 = new Cardetails("white", "BMW", 70000);                                
        car1.printCarDetails();
   } 
}
