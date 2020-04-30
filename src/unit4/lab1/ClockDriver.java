package unit4.lab1;

public class ClockDriver {
	public static void main(String[] args) {
		Clock testClock = new Clock();
		System.out.println(testClock);
		testClock.setTime(1, 1, 1);
		System.out.println(testClock);
		testClock.convertDaylightSavings(5);
		System.out.println(testClock);
	}
}