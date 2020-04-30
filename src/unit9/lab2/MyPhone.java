package unit9.lab2;

public class MyPhone extends MyDevice {
	private String carrier; // cell phone service provider

	public MyPhone() {
		super();
		this.carrier = new String("none");
	} // end zero argument constructor

	public MyPhone(int memory, String color, String carrier) {
		super(memory, color);
		this.carrier = carrier; // service provider
	} // end two argument constructor

	public String toString() {
		String output = new String("");
		output = super.toString() + "Carrier is: " + carrier;
		return output;
	} // end method toString()
} // end class MyPhone