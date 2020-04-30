package unit9.lab3;

public class Graduate extends Student {

	public Graduate(String name, String major, int units) {
		super(name, major, units);
	}

	public int calculateTuition(int units) {
		return units * 500;
	}
}