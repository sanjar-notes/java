import java.util.LinkedList;

public class Album {
    private String albumName;
    private String artist;
    private LinkedList<Song> songList;

    public Album(String albumName) {
        songList = new LinkedList<Song>();
    }

    public void addSong(Song song) {
        if (songList.contains(song) == false)
            songList.add(song);
    }

    public void removeSong(Song song) {
        if (songList.contains(song) == false)
            songList.remove(song);
    }

    public Song findSong(String title)
    {
        for(Song checkSong: this.songs)
    }
}
