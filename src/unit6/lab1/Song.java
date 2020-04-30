package unit6.lab1;

public class Song {
	private boolean favorite;
	private int plays;
	private int seconds;
	private int voiceCracks;
	private int falsettoNotes;
	private int numChords;
	private int yearReleased;

	public Song() {
		favorite = false;
		plays = 0;
		seconds = 59;
		voiceCracks = 0;
		falsettoNotes = 0;
		numChords = 4;
		yearReleased = 1969;
	}

	public Song(boolean favorite, int plays, int seconds, int voiceCracks, int falsettoNotes, int numChords,
			int yearReleased) {
		this.favorite = favorite;
		this.plays = plays;
		this.seconds = seconds;
		this.voiceCracks = voiceCracks;
		this.falsettoNotes = falsettoNotes;
		this.numChords = numChords;
		this.yearReleased = yearReleased;
	}

	public String toString() {
		return "Favorite: " + favorite + "\nPlays: " + plays + "\nVoice Cracks: " + voiceCracks + "\nFalsetto Notes: "
				+ falsettoNotes + "\nChords: " + numChords + "\n" + getSongLength() + "\nYear Released: " + getYearReleased();
	}

	public int getYearReleased() {
		return yearReleased;
	}

	public void setYearReleased(int newYear) {
		yearReleased = newYear;
	}

	public String getSongLength() {
		int seconds = this.seconds % 60;
		int minutes = this.seconds / 60;

		return "The length of the song is: " + minutes + " minutes and " + seconds + " seconds.";
	}
}