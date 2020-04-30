package unit7.lab2;
import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args) {
		/*
		// #1
		double[] nums = new double[4];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i * 2;
		}
		System.out.println("4 doubles: ");
		for (double e: nums) {
			System.out.print(e + " ");
		}
		System.out.println();

		// #2
		String[] arr = new String[5];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a word: ");
			arr[i] = in.nextLine();
		}
		for (String e: arr) {
			System.out.print(e + " ");
		}
		System.out.println();

		// #3
		String[][] arr2 = new String[4][5];
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

		// #4
		String[][] arr3 = new String[3][2];
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.println("Enter a string: ");
				arr3[i][j] = in.nextLine();
			}
		}
		for (String[] a: arr3) {
			for (String e: a) {
				System.out.print(e + " ");
			}
			System.out.println();
		}

		// #5
		int[][] nums2 = {
			{0, -1, -2},
			{1, 0, -1},
			{2, 1, 0},
			{3, 2, 1}
		};
		*/
		double[] scanned = {0.3, 0.7, 0.8, 0.4, 1.4, 1.1, 0.2, 0.5, 0.1, 1.6, 0.6, 0.9};
		SkyView telescope = new SkyView(4, 3, scanned);
		telescope.print();
		System.out.println(telescope.getAverage(1, 2, 0, 1));
	}
}