package unit9.lab3;

public class Advance extends Ticket {
	private int daysAhead;

	public Advance(int daysAhead) {
		this.daysAhead = daysAhead;
	}

	@Override
	public double getPrice() {
		if (daysAhead < 10) {
			return 40;
		}
		return 30;
	}

	public String toString() {
		return super.toString();
	}
}