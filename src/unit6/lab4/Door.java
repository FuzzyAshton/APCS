package unit6.lab4;

public class Door {
	private String name;
	private boolean isClosed;

	public Door(String name, boolean isClosed) {
		this.name = name;
		this.isClosed = isClosed;
	}

	public Door() {
		this.name = "Front";
		this.isClosed = true;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void open() {
		isClosed = false;
	}

	public void close() {
		isClosed = true;
	}

	public String getName() {
		return name;
	}
	
	public boolean isClosed() {
		return isClosed;
	}

	public String toString() {
		return name + " door" + "\nIs closed? " + isClosed + "\n";
	}
}