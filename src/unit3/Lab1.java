package unit3;

import java.util.Collections;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Lab1 {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		// Part 1 and 2
		/*
		String[] favMovies = new String[3];
		String[] favSongs = new String[3];
		for (int j = 0; j < favMovies.length; j++) {
			System.out.println("Enter one of your favorite movies: ");
			favMovies[j] = in.nextLine();
		}
		for (int i = 0; i < favSongs.length; i++) {
			System.out.println("Enter one of your favorite songs: ");
			favSongs[i] = in.nextLine();
		}
		// Print movies
		for (String element: favMovies) {
			System.out.println(element);
		}
		System.out.print("\n\n");
		int count = 0;
		// Print all but last favSong to avoid extra comma
		while (count < favSongs.length-1) {
			System.out.print(favSongs[count] + ", ");
			count++;
		}
		System.out.println(favSongs[favSongs.length-1]);
		*/
		// Part 3
		/*
		int[] someIntegers = new int[10];
		for (int i = 0; i < someIntegers.length; i++) {
			// Start from 2, only evens
			someIntegers[i] = 2 + (i * 2);
			System.out.print(someIntegers[i] + " ");
		}
		System.out.println("There are " + someIntegers.length + " positive numbers in the array");
		*/
		// Part 4
		/*
		int[] nums = new int[50];
		for (int i = 0; i < nums.length; i++) {
			// 0 to 100
			nums[i] = (int) (Math.random() * 101);
		}
		int evenNums = 0;
		int oddNums = 0;
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] % 2 == 0){
				evenNums++;
			}
			else {
				oddNums++;
			}
			System.out.print(nums[index] + " ");
		}
		System.out.println("\nThere are " + evenNums + " even numbers and " + oddNums + " odd numbers in the array.");
		*/
		// Part 5
		/*
		String[] prizes = {"Zonk Motorcycle", "New office", "2019 Toyota Corolla", "Trip to Zonk Island", "State-of-the-art Kitchen", "Wayne Brady Himself"};
		System.out.println("There are six doors. They have good or bad prizes behind them. Pick a door: ");
		int choice = 0;
		do {
			choice = getValidInt();
		} while (choice < 1 || choice > 6);
		System.out.println("You won: " + prizes[choice - 1]);
		System.out.println("Enter 0 to keep the prize, or enter 1 to spin a wheel to get a different prize. If it lands on the one you had, you win nothing.");
		do {
			choice = getValidInt();
		} while (choice != 1 && choice != 0);
		if (choice == 1) {
			int wheelSpin = (int) (Math.random() * 6);
			if (prizes[choice - 1].equals(prizes[wheelSpin])){
				System.out.println("You win nothing.");
			}
			else {
				System.out.println("You traded your prize of " + prizes[choice - 1] + " for " + prizes[wheelSpin]);
			}
		}
		else {
			System.out.println("Enjoy your prize of " + prizes[choice-1]);
		}
		*/
		// Part 6
		/*
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "\t" + (i * i));
		}
		*/
		// Part 7
		in.close();
		String userName = JOptionPane.showInputDialog(null, "Enter your username: ");
		int password = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your password: "));
		if (userName.equals("username") && password == 12345678) {
			System.out.println("Login Successful. Thanks for giving me your credentials. Change your password, idiot.");
		}
		else {
			System.out.println("Login unsuccessful. Try again later.");
		}
	}
	private static int getValidInt() {
		while(!in.hasNextInt()) {
			System.out.println("Please enter a valid integer: ");
			in.next();
		}
		return in.nextInt();
	}
}