//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//

package week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
		int availableSeats = 56;
		
		// 2. Create a variable to hold the cost of groceries at checkout
		double costGroceries =  24.88;
		
		// 3. Create a variable to hold a person's middle initial
		char middleInitial = 'J';
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean hotOrCold = false;
		
		// 5. Create a variable to hold a customer's first name
		String firstName = "Thomas"; 
	
		
		// 6. Create a variable to hold a street address
		String streetAddress = "490 Hancock Ave";

		// 7. Print all variables to the console
		System.out.println("Available seats left on the plane: " + availableSeats);
		System.out.println(costGroceries + " is the price for groceries.");
		System.out.println("Middle initial is " + middleInitial);
		System.out.println("Is it hot out: " + hotOrCold);
		System.out.println("Customer first name: " + firstName);
		System.out.println("Street Address: " + streetAddress);
		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		availableSeats = availableSeats - 2;
		System.out.println("Available seats left on the plane: " + availableSeats);
	    
		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		costGroceries = costGroceries + 2.15; 
		System.out.println(costGroceries + " is the new price for groceries.");
		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		middleInitial = 'R'; 
		System.out.println("Middle initial is " + middleInitial);

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		hotOrCold = !hotOrCold;
		System.out.println("It is hot out: " + hotOrCold);

		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String fullName = firstName + " " + middleInitial + " Friedman";
		System.out.println(fullName); 
		
		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		System.out.println("This is, " + fullName + "." + " This customers address is: " + streetAddress);
		
		
	}
}