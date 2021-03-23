import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class App {
    public static void main(String[] args) {
        Map<Integer> p = new TreeMap<>();
        // p.add(new Seat(1));
        // p.add(new Seat(3));
        // p.add(new Seat(2));
        // p.add(new Seat(4));
        // Collections.reverse(p);
        for (Seat seat : p)
            System.out.println(seat.getSeatNumber());
    }
}
