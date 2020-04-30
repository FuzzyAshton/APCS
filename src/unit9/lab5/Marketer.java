package unit9.lab5;

public class Marketer extends Employee {
	public Marketer() {
		super();
		super.setSalary(super.showSalary() + 10000);
	}

	public void advertise() {
		System.out.println("Act now, while supplies last!");
	}

	public String toString() {
		advertise();
		return super.toString();
	}
}