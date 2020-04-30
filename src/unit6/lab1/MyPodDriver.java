package unit6.lab1;

import java.util.ArrayList;

public class MyPodDriver {
	public static void main(String[] args) {
		ArrayList<Song> songs = new ArrayList<Song>();
		songs.add(new Song(false, 0, 180, 0, 0, 20, 1969));
		songs.add(new Song());
		MyPod carPod = new MyPod("Black", 4, songs);
		System.out.println(carPod);
	}
}