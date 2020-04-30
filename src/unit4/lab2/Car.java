package unit4.lab2;

public class Car {
	private String make;
	private String model;
	private String transmission;
	private double peakTorque;
	private double peakHP;

	public Car() {
		make = "Honda";
		model = "Civic";
		transmission = "Automatic";
		peakTorque = 160.0;
		peakHP = 128.0;
	}

	public Car(String make, String model, String transmission, double peakTorque, double peakHP) {
		this.make = make;
		this.model = model;
		this.transmission = transmission;
		this.peakTorque = peakTorque;
		this.peakHP = peakHP;
	}

	public String toString() {
		return make + " " + model + "\n" + transmission + "\n" + peakTorque + " lb*ft peak torque\n" + peakHP + " peak horsepower";
	}
}