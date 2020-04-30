package unit5.lab2;

import java.util.Scanner;

public class StringSorter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter three strings: ");
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		String str3 = in.nextLine();
		StringSet set = new StringSet(str1, str2, str3);
		System.out.println("The inputs in sorted order are: \n" + set.getSmallest() + "\n" + set.getMiddle() + "\n" + set.getLargest());
	}
}