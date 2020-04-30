package unit9.lab1;

public class IDCard extends Card {
	private String id;
	public IDCard(String name, String id) {
		super(name);
		this.id = id;
	}

	public String getID() {
		return id;
	}

	public String format() {
		return super.format() + "\nID Number: " + id;
	}
}