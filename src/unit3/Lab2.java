package unit3;

import javax.swing.JOptionPane;

public class Lab2 {
	public static void main(String[] args) {
		// Part 1
		/*
		for (int i = 1; i <= 10; i++) {
			// Print i, i^2, then a number between i and i^2
			// Math.random() * (i*i - i) Ensures Math.random is not more than the square
			// That plus i ensures the random number is at least i
			System.out.println(i + "\t" + (i * i) + "\t" + (int) ((Math.random() * ((i * i) - i) + i)));
		}
		/*
		// Part 2
		/*
		int[] arr = new int[50];
		for (int index = 0; index < arr.length; index++) {
			arr[index] = (int) (Math.random() * 101);
		}
		int max = arr[0];
		for (int element: arr) {
			System.out.print(element + " ");
			if (element > max){
				max = element;
			}
		}
		System.out.println("\n" + max + " is the largest number");
		*/
		// Part 3
		/*
		int arr[] = new int[10];
		int numPositive = 0;
		for (int index = 0; index < arr.length; index++) {
			// 50/50 for negative or positive
			if (Math.random() < 0.5) {
				// Make it negative
				arr[index] =  - (int) (Math.random() * 101);
			}
			else {
				// Make it positive
				arr[index] =  (int) (Math.random() * 101);
				numPositive++;
			}
		}
		int min = arr[0];
		for (int element: arr) {
			System.out.println(element);
			if (element < min) {
				min = element;
			}
		}
		System.out.println("There are " + numPositive + " positive numbers");
		System.out.println("The smallest number is " + min);
		*/
		// Part 4
		/*
		int numDays = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of days whose forecast you desire up to 31: "));
		int[] days = new int[numDays];
		for (int i = 0; i < days.length; i++) {
			// Starts from one
			days[i] = i + 1;
		}
		int[] dailyTemps = new int[numDays];
		for (int i = 0; i < dailyTemps.length; i++) {
			if (Math.random() < 0.5) {
				// Make it negative
				dailyTemps[i] =  - (int) (Math.random() * 101);
			}
			else {
				// Make it positive
				dailyTemps[i] =  (int) (Math.random() * 101);
			}
		}
		String[] forecast = new String[numDays];
		for (int i = 0; i < forecast.length; i++) {
			if (dailyTemps[i] >= 80) {
				forecast[i] = "Hot!";
			}
			else if (dailyTemps[i] >= 50) {
				forecast[i] = "Moderate";
			}
			else if (dailyTemps[i] >= 32) {
				forecast[i] = "Cold";
			}
			else {
				forecast[i] = "Freezing!";
			}
		}
		for (int i = 0; i < numDays; i++) {
			System.out.println(days[i] + "\t" + dailyTemps[i] + "\t" + forecast[i]);
		}
		*/
		// Part 5
		int originalArr[] = new int[15];
		int modifiedArr[] = new int[15];
		int numEven = 0;
		for (int i = 0; i < originalArr.length; i++) {
			originalArr[i] = (int) (Math.random() * 26);
			modifiedArr[i] = originalArr[i];
		}
		for (int i = 0; i < originalArr.length; i++) {
			if (originalArr[i] % 2 == 0) {
				numEven++;
				modifiedArr[i] = 0;
			}
		}
		System.out.println("Original array: ");
		for (int element: originalArr) {
			System.out.print(element + " ");
		}
		System.out.println("\nModified array: ");
		for (int element: modifiedArr) {
			System.out.print(element + " ");
		}
		System.out.println("\nThere are " + numEven + " even numbers in the original array, and " + (originalArr.length - numEven) + " odd numbers in the array");
	}
}