package unit5.lab3;

public class VendingMachine {
	private int numCans;
	private int tokens;

	public VendingMachine(int numCans) {
		this.numCans = numCans;
		tokens = 0;
	}

	public VendingMachine() {
		numCans = 10;
		tokens = 0;
	}

	public void fillUp(int cans) {
		numCans += cans;
	}

	public void insertToken() {
		tokens++;
		numCans--;
	}

	public int getCanCount() {
		return numCans;
	}

	public int getTokenCount() {
		return tokens;
	}
}