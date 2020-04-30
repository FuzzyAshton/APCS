package fallProject;
import java.util.ArrayList;

import fallProject.DNA.DNAType;

public class Earth {
	private ArrayList<Organism> organisms;
	private Organism aaron;
	public Earth() {
		organisms = new ArrayList<Organism>();
		aaron = new Organism("Aaron", 16.5, "Burlingame", "Plant");
		organisms.add(aaron);
		organisms.add(new Organism("Grant", 3.0, "Swamp", "Animal"));
		organisms.add(new Organism("Mothership", 0.75, "Planet Primus", "Animal"));
		for (int i = 0; i < 100; i++) {
			organisms.add(new Organism());
		}
	}

	public Earth(ArrayList<Organism> organisms) {
		this.organisms = organisms;
	}

	/**
	 * Destroy half the organisms at random
	 */
	public int thanosSnap() {
		int snapSize = organisms.size() / 2;
		int snapped = 0;
		// #4 Do-while loop
		do {
			organisms.remove((int) (Math.random() * organisms.size()));
			snapped++;
		}
		while (organisms.size() > snapSize);
		return snapped;
	}

	/**
	 * See if Aaron has been destroyed by Thanos
	 * @return whether Aaron is alive
	 */
	public boolean isAaron() {
		return organisms.indexOf(aaron) == -1 ? false : true;
	}

	/**
	 * Find the oldest organism on the Earth
	 * @return organism with the greatest age
	 */
	public int getOldestIndex() {
		int oldestIndex = 0;
		double oldestAge = organisms.get(oldestIndex).getAge();
		// #14 Find maximum value from an ArrayList
		// Skips an unnecessary iteration, starts from 1 instead of 0
		for (int i = 1; i < organisms.size(); i++) {
			double tempAge = organisms.get(i).getAge();
			if (tempAge > oldestAge) {
				oldestAge = tempAge;
				oldestIndex = i;
			}
		}
		return oldestIndex;
	}

	public Organism getOrganism(int index) {
		return organisms.get(index);
	}

	/**
	 * Find the number of times Thymine occurs in the organisms' DNA in the Earth
	 * @return number of Thymine nitrogen bases
	 */
	public int getThymineBases() {
		int numThymine = 0;
		// #18 Nested loop
		for (Organism e: organisms) {
			for (DNAPair p: e.getCellDNA().getDNA()) {
				// Using the DNA strand, all adenines are paired with thymine, so that number plus the number of Thymine on the RNA
				if (p.getFirst().equals(DNAType.ADENINE) || p.getFirst().equals(DNAType.THYMINE)) {
					numThymine++;
				}
			}
		}
		return numThymine;
	}

	public String toString() {
		String output = "";
		for (Organism e: organisms) {
			String formattedString = e.getName();
			// #7 Use of 3 different string methods
			// Formats string to capitalize the first letter and make the rest lower case
			formattedString = formattedString.substring(0, 1).toUpperCase() + formattedString.substring(1, formattedString.length()).toLowerCase();
			output += formattedString + "\n";
		}
		return output;
	}
}