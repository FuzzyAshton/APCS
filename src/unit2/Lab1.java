package unit2;

import java.util.Scanner;

public class Lab1 {
	private static Scanner in;
	// Part 1
	/* 
	public static void main(String[] args) {
		in = new Scanner(System.in);
		// Ask for month of birthday
		System.out.println("Please enter the month of your birthday as a number. May is '5': ");
		int month = getValidInt();
		// Ask for the day of birthday
		System.out.println("Please enter the day of your birthday. The first is 1, the 15th is 15: ");
		int day = getValidInt();
		// Divides the year into 4 quarters, needs to be an int to fit into 4 discrete
		// quarters.
		// Quarter is 2 when greater than 1, less than 3, etc
		double quarter = month / 4.0;
		// Quarter is the one that includes tax day, if between 1 and 3 it is quarter 2
		if (quarter >= 1 && quarter < 3) {
			// If April it can be before
			if (month == 4) {
				// If before tax day
				if (day < 15) {
					System.out.println("Your birthday is before tax day");
				} else if (day == 15) {
					System.out.println("Your birthday is on tax day. Lucky you...");
				} else {
					System.out.println("Your birthday is after tax day");
				}
			// If not Paril it cannot be before tax day
			} else {
				System.out.println("Your birthday lies after tax day");
			}
		}
		else if (quarter < 1) {
			System.out.println("Your birthday is before tax day");
		}
		else {
			System.out.println("Your birthday is after tax day");
		}
	}
	*/
	// Validate input to avoid errors when the user does not input a number
	public static int getValidInt() {
		while (!in.hasNextInt()) {
			System.out.println("Enter a valid integer.");
			in.next();
		}
		return in.nextInt();
	}
	//  Part 2
	public static void main(String[] args) {
		in = new Scanner(System.in);
		// Part 2a
		/*
		System.out.println("Please enter an integer: ");
		int a = getValidInt();
		// Check if divisible by 5 and 3
		if (a % 5 == 0 && a % 3 == 0) {
			System.out.println(a + " is divisible by 5 and 3");
		}
		// Check if divisible by 5, if so, it is not divisible by 3 due to the previous check
		else if (a % 5 == 0) {
			System.out.println(a + " is divisible by 5");
		}
		// Check if divisible by 3, if so, it is not divisible by 5 due to the previous check
		else if (a % 3 == 0) {
			System.out.println(a + " is divisible by 3");
		}
		else {
			System.out.println(a + " is divisible by neither 5 or 3");
		}
		*/
		// Part 2b
		System.out.println("Please enter two integers. The integers must not share any factors other than 1, and the second integer must be greater than the first and less than 100. Then enter an integer that is between b and 100");
		int a = getValidInt();
		int b = getValidInt();
		int n = getValidInt();
		int count = 0;
		// See how many multiples there are of a and b before n but only count overlap once
		for (int i = a; i < n; i+=a){
			// Do not count overlap, so if it doesn't overlap,
			if (!(i % b == 0)) {
				count++;
			}
		}
		for (int i = b; i < n; i+=b) {
			// Overlap accounted for before, so it is not necessary to check the second time
			count++;
		}
		System.out.println("Between a and b, there are " + count + " multiples less than or equal to " + n);
	}
}