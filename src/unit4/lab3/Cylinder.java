package unit4.lab3;

public class Cylinder {
	private double height;
	private Circle base;

	public Cylinder(double h, double r) {
		this.base = new Circle(r);
		this.height = h;
	}

	public double getSurfaceArea() {
		return (2 * base.getArea()) + (2 * base.getRadius() * Math.PI * height);
	}

	public double getRadius() {
		return base.getRadius();
	}

	public double getHeight() {
		return height;
	}
}