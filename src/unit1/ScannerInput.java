package unit1;

import java.util.Scanner;

public class ScannerInput {
	public static Scanner input;
	public static void main(String[] args){
		// Part A Scanner
		input = new Scanner(System.in);
		System.out.println(getInput("Enter your first name: ") + " is your first name");
		System.out.println(getInput("Enter your last name: ") + " is your last name");
		System.out.println(getInput("Enter your favorite food name: ") + " is your favorite food");
		System.out.println(getInput("Enter your favorite color name: ") + " is your favorite color");
		System.out.println(getInput("Enter your favorite movie name: ") + " is your favorite movie");
		System.out.println(getInput("Enter your favorite ice cream name: ") + " is your favorite ice cream");
		System.out.println(getInput("Enter your favorite musical group name: ") + " is your favorite musical group");
		input.close();
	}
	// Returns input after giving a prompt
	public static String getInput(String prompt){
		System.out.println(prompt);
		return input.nextLine();
	}
}