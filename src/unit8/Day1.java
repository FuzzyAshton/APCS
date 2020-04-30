package unit8;

public class Day1 {
	public static void main(String[] args) {
		System.out.println("2 ^ 5: " + exp(2, 5));
		System.out.println("2 ^ 0: " + exp(2, 0));
	}

	public static int exp(int x, int m) {
		if (m == 0) {
			return 1;
		}
		else {
			return (x * exp(x, m-1));
		}
	}
}