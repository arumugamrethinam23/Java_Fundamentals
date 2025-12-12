package com.basics;

import java.util.ArrayList;
import java.util.List;

public class ControlStruture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 65;
    //For loop 
        if (age < 0) {
            System.out.println("Invalid age!");
        } 
        else if (age <= 12) {
            System.out.println("You are a Child.");
        } 
        else if (age <= 19) {
            System.out.println("You are a Teenager.");
        } 
        else if (age <= 59) {
            System.out.println("You are an Adult.");
        } 
        else {
            System.out.println("You are a Senior Citizen.");
        }
        //While loop stops when condition is met
        
        System.out.println("Stop when we find number 8");

        int value = 1;
        while (value <= 10) {
            if (value == 8) {
                System.out.println("Found 8! Stopping loop.");
                break; // exits the loop
            }
            System.out.println("Checking value: " + value);
            value++;
        }
        
        
        //Switch case - checking the order status 
        String orderStatus = "Packed";

        switch (orderStatus) {
            case "Ordered":
                System.out.println("Your order has been placed.");
                break;

            case "Packed":
                System.out.println("Your order is packed.");
                break;

            case "Shipped":
                System.out.println("Your order is on the way!");
                break;

            case "Delivered":
                System.out.println("Your order has been delivered.");
                break;

            default:
                System.out.println("Unknown status.");
        }
        // For - Each 
        String[] cartItems = {
            "Apple iPhone 15",
            "Samsung 55-inch TV",
            "Boat Airdopes 200",
            "HP Laptop i5"
        };

        System.out.println("Cart items:");
        for (String item : cartItems) {
            System.out.println("- " + item);
        }

        // ArrayList of prices — compute total using for-each
        
        List<Double> prices = new ArrayList<>();
        prices.add(79999.0);
        prices.add(54999.0);
        prices.add(1999.0);
        prices.add(45999.0);

        double total = 0.0;
        for (Double price : prices) {
            total += price;   // accumulate the sum
        }
        System.out.println("Total cart value: ₹" + total);
	}

}
