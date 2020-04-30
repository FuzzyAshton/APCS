package unit5.lab2;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String test = in.nextLine();
		String[] trimmedTest = test.replaceAll("\\p{Punct}", "").toLowerCase().split("\\s+");
		String formattedString = "";
		for (String e: trimmedTest) {
			formattedString += e;
		}
		System.out.println("Is Palindrome: " + isPalindrome(formattedString));
	}
	
	public static boolean isPalindrome(String str) {
		return str.equals(reverseString(str));
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
}