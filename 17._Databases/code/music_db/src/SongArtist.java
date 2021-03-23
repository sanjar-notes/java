public class SongArtist {
    private String artistName, albumName;
    private int track;

    public String getArtistName() {
        return artistName;
    }

    public int getTrack() {
        return track;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setTrack(int track) {
        this.track = track;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
}
