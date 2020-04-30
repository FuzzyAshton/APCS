package unit6.lab2;

public class ClockStore {
	Clock[] clocksInStock;
	public ClockStore(Clock clock1, Clock clock2, Clock clock3) {
		clocksInStock = new Clock[3];
		clocksInStock[0] = clock1;
		clocksInStock[1] = clock2;
		clocksInStock[2] = clock3;
	}

	public int mostSeconds() {
		int index = 0;
		int maxTime = clocksInStock[0].totalSeconds();
		for (int i = 0; i < clocksInStock.length; i++) {
			if (clocksInStock[i].totalSeconds() > maxTime) {
				maxTime = clocksInStock[i].totalSeconds();
				index = i;
			}
		}
		return index;
	}

	public String toString() {
		String output = "";
		for (int i = 0; i < clocksInStock.length; i++) {
			output += "Clock " + (i + 1) + " time: " + clocksInStock[i].toString() + "\n";
		}
		return output;
	}
}