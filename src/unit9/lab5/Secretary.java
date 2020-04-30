package unit9.lab5;

public class Secretary extends Employee {
	public Secretary() {
		super("pink", 40, 40000, 14);
	}

	public void takeDictation() {
		System.out.println("I know how to take dictation.");
	}

	public String toString() {
		takeDictation();
		return super.toString();
	}
}