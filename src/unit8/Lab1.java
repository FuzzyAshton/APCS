package unit8;

public class Lab1 {
	public static void main(String[] args) {
		printStars(5);
		printTriangleA(5);
		printTriangleB(5);
		printTriangleC(5);
		printTriangleD(5);
	}

	// Part 1
	public static void printStars(int n) {
		if (n == 1) {
			System.out.print("*");
		} else {
			System.out.print("*");
			printStars(n - 1);
		}
	}

	// Part 2a
	public static void printTriangleA(int n) {
		for (int i = 1; i <= n; i++) {
			printStars(i);
			System.out.println();
		}
	}

	// Part 2b
	public static void printTriangleB(int n) {
		for (int j = n; j > 0; j--) {
			printStars(j);
			System.out.println();
		}
	}

	// Part 2c
	public static void printTriangleC(int n) {
		if (n == 1) {
			printStars(n);
			System.out.println();
		}
		else {
			printTriangleC(n - 1);
			printStars(n);
			System.out.println();
		}
	}

	// Part 2d
	public static void printTriangleD(int n) {
		if (n == 1) {
			printStars(n);
			System.out.println();
		}
		else {
			printStars(n);
			System.out.println();
			printTriangleD(n - 1);
		}
	}
}