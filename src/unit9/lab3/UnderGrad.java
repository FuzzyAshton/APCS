package unit9.lab3;

public class UnderGrad extends Student {

	public UnderGrad(String name, String major, int units) {
		super(name, major, units);
	}

	public int calculateTuition(int units) {
		return units * 250;
	}
}