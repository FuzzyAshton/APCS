package unit5;

public class Day3 {
	public static void main(String[] args) {
		String str = "antidisestablishmentarianism";
		System.out.println("Length: " + str.length());
		System.out.println("B is at index: " + str.indexOf("b"));
		System.out.println("Substring string: " + str.substring(str.indexOf("e"), str.indexOf("h") + 1));
		System.out.println(str.replace("i", "x"));
		System.out.println(str.toUpperCase());
		System.out.println(str.repeat(5));
		System.out.println(str.trim());
		System.out.println(str.getBytes());
	}
}