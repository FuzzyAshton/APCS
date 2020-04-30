package unit9.lab3;

public abstract class Student {
	private String firstName;
	private String major;
	private int units;

	public Student(String name, String major, int units) {
		this.firstName = name;
		this.major = major;
		this.units = units;
	}

	public String getName() {
		return firstName;
	}

	public void setName(String name) {
		firstName = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public abstract int calculateTuition(int units);

	public String toString() {
		return "Name: " + firstName + "\nMajor: " + major + "\nTutition: " + calculateTuition(units);
	}

}