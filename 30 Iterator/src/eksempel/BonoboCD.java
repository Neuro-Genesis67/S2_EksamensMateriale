package eksempel;

import java.util.ArrayList;

public class BonoboCD {

	private ArrayList<Song> songs;

	public BonoboCD() {
		songs = new ArrayList<Song>();
		addSong(1, "Days to come");
		addSong(2, "Transmission 94");
		addSong(3, "On your marks");
	}

	public void addSong(int track, String title) {
		Song song = new Song(track, title);
		songs.add(song);
	}

	public ArrayList<Song> getSongs() {
		return songs;
	}
}
