package finalProject;

// #22 Student-designed interface implemented
public class Planet implements Orbitable {
	private int radius;
	private int distanceToSun; // Average distance in kilometers

	public Planet(int radius, int distanceToSun) {
		this.radius = radius;
		this.distanceToSun = distanceToSun;
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
		return (int) (distanceToSun * Constants.KM_TO_ORBIT_DAYS);
	}
}