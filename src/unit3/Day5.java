package unit3;

import java.util.Scanner;

public class Day5 {
	public static void main(String[] args) {
		// int[] values = {23, 6, 47, 35, 2, 14}; // for a-c
		int[] values = new int[6]; // for d and e
		Scanner in = new Scanner(System.in); // For e
		for (int i = 0; i < values.length; i++) {
			// values[i] = (int) (Math.random() * 21); // for d
			// For e
			System.out.println("Enter an integer: "); // For e
			values[i] = in.nextInt(); // For e
		}
		in.close(); // For e
		int sum = 0;
		int min = values[0];
		for (int element: values) {
			// Sum the values for the average
			sum += element;
			// Find minimum value
			if (element < min) {
				min = element;
			}
			// Print odd numbers
			if (!(element % 2 == 0)) {
				System.out.println(element + " is an odd number");
			}
		}
		// Print the average
		System.out.println("The average is: " + (sum / values.length));
		// Print the minimum
		System.out.println("The minimum values is: " + min);
	}
}