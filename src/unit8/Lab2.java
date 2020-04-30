package unit8;

public class Lab2 {
	// 1
	public static int exponent(int a, int b) {
		if (b == 0) {
			return 1;
		} else {
			return a * exponent(a, b - 1);
		}
	}

	// 2
	public static int initialCookies(int cookies, int kids) {
		if (kids == 1) {
			return cookies * 2;
		} else {
			return initialCookies(cookies * 2, kids - 1);
		}
	}

	// 3
	public static String rotateLeft(String word, int n) {
		if (n == 0) {
			return word;
		} else {
			String lastChar = word.substring(word.length() - 1);
			String cutWord = word.substring(0, word.length() - 1);
			return rotateLeft(lastChar + cutWord, n - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println("2 ^ 5: " + exponent(2, 5));
		System.out.println("2 ^ 0: " + exponent(2, 0));
		System.out.println(initialCookies(6, 4));
		System.out.println(rotateLeft("BCS201", 2));
	}
}