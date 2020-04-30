package unit2;

public class IfElseDay2 {
	public static void main(String[] args) {
		int x = 7;
		int y = 6;
		// 1
		if (x > 0) {
			System.out.println("X is positive");
		}
		// 2
		if (x <= 0) {
			System.out.println("X is zero or negative");
		}
		// 3
		if (x >= 10) {
			System.out.println("X is at least 10");
		}
		// 4
		if (x < 10) {
			System.out.println("X is less than 10");
		}
		// 5
		if (x == 0) {
			if (y == 0) {
				System.out.println("Both x and y are 0");
			}
		}
		// Or:
		if (x == 0 && y == 0){
			System.out.println("Both x and y are 0");
		}
		// 6
		if (x % 2 == 0) {
			System.out.println("X is even");
		}
		// 7
		if ((x > 0 && y > 0) || (x < 0 && y < 0)){
			System.out.println("Both x and y are either positive or negative");
		}
		// 8
		if (x == 0 && y == 0){
			System.out.println("Both x and y are 0");
		}
		// 9
		if (x == 0 || y == 0) {
			System.out.println("At least one of x and y are 0");
		}
		// 10
		if (x == 0 && y != 0 || x != 0 && y == 0) {
			System.out.println("Either x or y is 0");
		}
		// 11
		if ("Hello".equals("Hello")){
			System.out.println("The two Strings are equal");
		}
		// 12
		// Yes, all of the above have been without an else statement
		// 13
		// == or !=
		// 14 
		// <
		// 15
		// >
		// 16
		// A relational operator
		// 17
		// C
		// 18
		// t t
		// f t
		// t t
		// f t
		// t f
		// f t
		// t f
		// t f
		// 19
		// When x == 0
		// 20
		// 8
		// 21
		if (x == 3 && y == 3){
			System.out.println("Both x and y are 3");
		}
		if (x == 3 || y == 3){
			System.out.println("At least one of x and y are 3");
		}
		if (x == 3 && y != 3 || x != 3 && y == 3){
			System.out.println("Only one of x and y are 3");
		}
	}
}