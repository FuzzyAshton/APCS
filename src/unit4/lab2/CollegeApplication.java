package unit4.lab2;

public class CollegeApplication {
	public static void main(String[] args) {
		String[] colleges = {"UC Berkeley", "College University", "New Mexico University of Taxedermy and Welding", "Montana State University", "Oxford is my safety"};
		String shortest = colleges[0];
		String longest = colleges[0];
		for (String e: colleges) {
			if (e.length() > longest.length()) {
				longest = e;
			}
			else if (e.length() < shortest.length()) {
				shortest = e;
			}
			System.out.println(e);
		}
		System.out.println(shortest + " is the one with the shortest name");
		System.out.println(longest + " is the one with the longest name");
		colleges[4] = null;
		for (String e: colleges) {
			System.out.println(e);
		}
	}
}