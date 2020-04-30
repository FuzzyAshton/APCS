package unit9.lab5;

public class Janitor extends Employee {
	public Janitor() {
		super();
		super.setHours(super.showHours() * 2);
		super.setSalary(super.showSalary() - 10000);
		super.setVacation(5);
	}

	public void clean() {
		System.out.println("Workin' for the man.");
	}

	public String toString() {
		clean();
		return super.toString();
	}
}