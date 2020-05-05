package finalProject;

public class OrganismDriver {
	// #11 Driver class
	public static void main(String[] args) {
		Organism something = new Organism("Something", 0.0, "The Universe", "Animal");
		Organism somethingElse = new Organism("Something Else", 1, "The Universe", "Plant");
		System.out.println(something);
		// #20 Calls method from another class
		something.die();
		something.consume("The universe");
		System.out.println(something);
		System.out.println(something.reproduce(somethingElse));
		System.out.println(something);
	}
}