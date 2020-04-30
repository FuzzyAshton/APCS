package unit6.lab2;
import java.util.ArrayList;

public class Part3 {
	public static void main(String[] args) {
		ArrayList<String> family = new ArrayList<String>();
		family.add("Your mom");
		family.add("Your dad");
		family.add("Cat");
		System.out.println("There are " + family.size() + " members in my family");
		for (String e: family) {
			System.out.println(e);
		}
		family.remove(0);
		family.remove(0);
		for (String e: family) {
			System.out.println(e);
		}
		family.remove(0);
		family.add("No u");
		for (String e: family) {
			System.out.print(e);
		}
		family.add("Ca");
		for (String e: family) {
			if (e.toUpperCase().startsWith("C")) {
				System.out.println(e + " starts with a C");
			}
		}
	}
}