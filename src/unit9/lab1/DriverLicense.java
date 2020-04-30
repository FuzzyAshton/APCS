package unit9.lab1;

public class DriverLicense extends IDCard {
	private int expYear;
	public DriverLicense(String name, String id, int expYear) {
		super(name, id);
		this.expYear = expYear;
	}

	public int getExpiration() {
		return expYear;
	}

	public String format() {
		return super.format() + "\nExpiration Year: " + expYear;
	}
}