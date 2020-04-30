package unit3;

import java.util.Scanner;

public class Day2 {
	private static Scanner in;
	public static void main(String[] args) {
		// A
		/*
		String[] mySongs = {"Back in Black", "Thunderstruck", "Ramble On", "Limon y Sal", "Take on Me", "Rock Lobster"};
		for (int i = 0; i < mySongs.length; i++) {
			System.out.println(mySongs[i]);
		}
		System.out.println(mySongs.length);
		// B
		*/
		/*
		String[] userSongs = new String[3];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < userSongs.length; i++) {
			System.out.println("Enter one of your favorite songs: ");
			userSongs[i] = in.nextLine();
		}
		for (int i = 0; i < userSongs.length; i++) {
			System.out.println(userSongs[i]);
		}
		*/
		// C
		int[] myNumbers = new int[3];
		in = new Scanner(System.in);
		for (int i = 0; i < myNumbers.length; i++) {
			System.out.println("Enter one of your favorite numbers: ");
			myNumbers[i] = getValidInt();
		}
		for (int element: myNumbers){
			System.out.println(element);
		}
	}

	public static int getValidInt() {
		while (!in.hasNextInt()){
			System.out.println("Enter an integer: ");
			in.next();
		}
		return in.nextInt();
	}
}