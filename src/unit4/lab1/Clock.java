package unit4.lab1;

public class Clock {
	private int hours;
	private int minutes;
	private int seconds;

	public Clock() {
		this.hours = 13;
		this.minutes = 23;
		this.seconds = 42;
	}

	public Clock(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public String toString() {
		String amOrPM;
		if (hours >= 12) {
			amOrPM = "PM";
		}
		else {
			amOrPM = "AM";
		}
		return "The 24-hour time is " + hours + ":" + minutes + ":" + seconds + "\nFYI in the 12-hour time is "
				+ (hours % 12) + ":" + minutes + ":" + seconds + " " + amOrPM + "\nThe total seconds are " + totalSeconds();
	}

	public void setTime(int h, int m, int s) {
		hours = h;
		minutes = h;
		seconds = s;
	}

	public void convertDaylightSavings(int hours) {
		this.hours += hours;
	}

	public int totalSeconds() {
		return ((hours * 3600) + (minutes * 60) + (seconds));
	}


}