package unit4.lab1;

public class SongDriver {
	public static void main(String[] args) {
		Song song1 = new Song(true, 1000, 343, 0, 0, 7, 1969);
		System.out.println(song1.getYearReleased());
		song1.setYearReleased(2003);
		System.out.println(song1.getYearReleased());
		System.out.println(song1.getSongLength());
		System.out.println(song1);
	}
}