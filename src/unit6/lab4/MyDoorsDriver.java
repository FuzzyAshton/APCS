package unit6.lab4;

public class MyDoorsDriver {
	public static void main(String[] args) {
		MyDoors doors = new MyDoors();
		System.out.println(doors);
		System.out.println("There were " + doors.tornado() + " doors that were opened and doors wanted that were removed");
		System.out.println(doors);
	}
}