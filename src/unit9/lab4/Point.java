package unit9.lab4;

public class Point extends Shape {
	private int x;
	private int y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String getName() {
		return "Point";
	}

	public String toString() {
		return "Name: " + getName() + "\nX: " + getX() + "\nY: " + getY();
	}

}