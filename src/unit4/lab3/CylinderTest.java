package unit4.lab3;

import java.util.Scanner;

public class CylinderTest {
	public static void main(String[] args) {
		System.out.println("Please enter a radius for a cylinder: ");
		Scanner in = new Scanner(System.in);
		double radius = in.nextDouble();
		System.out.println("Please enter a height for a cylinder: ");
		double height = in.nextDouble();
		in.close();
		Cylinder cylinder1 = new Cylinder(height, radius);
		System.out.println("Radius: " + cylinder1.getRadius() + "\nHeight: " + cylinder1.getHeight() + "\nSurface Area: " + cylinder1.getSurfaceArea());
	}
}