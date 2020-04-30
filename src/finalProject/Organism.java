package finalProject;

import java.util.ArrayList;
import java.util.Collections;

public class Organism implements Comparable<Organism> {
	// #9 Instance variables
	// #13 ArrayList creation
	private ArrayList<Cell> cells;
	private String name;
	// #3 double and boolean primitive data types
	private double age;
	private String habitat;
	private boolean isAlive;
	private String type;

	// #9 Multi-arg and zero arg constructors
	public Organism(String name, double age, String habitat, String type) {
		this.cells = new ArrayList<Cell>();
		generateCells(cells, age, type);
		this.name = name;
		this.age = age;
		this.habitat = habitat;
		isAlive = cells.get(0).isCancer();
		this.type = type;
	}

	public Organism(DNA dna, String name, double age, String habitat, String type) {
		cells = new ArrayList<Cell>();
		generateCells(cells, age, dna, type);
		this.name = name;
		this.age = age;
		this.habitat = habitat;
		isAlive = cells.get(0).isCancer();
		this.type = type;
	}

	/**
	 * Create a randomized organism
	 */
	public Organism() {
		cells = new ArrayList<Cell>();
		this.age = Math.random() * 100;
		this.name = getRandString();
		this.habitat = getRandString();
		this.type = getRandString();
		generateCells(cells, age, type);
		isAlive = cells.get(0).isCancer();
	}

	/**
	 * Generate a random string wih a random length between 1 and 10
	 * 
	 * @return randomized string
	 */
	public static String getRandString() {
		String name = "";
		int length = (int) ((Math.random() * 10) + 1);
		for (int i = 0; i < length; i++) {
			name += (char) (int) (Math.random() * 26 + 'A');
		}
		return name;
	}

	// #10c Overloaded method generateCells
	// #9 Processor methods
	private void generateCells(ArrayList<Cell> cells, double age, String type) {
		DNA dna = new DNA();
		generateCells(cells, age, dna, type);
	}

	private void generateCells(ArrayList<Cell> cells, double age, DNA dna, String type) {
		// #13 ArrayList is iterated through
		// Cell count is directly proportional to 1 plus the age
		for (int i = 0; i < (age + 1) * 100; i++) {
			// Makes new cells that point to the same dna to save memory
			cells.add(new Cell(dna, type));
		}
	}

	// #9 Getter methods
	public String getName() {
		return name;
	}

	public double getAge() {
		return age;
	}

	public String getHabitat() {
		return habitat;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public String getType() {
		return type;
	}

	public String toString() {
		if (isAlive) {
			return name + " organism is " + age + " years old and lives in " + habitat + "\nCell information: "
					+ getCell().toString();
		}
		return name + " organism was " + age + " years old and lived in " + habitat + " before it died";
	}

	public void die() {
		System.out.println(name + " died at " + age + " years old");
		isAlive = false;
	}

	public void consume(String food) {
		System.out.println(name + " ate " + food);
	}

	public Organism reproduce(Organism other) {
		// Create DNA that has both strands together
		DNA tempDNA = getCellDNA();
		tempDNA.add(other.getCellDNA());
		// Mix the DNA
		Collections.shuffle(tempDNA.getDNA());
		// Remove the second half of the dna
		tempDNA.split();
		tempDNA.mutate();
		return new Organism(tempDNA, getName(), 0, getHabitat(), getType());
	}

	public Cell getCell() {
		return cells.get(0);
	}

	public DNA getCellDNA() {
		return getCell().getDNA();
	}

	public int compareTo(Organism other) {
		return name.compareTo(other.getName());
	}
}