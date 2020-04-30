package unit9.lab2;

public class MyRobot extends MyDevice {
	private int team;

	public MyRobot(int memory, String color, int team) {
		super(memory, color);
		this.team = team;
	}

	public int getTeam() {
		return team;
	}

	public void setTeam(int teamNumber) {
		team = teamNumber;
	}

	public String toString() {
		return super.toString() + "\nTeam Number: " + team;
	}
}