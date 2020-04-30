package unit9.lab3;

public abstract class Ticket {
	private int serialNumber;
	private int number = 100;

	public Ticket() {
		serialNumber = getNextSerialNumber();
	}

	public abstract double getPrice();

	public String toString() {
		return "Number: " + serialNumber + "\nPrice: " + getPrice();
	}

	private int getNextSerialNumber() {
		return number++;
	}

	// d. Call sub class method, then move up to super classes if they don't exist
	// f. Ticket thing = new Advance();
	// i. See below
	private int getNextSerialNumber(int startNumber) {
		return startNumber++;
	}
}