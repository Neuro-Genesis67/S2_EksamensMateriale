package eksempel;

public class BajkaCD {

	private Song[] songs;
	private static int songsIndex;

	public BajkaCD() {
		songs = new Song[3];
		songsIndex = 0;
	}

	public void addSong(int track, String title) {
		Song song = new Song(track, title);
		songs[songsIndex] = song;
		songsIndex++;
	}

	public Song[] getSongs() {
		return songs;
	}
}
