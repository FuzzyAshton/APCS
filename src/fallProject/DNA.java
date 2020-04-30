package fallProject;

import java.util.ArrayList;

public class DNA {
	public enum DNAType {
		ADENINE, THYMINE, CYTOSINE, GUANINE, URACIL, // Only for RNA, replaces Thymine
	}

	// #3 Use of int primite data types
	// #9 Instance variables
	private int length;
	private ArrayList<DNAPair> dna;
	private int numMutations;
	private boolean isMutated;

	// #9 Multi-arg constructor
	public DNA(int length, boolean isMutated) {
		this.isMutated = isMutated;
		this.numMutations = 0;
		// #1 Two relational and two logical operators
		// #2 If/else with throw error
		if (length < 100 && length > 0 || length == 5026) {
			this.length = length;
		} else {
			throw new IllegalArgumentException("Length is too long");
		}
		dna = new ArrayList<DNAPair>();
		generate();
		mutate();
	}

	// #9 Zero-arg constructor
	public DNA() {
		this.length = 100;
		dna = new ArrayList<DNAPair>();
		generate();
		isMutated = false;
		numMutations = 0;
	}

	private void generate() {
		// #4 Use of for loop
		for (int i = 0; i < length; i++) {
			dna.add(getRandPair());
		}
	}

	/**
	 * Create a random DNA pair
	 * 
	 * @return randomized DNA pair
	 */
	private DNAPair getRandPair() {
		// #6 Use of Math.random and Math.pow, #8 Use of casting
		int number = (int) Math.pow(Math.random() * 4 + 1, 1);
		DNAType firstType = DNAType.THYMINE; // Default
		// #5 Switch statement
		switch (number) {
		case 1:
			firstType = DNAType.ADENINE;
			break;
		case 2:
			firstType = DNAType.THYMINE;
			break;
		case 3:
			firstType = DNAType.CYTOSINE;
			break;
		case 4:
			firstType = DNAType.GUANINE;
			break;
		}
		return new DNAPair(firstType);
	}

	/**
	 * Get the rna strand, which uses the DNAPair method that converts Thymine to Uracil
	 * @return rna
	 */
	public ArrayList<DNAType> getRNA() {
		ArrayList<DNAType> rna = new ArrayList<DNAType>();
		// #4 for each
		for (DNAPair e : dna) {
			rna.add(e.getRNA());
		}
		return rna;
	}

	public ArrayList<DNAPair> getDNA() {
		return dna;
	}

	// #9 Setter method
	public void add(DNA other) {
		dna.addAll(other.getDNA());
	}

	/**
	 * Removes the second half of the ArrayList, used for reproduction sequence
	 * #9 Setter method
	 */
	public void split() {
		int middleIndex = dna.size();
		// #2 If/else
		if (middleIndex % 2 == 0) {
			middleIndex /= 2; // Split it in half
		} else {
			middleIndex /= 2;
			middleIndex++; // Split it in half but shift one over for odd numbers
		}
		// #4 Use of while loop
		while (middleIndex < dna.size()) {
			dna.remove(middleIndex);
		}
	}

	/**
	 * Remove a random dna pair, which causes mutations in all cells that have
	 * pointers to the same dna. Only mutates if the DNA is supposed to be mutated
	 */
	public void mutate() {
		if (isMutated) {
			dna.remove((int) (Math.random() * dna.size()));
			numMutations++;
		}
	}

	public int numMutations() {
		return numMutations;
	}

	public String toString() {
		String output = "";
		for (DNAPair e: dna) {
			output += e.toString();
		}
		// #7 replaceAll String method
		return output.replaceAll("^ACGTU", "");
	}
}