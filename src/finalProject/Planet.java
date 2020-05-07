package finalProject;

// #22 Student-designed interface implemented
public class Planet implements Orbitable, Comparable<Planet> {
	private int radius;
	private int distanceFromSun; // Average distance in millions of kilometers
	private String name;

	public Planet(int radius, int distanceFromSun, String name) {
		this.radius = radius;
		this.distanceFromSun = distanceFromSun;
		this.name = name;
	}

	public double getSurfaceArea() {
		return 4 * Math.PI * radius * radius;
	}

	public double getVolume() {
		return (4 / 3) * Math.PI * radius * radius * radius;
	}

	/**
	 * Return a random amount of time for a full rotation because there is no direct relationship for it
	 */
	public int hoursToRotate() {
		return (int) (Math.random() * 26);
	}

	/**
	 * Calculate the days it should take to orbit the sun based on the relationship
	 * between the Earth's distance and its time to orbit
	 */
	public int daysToOrbit() {
		return (int) (distanceFromSun * Constants.KM_TO_ORBIT_DAYS);
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return name + " has a radius of " + radius + " kilometers and a distance to the sun of " + distanceFromSun + " million kilometers.\n";
	}

	/**
	 * Order planets by their distance from the sun
	 */
	public int compareTo(Planet other) {
		int daysToOrbit = daysToOrbit();
		int otherDaysToOrbit = other.daysToOrbit();
		if (daysToOrbit < otherDaysToOrbit) {
			return -1;
		}
		else if (daysToOrbit > otherDaysToOrbit) {
			return 1;
		}
		else {
			return 0;
		}
	}
}