package unit1;

import java.util.Scanner;

public class InputPractice {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String favoriteSubject;
		double piDigits = 0;
		System.out.println("Enter your favorite subject:");
		// Breaks here
		favoriteSubject = in.nextLine();

		System.out.println("You said " + favoriteSubject + ", and hopefully you also like math and that you know your pi digits");
		System.out.println("Enter the most accurate value for pi using your memory");
		// Prevents invalid input
		while (!in.hasNextDouble()){
			System.out.println("Please input a decimal");
		}
		piDigits = in.nextDouble();
		in.close();
		if (piDigits == Math.PI){
			System.out.println("You inputted exactly what java thinks is pi, which is: " + Math.PI);
		}
		else {
			System.out.println("You inputted: " + piDigits);
		}
	}
}