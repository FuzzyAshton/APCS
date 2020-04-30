package finalProject;

public class Cell {
	// #9 Class design instance variables
	private DNA dna;
	private String type;
	private boolean isCancer;

	public Cell(long dnaLength, String type) {
		// #8 Use of casting
		dna = new DNA((int) dnaLength, isMutated());
		this.type = type;
		isCancer = false;
	}

	public Cell(DNA dna, String type) {
		this.dna = dna;
		if (isMutated()) {
			dna.mutate();
		}
		this.type = type;
		isCancer = false;
	}

	public DNA getDNA() {
		return dna;
	}

	public Cell getThis() {
		return this;
	}

	/**
	 * Generate a random boolean for the cell's DNA
	 * @return if the cell's DNA is mutated
	 */
	public boolean isMutated() {
		// #6 Another use of Math.random()
		int mutationNumber = (int) (Math.random() * 1000000000);
		boolean isMutated = false;
		if (mutationNumber < 1) {
			isMutated = true;
		}
		return isMutated;
	}

	public boolean isCancer() {
		if (dna.numMutations() > 10) {
			isCancer = true;
		}
		return isCancer;
	}

	public String toString() {
		return type + " cell DNA:" + dna.toString();
	}
}