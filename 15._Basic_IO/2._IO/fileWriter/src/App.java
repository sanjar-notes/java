import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        FileWriter locFile = null;
        // FileReader locFile = null;
        String[] p = { "Muhammad", "Sanjar", "Afaq" };
        try {
            locFile = new FileWriter("locations.txt");
            // locFile = new FileReader("locations.txt");
            // while (locFile.ready())
            // System.out.print((char) locFile.read());
            for (String s : p)
                locFile.write(s + "\n");
            locFile.close();
        } catch (IOException e) {
            System.out.println("In catch block");
            e.printStackTrace();
        }
    }
}
