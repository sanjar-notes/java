import java.util.*;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
        List<Integer> p = new ArrayList<>();
        p = new LinkedList<>();
        p = new Vector<>();
        p = new Stack<>();
        Queue<Integer> q = new PriorityQueue<>();
        Deque<Integer> q1 = new ArrayDeque<>();

        Set<Integer> r = new HashSet<>();
        r = new LinkedHashSet<>();

        SortedSet<Integer> r1 = new TreeSet<>();
        // theatre.getSeats();
        // if(theatre.reserveSeat("H11")) {
        // System.out.println("Please pay");
        // } else {
        // System.out.println("Sorry, seat is taken");
        // }
        // if(theatre.reserveSeat("H11")) {
        // System.out.println("Please pay");
        // } else {
        // System.out.println("Sorry, seat is taken");
        // }
    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list)
            System.out.println(" " + seat.getSeatNumber());
    }
}
