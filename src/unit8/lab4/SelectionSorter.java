package unit8.lab4;

/**
 * The sort method of this class sorts an array, using the selection sort
 * algorithm.
 */
public class SelectionSorter {
	/**
	 * Sorts an array, using selection sort.
	 * 
	 * @param a the array to sort
	 */
	public static void sort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			// Part 1 #1
			int maxPos = maximumPosition(a, i);
			swap(a, maxPos, i);
		}
	}

	public static void sort(Coin[] coins) {
		for (int i = 0; i < coins.length; i++) {
			// Part 1 #2
			int max = maximumPosition(coins, i);
			swap(coins, max, i);
		}
	}

	public static void sort(String[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			// Part 1 #1
			int minPos = minimumPosition(a, i);
			swap(a, minPos, i);
		}
	}

	/**
	 * Finds the smallest element in a tail range of the array.
	 * 
	 * @param a    the array to sort
	 * @param from the first position in a to compare
	 * @return the position of the smallest element in the range a[from] . . .
	 *         a[a.length - 1]
	 */
	private static int minimumPosition(int[] a, int from) {
		int minPos = from;
		for (int i = from + 1; i < a.length; i++) {
			if (a[i] < a[minPos]) {
				minPos = i;
			}
		}
		return minPos;
	}

	/**
	 * Finds the largest element in a tail range of the array.
	 * 
	 * @param a    the array to sort
	 * @param from the first position in a to compare
	 * @return the position of the smallest element in the range a[from] . . .
	 *         a[a.length - 1]
	 */
	private static int maximumPosition(int[] a, int from) {
		int maxPos = from;
		for (int i = from + 1; i < a.length; i++) {
			if (a[i] > a[maxPos]) {
				maxPos = i;
			}
		}
		return maxPos;
	}

	/**
	 * Finds the largest element in a tail range of the array.
	 * 
	 * @param a    the array to sort
	 * @param from the first position in a to compare
	 * @return the position of the smallest element in the range a[from] . . .
	 *         a[a.length - 1]
	 */
	private static int maximumPosition(Coin[] a, int from) {
		int maxPos = from;
		for (int i = from + 1; i < a.length; i++) {
			if (a[i].getValue() > a[maxPos].getValue()) {
				maxPos = i;
			}
		}
		return maxPos;
	}

	/**
	 * Finds the largest element in a tail range of the array.
	 * 
	 * @param a    the array to sort
	 * @param from the first position in a to compare
	 * @return the position of the smallest element in the range a[from] . . .
	 *         a[a.length - 1]
	 */
	private static int minimumPosition(String[] a, int from) {
		int maxPos = from;
		for (int i = from + 1; i < a.length; i++) {
			if (a[i].compareTo(a[maxPos]) < 0) {
				maxPos = i;
			}
		}
		return maxPos;
	}

	private static void swap(int[] a, int newIndex, int original) {
		int temp = a[original];
		a[original] = a[newIndex];
		a[newIndex] = temp;
	}

	private static void swap(Coin[] a, int newIndex, int original) {
		Coin temp = a[original];
		a[original] = a[newIndex];
		a[newIndex] = temp;
	}

	private static void swap(String[] a, int newIndex, int original) {
		String temp = a[original];
		a[original] = a[newIndex];
		a[newIndex] = temp;
	}
}