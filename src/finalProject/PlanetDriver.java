package finalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PlanetDriver {
	private static Scanner in;
	private static ArrayList<Planet> solarSystem;

	public static void main(String[] args) {
		// #20 Interaction with other classes
		solarSystem = new ArrayList<Planet>();
		in = new Scanner(System.in);
		// #23 Polymorphism
		solarSystem.add(new Earth());
		solarSystem.add(new Planet(Constants.MARS_RADIUS, Constants.MARS_DISTANCE_FROM_SUN, "Mars"));
		solarSystem.add(new Planet(Constants.MERCURY_RADIUS, Constants.MERCURY_DISTANCE_FROM_SUN, "Mercury"));
		solarSystem.add(new Planet(Constants.VENUS_RADIUS, Constants.VENUS_DISTANCE_FROM_SUN, "Venus"));
		solarSystem.add(new Planet(Constants.JUPITER_RADIUS, Constants.JUPITER_DISTANCE_FROM_SUN, "Jupiter"));
		solarSystem.add(new Planet(Constants.SATURN_RADIUS, Constants.SATURN_DISTANCE_FROM_SUN, "Saturn"));
		solarSystem.add(new Planet(Constants.URANUS_RADIUS, Constants.URANUS_DISTANCE_FROM_SUN, "Uranus"));
		solarSystem.add(new Planet(Constants.NEPTUNE_RADIUS, Constants.NEPTUNE_DISTANCE_FROM_SUN, "Neptune"));
		Collections.shuffle(solarSystem);
		System.out.println("Solar system:");
		printList(solarSystem);
		// #24 Mergesort (second time)
		Collections.sort(solarSystem);
		System.out.println("Sorted Solar System");
		printList(solarSystem);

		System.out.println("Would you like to learn more about the volume and surface area of the planets? Y/N");
		String input = in.next();
		if (input.equalsIgnoreCase("y")) {
			printVolumeSurfaceArea(solarSystem);
			printOrbitRotateInfo(solarSystem);
		}
		else {
			System.out.println("Thank you for your honesty. Enjoy the rest of your day");
		}
		in.close();
	}

	public static void printList(List<?> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static void printVolumeSurfaceArea(List<Planet> list) {
		for (int i = 0; i < list.size(); i++) {
			Planet temp = list.get(i);
			System.out.println(temp.getName() + " has a surface area of " + temp.getSurfaceArea() + " square kilometers and a volume of " + temp.getVolume() + " cubed kilometers");
		}
	}

	public static void printOrbitRotateInfo(List<Planet> list) {
		for (int i = 0; i < list.size(); i++) {
			Planet temp = list.get(i);
			System.out.println(temp.getName() + " takes " + temp.daysToOrbit() + " days to orbit the sun on average and " + temp.hoursToRotate() + " hours to rotate");
		}
	}
}