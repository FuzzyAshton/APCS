package unit6.lab4;

import java.util.ArrayList;

public class MyDoors {
	private Door[] doorsHave;
	private ArrayList<Door> doorsNeed;

	public MyDoors() {
		doorsHave = new Door[3];
		doorsNeed = new ArrayList<Door>();
		doorsHave[0] = new Door("Front", false);
		doorsHave[1] = new Door("Back", true);
		doorsHave[2] = new Door("Side", false);
		doorsNeed.add(new Door("Sliding", true));
		doorsNeed.add(new Door("Doggie", false));
		doorsNeed.add(new Door("Garage", true));
	}

	public String toString() {
		String output = "";
		for (Door e : doorsHave) {
			output += e;
		}
		for (Door e : doorsNeed) {
			output += e;
		}
		return output;
	}

	public int tornado() {
		int doorsModified = 0;
		for (Door e : doorsHave) {
			boolean tempClosed = e.isClosed();
			e.open();
			if (tempClosed != e.isClosed()) {
				doorsModified++;
			}
		}
		for (int i = 0; i < doorsNeed.size(); i++) {
			if (doorsNeed.get(i).isClosed()) {
				doorsNeed.remove(i);
				i--;
				doorsModified++;
			}
		}
		return doorsModified;
	}
}