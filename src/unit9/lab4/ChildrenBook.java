package unit9.lab4;

public class ChildrenBook extends Book {
	private int age;
	public ChildrenBook(String publisher, double regularPrice, int yearPublished, int age) {
		super(publisher, regularPrice, yearPublished);
		this.age = age;
	}

	public double computeSalePrice() {
		if (age < 6) {
			return super.getRegularPrice() * (0.6);
		}
		return super.getRegularPrice() * (0.8);
	}

	public String toString() {
		return super.toString() + "\nSale Price: " + computeSalePrice() + "\nAge: " + age;
	}
}