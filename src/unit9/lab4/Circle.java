package unit9.lab4;

public class Circle extends Point {
	protected double radius;

	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	public String getName() {
		return "Circle";
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public String toString() {
		return super.toString() + "\nArea: " + getArea();
 	}
}