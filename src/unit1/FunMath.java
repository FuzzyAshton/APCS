package unit1;

import java.util.Scanner;

public class FunMath {
	private static Scanner in;
	private static int a;
	private static int b;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		a = promptInt();
		b = promptInt();
		// This looks neater with the methods, although the primitive operators also would have worked
		printOperation(add(a,b), "sum");
		printOperation(subtract(a,b), "difference");
		printOperation(multiply(a,b), "product");
		printOperation(divide(a,b), "quotient");
		printOperation(average(a,b), "average");
		printOperation(maximum(a,b), "maximum number");
		printOperation(minimum(a,b), "minimum");
		// Part C
		System.out.println("Now give two sides of a rectangle: ");
		int side1 = getValidatedInt();
		int side2 = getValidatedInt();
		System.out.println("The area of the rectangle is " + multiply(side1, side2));
		System.out.println("The perimeter of the rectangle is " + multiply(2, add(side1, side2)));
		System.out.println("The length of the diagonal is " + pythagoreanTheorem(side1, side2));
		in.close();
	}

	public static void printOperation(int result, String operator) {
		System.out.println(result + " is the " + operator + " of " + a + " and " + b);
	}

	public static void printOperation(double result, String operator) {
		System.out.println(result + " is the " + operator + " of " + a + " and " + b);
	}

	public static int promptInt() {
		System.out.println("Enter an integer: ");
		return getValidatedInt();
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int subtract(int a, int b) {
		return a - b;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

	public static double divide(int a, int b) {
		// For exact result
		double decimalA = (double) a;
		double decimalB = (double) b;
		return decimalA / decimalB;
	}

	public static int average(int a, int b) {
		return (a + b) / 2;
	}

	public static int distance(int a, int b) {
		return Math.abs(a - b);
	}

	public static int maximum(int a, int b) {
		return Math.max(a, b);
	}

	public static int minimum(int a, int b) {
		return Math.min(a, b);
	}

	// Prevents code from crashing with invalid input
	public static int getValidatedInt() {
		while (!in.hasNextInt()) {
			in.next();
			System.out.println("Enter a valid integer: ");
		}
		return in.nextInt();
	}

	public static double pythagoreanTheorem(int a, int b){
		// This is faster than using Math.pow
		return Math.sqrt((a * a) + (b * b));
	}
}