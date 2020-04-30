package unit9.lab3;

public class PostGraduate extends Student {

	public PostGraduate(String name, String major, int units) {
		super(name, major, units);
	}

	public int calculateTuition(int units) {
		return units * 750;
	}
}