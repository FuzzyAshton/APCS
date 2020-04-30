package fallProject;

import java.util.ArrayList;
import java.util.Scanner;

public class EarthDriver {
	public static void main(String[] args) {
		// #17 Use of Scanner
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number of organisms on a given planet (in billions)");
		int length = in.nextInt();
		in.close();
		// #12 Use of Array and traversal
		Organism[] organismArr = new Organism[length];
		for (int i = 0; i < organismArr.length; i++) {
			organismArr[i] = new Organism();
		}
		ArrayList<Organism> organisms = new ArrayList<Organism>();
		for (Organism e : organismArr) {
			organisms.add(e);
		}
		// Use of zero arg
		Earth earth = new Earth();
		System.out.println(earth);
		System.out.println("There are " + earth.getThymineBases() + " thymine nitrogen bases throughout the world's DNA");
		int old = earth.getOldestIndex();
		System.out
				.println("The oldest organism is at index: " + old + "\nIts age is " + earth.getOrganism(old).getAge());
		System.out.println("Thanos snapped " + earth.thanosSnap() + " organisms");
		System.out.println("New earth:" + earth);
		System.out.println("Did Thanos kill aaron: " + earth.isAaron());
		Earth terra = new Earth(organisms);
		System.out.println("\n\n\n\n\n\n\n" + "Earth with " + length + " organisms: \n" + terra);
		int old2 = terra.getOldestIndex();
		System.out
				.println("The oldest organism is at index: " + old + "\nIts age is " + terra.getOrganism(old2).getAge());
		System.out.println("Thanos snapped " + terra.thanosSnap() + " organisms");
		System.out.println("Post Thanos earth: " + terra);

	}
}