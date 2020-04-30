package unit9.lab2;

import java.util.ArrayList;

public class MyDevicesDriver {
	public static void main(String[] args) {
		System.out.println("Typical printout of individual objects...");
		MyPhone phone1 = new MyPhone();
		MyPhone phone2 = new MyPhone(16, "Gold", "ATT");
		System.out.println(phone1);
		System.out.println();
		System.out.println(phone2);
		System.out.println("\n");

		MyPod pod1 = new MyPod();
		MyPod pod2 = new MyPod(64, "Blue");
		System.out.println(pod1);
		System.out.println();
		System.out.println(pod2);
		System.out.println("\n");

		MyWatch watch1 = new MyWatch();
		MyWatch watch2 = new MyWatch(16, "Green", "12:34", true);
		System.out.println(watch1);
		System.out.println();
		System.out.println(watch2);
		System.out.println("\n");

		MyRobot mothership = new MyRobot(1, "Silver", 5026);

		System.out.println("Now with Inheritance");
		System.out.println("Polymorphically! traversing the ArrayList of MyDevices...");
		ArrayList<MyDevice> inventory = new ArrayList<MyDevice>();
		inventory.add(phone1);
		inventory.add(phone2);
		inventory.add(pod1);
		inventory.add(pod2);
		inventory.add(watch1);
		inventory.add(watch2);
		inventory.add(mothership);

		for (MyDevice device : inventory) {
			System.out.println(device);

		} // end for each

		System.out.println("\n\n\nSteps to implementing Inheritance...");
		System.out.println("Step 1 - Factor out common instance variables and methods into a superclass");
		System.out.println("Step 2 - use keyword \"extend\" to link it to the superclass");
		System.out.println("Step 3 - use super() to call the superclass's constructor (zero or multi)");
		System.out.println("Step 4 - use super.methodCall() to call methods in the superclass");
		System.out.println("Step 5 - create arrays or ArrayLists of superclass object to "
				+ " polymorphically process all \"seemingly different\" objects");

	} // end method main

} // end class MyDevicesDriver