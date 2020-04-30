package unit6.lab4;

public class DoorDriver {
	public static void main(String[] args) {
		Door front = new Door("Front", true);
		Door side = new Door("Side", false);
		Door back = new Door("Back", true);
		System.out.println(front);
		System.out.println(side);
		System.out.println(back);
	}
}