package unit2;

import java.util.Scanner;

public class Lab2 {
	private static Scanner in;
	// Part 1
	/*
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 60; i++) {
			if (i % 6 == 0) {
				sum += i;
				System.out.println(i + "\t" + sum);
			}
		}
	}
	*/
	// Part 2
	/*
	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("Please enter 10 integers.");
		int sum = 0;
		String numbers = "";
		String work = "";
		for (int i = 0; i < 10; i++){
			int inputNumber = getValidInt();
			// Add the number to the output
			work += inputNumber;
			numbers += inputNumber;
			// 2b, alternate on each different number.
			// On even iterations, add the number
			if (i % 2 == 0) {
				sum += inputNumber;
				// Show symbol for next case
				work += " - ";
				numbers += ", ";
			}
			// On odd iterations, subtract the numbers
			else {
				sum -= inputNumber;
				// Add a plus sign to show work except at the end
				if (i != 9){
					// Show symbol for next case
					work += " + ";
					numbers += ", ";
				}
				
			}
		}
		// Add the equals sign and the final result
		work += " = " + sum;
		System.out.println(numbers);
		System.out.println(work);
	}
	*/
	// Part 3
	/*
	public static void main(String[] args) {
		for (int i = 1; i < 10; i += 2){
			// Print one half of the surrounding '-'s for the 11 columns
			for (int j = 0; j < (11 - i) / 2; j++){
				System.out.print("-");
			}
			// Fill the inside with i number of i's
			for (int j = 0; j < i; j++){
				System.out.print(i);
			}
			// Print the other half of the surrounding '-'s for the 11 columns
			for (int j = 0; j < (11 - i) / 2; j++) {
				System.out.print("-");
			}
			// Start a new line
			System.out.println();
		}
	}
	*/
	// Part 4
	/*
	public static void main(String[] args) {
		for (int row = 1; row <= 10; row++){
			for (int column = 1; column <= 20; column++) {
				// Print row number of stars
				if (column <= row) {
					System.out.print("*");
				}
				// Print row number of stars at the end
				else if (column > 20 - row){
					System.out.print("*");
				}
				// Otherwise, if it is between the peaks, print a blank
				else {
					System.out.print(" ");
				}
			}
			System.out.println(); // End the line
		}
	}
	*/
	// Part 5
	public static void main(String[] args) {
		// Store a number between 1 and 20
		int randNum = (int) (Math.random() * 20 + 1);
		in = new Scanner(System.in);
		System.out.println("Guess my number between 1 and 20. You get 5 tries.");
		for (int i = 1; i <= 5; i++) {
			System.out.println("This is your #" + i + " attempt:");
			int guess = getValidInt();
			if (guess == randNum) {
				System.out.println("Success! You guessed my number. It was " + randNum);
				break;
			}
			// Give hints
			else {
				if (guess > randNum) {
					System.out.println("Guess lower");
				}
				else {
					System.out.println("Guess higher");
				}
			}
		}
	}

	// Validate input to avoid errors when the user does not input a number
	public static int getValidInt() {
		while (!in.hasNextInt()) {
			System.out.println("Enter a valid integer.");
			in.next();
		}
		return in.nextInt();
	}
}