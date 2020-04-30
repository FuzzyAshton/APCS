package unit2;

public class SineWave {
	private static double amplitude;
	private static double period;
	private static double b;
	private static double c;
	public static void main(String[] args) {
		amplitude = 10;
		period = 20;
		b = Math.PI/period;
		c = amplitude;
		int times = 1000;
		for (int i = 0; i < times; i++) {
			for (int j = 0; j < f(i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/**
	 * Sine function given the specific variables
	 * @param x Number (in radians) to input into the sine function
	 * @return Output of sine function
	 */
	public static double f(double x){
		return (amplitude * Math.sin(b * (x)) + c);
	}
}