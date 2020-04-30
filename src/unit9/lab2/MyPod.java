package unit9.lab2;

public class MyPod extends MyDevice {

	public MyPod() {
		super();
	} // end zero argument constructor

	public MyPod(int memory, String color) {
		super(memory, color);
	} // end two argument constructor

	public String toString() {
		return super.toString(); // call the toString() method from MyDevice...
									// no need to rewrite it again!
	} // end method toString()

} // end class MyPad