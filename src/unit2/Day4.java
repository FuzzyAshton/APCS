package unit2;

import java.util.Scanner;

public class Day4 {
	public static void main(String[] args) {
		// 1
		int month = 5;
		int quarter = 0;
		switch (month) {
			case 1:
			case 2:
			case 3:
				quarter = 1;
				break;
			case 4:
			case 5:
			case 6:
				quarter = 2;
				break;
			case 7:
			case 8:
			case 9:
				quarter = 3;
				break;
			case 10:
			case 11:
			case 12:
				quarter = 4;
				break;
		}

		// 4
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer between 1 and 10 (inclusive)");
		int num =  in.nextInt();
		in.close();
		switch (num) {
			case 1:
			case 2:
				System.out.println("Buckle my shoe.");
				break;
			case 3:
			case 4:
				System.out.println("Shut the door");
				break;
			case 5:
			case 6:
				System.out.println("Pick up sticks");
				break;
			case 7:
			case 8:
				System.out.println("Lay them straight");
				break;
			case 9:
			case 10:
				System.out.println("A good fat hen");
				break;
			default:
				break;
		}
	}
}