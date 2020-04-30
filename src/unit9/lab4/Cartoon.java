package unit9.lab4;

public class Cartoon extends Book {
	private String name;

	public Cartoon(String publisher, double regularPrice, int yearPublished, String name) {
		super(publisher, regularPrice, yearPublished);
		this.name = name;
	}

	public double computeSalePrice() {
		if (getRegularPrice() < 100) {
			return super.getRegularPrice() * (0.75);
		}
		return super.getRegularPrice() * (0.6);
	}

	public String toString() {
		return super.toString() + "\nName: " + name + "\nSale Price: " + computeSalePrice();
	}
}