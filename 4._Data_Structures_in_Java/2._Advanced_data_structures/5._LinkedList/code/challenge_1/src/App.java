public class App {
    public static void main(String[] args) throws Exception {
        Song[] songs = { new Song("A", 0), new Song("B", 0) };
        for(Song song: songs)
            song.print();
    }
}
