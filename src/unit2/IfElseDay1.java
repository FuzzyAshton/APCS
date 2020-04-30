package unit2;

import java.util.Scanner;

public class IfElseDay1 {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		// Question 1
		/*
		String password = "1234";
		System.out.println("I made up a 4 character password. Can you guess it?");
		boolean isCorrect = false;
		int tries = 1;
		while (!isCorrect){
			System.out.println("Enter a 4 character password to guess my password: ");
			String inputPassword = in.nextLine();
			if (password.equals(inputPassword)){
				isCorrect = true;
			}
			else {
				System.out.println("Please guess again.");
				tries++;
			}
		}
		System.out.println("You guessed correctly that my password was " + password + " after ONLY " + tries + " attempts.");
		*/
		// Question 2
		int a = getValidInt();
		int b = getValidInt();
		System.out.println("You entered " + a + " and " + b);
		if (a < b) {
			System.out.println(b + " is greater than " + a);
		} else if (a > b) {
			System.out.println(a + " is greater than " + b);
		} else {
			System.out.println(a + " is equal to " + b);
		}
	}

	// Question 2
	public static int getValidInt() {
		System.out.println("Enter an integer: ");
		while (!in.hasNextInt()) {
			in.next();
		}
		return in.nextInt();
	}
	/**
	 * Answers to questions 3 and 4: 3. If 95, the discounted price would not change
	 * because 95 is less than 100 and would therefore not go into the if statement.
	 * Same with 100, it would not be more than 100 and would therefore not enter
	 * the if statement. If 105, the discounted price would be 95
	 * 
	 * 4. If 95, the discounted price would be 85; if 100, it would be 90; and if it
	 * were 105, then the discounted price would be 85
	 * 
	 */
}