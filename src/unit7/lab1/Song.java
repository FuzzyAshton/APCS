package unit7.lab1;

public class Song {
	private String name;
	private int rating;

	public Song() {
		name = "The fitnessgram pacer test";
		rating = 1;
	}

	public Song(String name, int rating){
		this.name = name;
		this.rating = rating;
	}

	public String toString() {
		return "Title: " + name + "\nRating: " + rating;
	}

	public int getRating() {
		return rating;
	}

}