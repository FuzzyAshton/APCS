package unit6.lab2;

public class ClockDriver {
	public static void main(String[] args) {
		Clock clock1 = new Clock();
		Clock clock2 = new Clock(10, 10, 10);
		Clock clock3 = new Clock(4, 20, 69);
		ClockStore store = new ClockStore(clock1, clock2, clock3);
		System.out.println("Clock with the largest time: " + store.mostSeconds());
		System.out.println(store);
	}
}