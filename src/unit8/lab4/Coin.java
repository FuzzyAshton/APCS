package unit8.lab4;

public class Coin {
	private int value;
	public Coin (int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String toString() {
		return "" + value;
	}
}