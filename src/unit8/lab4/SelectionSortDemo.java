package unit8.lab4;

import java.util.Arrays;

/**
 * This program demonstrates the selection sort algorithm by sorting an array
 * that is filled with random numbers.
 */
public class SelectionSortDemo {
	public static void main(String[] args) {
		int[] a = randomIntArray(20, 100);
		Coin[] coins = randomCoinArray(20, 100);
		String[] b = { " fjeuioaf", "fea", "the", "brown", "quick", "fox", "helix" };
		// #1
		System.out.println(Arrays.toString(a));
		SelectionSorter.sort(a);
		System.out.println(Arrays.toString(a));
		// #2
		System.out.println(Arrays.toString(coins));
		SelectionSorter.sort(coins);
		System.out.println(Arrays.toString(coins));
		// #3
		System.out.println(Arrays.toString(b));
		SelectionSorter.sort(b);
		System.out.println(Arrays.toString(b));

		// Part 2
		for (int i = 1; i < 10; i++) {
			int[] c = randomIntArray(i * 1000, 10000);
			MergeSorter.resetCounter();
			MergeSorter.sort(c);
			System.out.println("Array size: " + (i * 1000) + "; comparisons: " + MergeSorter.getCounter());
		}
		/*Array size: 1000; comparisons: 8694
		Array size: 2000; comparisons: 19401
		Array size: 3000; comparisons: 30904
		Array size: 4000; comparisons: 42794
		Array size: 5000; comparisons: 55158
		Array size: 6000; comparisons: 67750
		Array size: 7000; comparisons: 80667
		Array size: 8000; comparisons: 93694
		Array size: 9000; comparisons: 107078
		*/
	}
	/*
	 * Creates an array filled with random values.
	 * 
	 * @param length the length of the array
	 * 
	 * @param n the number of possible random values @return an array filled with
	 * length numbers between 0 and n-1
	 */

	public static int[] randomIntArray(int length, int n) {
		int[] a = new int[length];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * n);
		}
		return a;
	}

	/*
	 * Creates an array filled with random values.
	 * 
	 * @param length the length of the array
	 * 
	 * @param n the number of possible random values @return an array filled with
	 * length numbers between 0 and n-1
	 */

	public static Coin[] randomCoinArray(int length, int n) {
		Coin[] a = new Coin[length];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Coin((int) (Math.random() * n));
		}
		return a;
	}
}
