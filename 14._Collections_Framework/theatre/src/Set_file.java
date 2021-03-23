import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set_file {
    public static void main(String[] args) {

        TreeSet<Seat> p = new TreeSet<>();
        p.add(new Seat(2));
        p.add(new Seat(1));
        p.add(new Seat(1));
        for (Seat a : p)
            System.out.println(a.getSeatNumber());
        "A".equals("A");
        // Iterator<Integer> it = new p.iterator();
        // while (it.hasNext())
        // System.out.println(it.next());
    }
}
