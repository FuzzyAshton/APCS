package unit9.lab4;

public class Book {
	private String publisher;
	private double regularPrice;
	private int yearPublished;

	public Book() {
		this.publisher = "Penguin Books";
		this.regularPrice = 10.99;
		this.yearPublished = 1999;
	}

	public Book(String publisher, double regularPrice, int yearPublished) {
		this.publisher = publisher;
		this.regularPrice = regularPrice;
		this.yearPublished = yearPublished;
	}

	public double getRegularPrice() {
		return regularPrice;
	}

	public String getPublisher() {
		return publisher;
	}

	public int yearPublished() {
		return yearPublished;
	}

	public String toString() {
		return "\nPublisher: " + getPublisher() + "\nPrice: " + getRegularPrice() + "\nYear Published: " + yearPublished;
	}
}