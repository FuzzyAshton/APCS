package finalProject;

public class Constants {
	// Source: https://nssdc.gsfc.nasa.gov/planetary/factsheet/
	// Mercury
	public static final int MERCURY_RADIUS = (int) (4879 / 2.0);
	public static final int MERCURY_DISTANCE_FROM_SUN = (int) 57.9; // In millions of kilometers
	// Venus
	public static final int VENUS_RADIUS = (int) (12104 / 2.0);
	public static final int VENUS_DISTANCE_FROM_SUN = (int) 108.2;
	// Earth
	public static final int EARTH_RADIUS = 6371; // Kilometers
	public static final int EARTH_DISTANCE_FROM_SUN = 149;
	public static final double EARTH_DAYS_PER_ORBIT = 365.26;
	public static final double KM_TO_ORBIT_DAYS = EARTH_DAYS_PER_ORBIT / (double) EARTH_DISTANCE_FROM_SUN; // Use to
																											// convert
																											// from
																											// distance
																											// to sun to
																											// days to
																											// complete
																											// one orbit
	// Mars
	public static final int MARS_RADIUS = (int) (6792 / 2.0);
	public static final int MARS_DISTANCE_FROM_SUN = (int) 227.9;
	// Jupiter
	public static final int JUPITER_RADIUS = (int) (142984 / 2.0);
	public static final int JUPITER_DISTANCE_FROM_SUN = (int) 778.6;
	// Saturn
	public static final int SATURN_RADIUS = (int) (120536 / 2.0);
	public static final int SATURN_DISTANCE_FROM_SUN = (int) 1433.5;
	// Uranus
	public static final int URANUS_RADIUS = (int) (51118 / 2.0);
	public static final int URANUS_DISTANCE_FROM_SUN = (int) 2872.5;
	// Neptune
	public static final int NEPTUNE_RADIUS = (int) (49528 / 2.0);
	public static final int NEPTUNE_DISTANCE_FROM_SUN = (int) 4495.1;
}