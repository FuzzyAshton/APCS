package finalProject;

public class Constants {
	public static final int EARTH_RADIUS = 6371; // Kilometers
	public static final int EARTH_DISTANCE_FROM_SUN = 149597870; // Kilometers
	public static final double EARTH_DAYS_PER_ORBIT = 365.26;
	public static final double KM_TO_ORBIT_DAYS = EARTH_DAYS_PER_ORBIT / (double) EARTH_DISTANCE_FROM_SUN; // Use to convert from distance to sun to days to complete one orbit
}