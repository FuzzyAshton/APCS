package unit9.lab4;

public class BookDriver {
	public static void main(String[] args) {
		ChildrenBook book1 = new ChildrenBook("Penguino", 59.99, 2020, 1);
		Cartoon book2 = new Cartoon("BHS", 10.01, 1900, "Something good");
		System.out.println(book1);
		System.out.println(book2);		
	}
}