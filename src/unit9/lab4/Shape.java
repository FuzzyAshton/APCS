package unit9.lab4;

public abstract class Shape {
	private static int counter = 1;
	private int idNumber = 0;
	
	public Shape() {
		idNumber = idNumber + counter;
		counter++;
	}

	public double Area() {
		return 0.0;
	}

	public abstract String getName();

}