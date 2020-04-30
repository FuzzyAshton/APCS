package unit4.lab3;

import java.util.Scanner;

public class CircleTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the radius of a circle");
		Circle circle1 = new Circle(in.nextDouble());
		System.out.println("The area of the circle is " + circle1.getArea());
	}
}