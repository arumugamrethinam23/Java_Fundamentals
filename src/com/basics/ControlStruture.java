package com.basics;

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
	}

}
