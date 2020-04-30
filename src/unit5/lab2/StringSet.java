package unit5.lab2;

public class StringSet {
	private String[] strings;

	/**
	 * Constructs a string set that processes three strings.
	 * @param str1 the first string to sort
	 * @param str2 the second string to sort
	 * @param str3 the third string to sort
	 */
	public StringSet(String str1, String str2, String str3) {
		strings = new String[3];
		strings[0] = str1;
		strings[1] = str2;
		strings[2] = str3;
	}

	/**
	 * Gets the smallest string in the string set.
	 * @return smallest the smallest of three strings
	 */
	public String getSmallest() {
		int leastLength = Math.min(Math.min(strings[0].length(), strings[1].length()), strings[2].length());
		for (String e: strings) {
			if (e.length() == leastLength) {
				return e;
			}
		}
		return strings[0];
	}

	/** Gets the largest string in the string set.
	 * @return largest the largest of three strings
	 */
	public String getLargest() {
		int leastLength = Math.max(Math.max(strings[0].length(), strings[1].length()), strings[2].length());
		for (String e: strings) {
			if (e.length() == leastLength) {
				return e;
			}
		}
		return strings[0];
	}

	/** Gets the middle string in the string set.
	 * @return middle the middle string of three strings
	 */
	public String getMiddle() {
		String largest = getLargest();
		String shortest = getSmallest();
		for (String e: strings) {
			if (!(e.equals(largest) || e.equals(shortest))) {
				return e;
			}
		}
		return strings[0];
	}
}