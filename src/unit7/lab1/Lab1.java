package unit7.lab1;

import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args) {
		// #1a, #2a
		double[] x = { 8, 4, 5, 21, 7, 9, 18, 2, 100 };
		// #1b
		System.out.println("Length of x: " + x.length);
		// #1c
		System.out.println("First element: " + x[0]);
		// #1d
		System.out.println("Last element: " + x[8]);
		// #1e
		System.out.println("x[x.length-1] " + x[x.length - 1]); // The previous index was 8, and the length - 1 is also
																// 8
		// #1f
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i] + " ");
		}
		// #1g
		for (int i = 0; i < x.length; i++) {
			System.out.println(i + " element: " + x[i]);
		}
		// #1h
		for (int i = (x.length - 1); i >= 0; i--) {
			System.out.println(i + " element: " + x[i]);
		}
		// #1i
		for (double e : x) {
			System.out.println(e);
		}

		// #2b
		double sum = 0;
		for (double e : x) {
			sum += e;
		}
		System.out.println("The sum of the elements in the array: " + sum);
		// #2c
		sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println("The sum of the elements in the array: " + sum);
		// #2d
		double max = x[0];
		for (double e : x) {
			if (max < e) {
				max = e;
			}
		}
		System.out.println("The maximum value in the array is: " + max);
		// #2e
		double min = x[0];
		int index = 0;
		for (int i = 0; i < x.length; i++) {
			if (min > x[i]) {
				min = x[i];
				index = i;
			}
		}
		System.out.println(
				"The minimum value in the array is: " + min + " which is the " + index + " element in the array");
		// #3
		String[] customerName = { "Cathy", "Ben", "Jorge", "Wanda", "Freddie" };
		for (int i = 0; i < customerName.length; i++) {
			System.out.println(i + " name: " + customerName[i]);
		}
		// #4
		for (String e : customerName) {
			System.out.println(e);
		}
		// #5
		double[] customerBalance = new double[customerName.length];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < customerBalance.length; i++) {
			System.out.println("Enter a balance for " + customerName[i] + ": ");
			customerBalance[i] = in.nextDouble();
		}
		for (int i = 0; i < customerName.length; i++) {
			System.out.println(customerName[i] + " has a balance of " + customerBalance[i]);
		}
		// #6
		int[][] array = {
			{1, 2, 3, 4, 5},
			{6, 7, 8, 9, 10},
			{11, 12, 13, 14, 15}
		};
		sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}
		System.out.println("The sum of all 15 elements in the 2d array is: " + sum);
		for (int[] a: array) {
			double rowSum = 0;
			for (int e: a) {
				rowSum += e;
			}
			System.out.println("The sum of this row is: " + rowSum);
		}
		// For each column
		for (int i = 0; i < array[0].length; i++) {
			double colSum = 0;
			// Add up the i element of each row (for the column)
			for (int[] a: array) {
				colSum += a[i];
			}
			System.out.println("Sum of " + i + " column: " + colSum);
		}
		// #7
		int[][] multTable = new int[10][10];
		for (int i = 0; i < multTable.length; i++) {
			for (int j = 0; j < multTable[i].length; j++) {
				if ((i * j) == 0) {
					multTable[i][j] = (i + j);
				}
				else {
					multTable[i][j] = (i * j);
				}
			}
		}
		for (int[] a: multTable) {
			for (int e: a) {
				System.out.print(e + "\t");
			}
			System.out.println();
		}

		Jukebox box = new Jukebox();
		System.out.println(box);
		box.randomSong();
		box.playSongofRating(3); 
	}
}