import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class fs_methods {
    public static void main(String[] args) {

        try (Scanner myObj = new Scanner(new FileReader("myLoc.md"))) {
            // for (String p : myObj.list())
            // System.out.println(p);
            // myObj.createNewFile(); // loc.txt will be created
            while (myObj.hasNextLine())
                System.out.print(myObj.nextLine());
        } catch (Exception e) {
        } finally {
        }
    }
}
