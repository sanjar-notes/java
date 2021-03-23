import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Datasource datasource = new Datasource();
        if (!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }
        // List<Artist> artists = datasource.queryArtists(56);
        // if (artists != null) {
        // for (Artist artist : artists)
        // System.out.println("ID: " + artist.getId() + ", Name: " + artist.getName());
        // } else
        // System.out.println("No artists!");

        List<String> albumsForArtist = datasource.queryAlbumForArtist("Carole King", Datasource.ORDER_BY_DESC);
        for (String album : albumsForArtist)
            System.out.println(album);
        // datasource.querySongsMetaData();
        // datasource.getCountAndMinIDForArtists();
        // datasource.createSongArtistView(Datasource.ORDER_BY_ASC);
        datasource.close();
    }
}
