package unit4;

import javax.swing.JOptionPane;

public class Lab7 {
	public static void main(String[] args) {
		// Part 1
		int[] arr = {-9, 2, 3, 4, 7, 9, 10, 23, 45, 67};
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		for (int e: arr) {
			System.out.println(e);
		}
		int search = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the integer for which you want to search in the array."));
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				index = i;
				break;
			}
		}
		System.out.println("The index of that number is: " + index);
		// Part 2
		String[] teachers = new String[5];
		teachers[0] = "Ms. Wade";
		teachers[1] = "Ms. Dhyne";
		teachers[2] = "Ms. Wolf";
		teachers[3] = "Ms. Marcan";
		teachers[4] = "Mr. Bennet";
		for (String e: teachers) {
			System.out.println(e);
		}
	}
}