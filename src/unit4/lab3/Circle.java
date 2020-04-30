package unit4.lab3;

public class Circle {
	private double radius;

	public Circle(double r) {
		this.radius = r;
	}

	public double getArea() {
		return Math.PI * (radius * radius);
	}

	public double getRadius() {
		return radius;
	}
}