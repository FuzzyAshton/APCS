package unit5.lab2;

import java.util.Scanner;

public class ReverseName {
	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		System.out.println(reverseString(name));
		System.out.println(reverseNames(name));
	}

	public static String reverseString(String str) {
		char[] strArr = str.toCharArray();
		char[] revString = new char[strArr.length];
		for (int i = strArr.length - 1; i >= 0; i--) {
			revString[strArr.length - 1 - i] = strArr[i];
		}
		String reversedString = new String(revString);
		System.out.println(reversedString);
		return reversedString;
	}

	public static String reverseNames(String str) {
		String firstName = str.substring(0, str.indexOf(","));
		String lastName = str.substring(str.indexOf(" ") + 1);
		return lastName + ", " + firstName;
	}
}