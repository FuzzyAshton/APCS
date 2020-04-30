package unit4.lab2;

public class CarDriver {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println(car1);
		Car car2 = new Car("BMW", "325ci", "Manual", 180.0, 189.0);
		System.out.println(car2);
	}
}