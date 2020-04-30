package fallProject;

import fallProject.DNA.DNAType;

public class DNAPair {
	private DNAType first;
	private DNAType second;
	public DNAPair (DNAType first, DNAType second) {
		this.first = first;
		this.second = second;
	}

	public DNAPair (DNAType first) {
		this.first = first;
		this.second = getPartner(first);
	}

	// #10a getter method
	public DNAType getFirst() {
		return first;
	} 

	// #10a getter method
	public DNAType getSecond() {
		return second;
	}

	/**
	 * Using only one DNA Type, find the matching partner nitrogen base
	 * @param first half of the DNA pair
	 * @return gets the matching pair
	 */
	public DNAType getPartner(DNAType first) {
		// #5 Switch statement
		switch (first) {
			case ADENINE:
				return DNAType.THYMINE;
			case URACIL: // Only for RNA
			case THYMINE:
				return DNAType.ADENINE;
			case GUANINE:
				return DNAType.CYTOSINE;
			case CYTOSINE:
				return DNAType.GUANINE;
			default: // This should never happen
				return DNAType.ADENINE;
		}
	}

	/**
	 * Gets the first pair, and converts it to uracil if it is thymine
	 * @return rna nitrogen base
	 */
	public DNAType getRNA() {
		switch (getFirst()) {
			case THYMINE:
				// Uracil replaces Thymine in RNA
				return DNAType.URACIL;
			default:
				return getFirst();
		}
	}

	public String toString() {
		// #7 Substring method
		return first.toString().substring(0,1) + ", " + second.toString().substring(0,1) + "\n";
	}
}