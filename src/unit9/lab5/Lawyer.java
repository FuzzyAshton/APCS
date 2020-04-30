package unit9.lab5;

public class Lawyer extends Employee {
	public Lawyer() {
		super("pink", 40, 40000, 21);
	}

	public void sue() {
		System.out.println("I'll see you in court!");
	}

	public String toString() {
		sue();
		return super.toString();
	}

}