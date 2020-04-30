package unit6.lab1;

import java.util.ArrayList;

public class MyPod {
	private String color;
	private double storage;
	private ArrayList<Song> songLibrary;

	public MyPod() {
		color = "White";
		storage = 4.0;
		songLibrary = new ArrayList<Song>();
		for (int i = 0; i < 3; i++) {
			songLibrary.add(new Song());
		}
	}

	public MyPod(String color, double storage, ArrayList<Song> songLibrary){
		this.color = color;
		this.storage = storage;
		this.songLibrary = songLibrary;
	}

	public String getSongs() {
		String temp = "";
		for (Song e: songLibrary) {
			temp += e.toString() + "\n\n";
		}
		return temp;
	}

	public String toString() {
		return color + " MyPod " + storage + "GB" + " Songs:\n" + getSongs();
	}
}