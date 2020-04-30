package unit9.lab1;

public class CallingCard extends Card {
	private String cardNumber;
	private int pin;
	public CallingCard(String name, String cardNumber, int pin) {
		super(name);
		this.cardNumber = cardNumber;
		this.pin = pin;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public int getPIN() {
		return pin;
	}

	public String format() {
		return super.format() + "\nCard Number: " + cardNumber + "\nPIN: " + pin;
	}
}