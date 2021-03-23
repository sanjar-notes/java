import java.util.LinkedList;
import java.util.ListIterator;

public class App {
    private static LinkedList<String> placesToVisit;

    // public App()
    // {

    // }
    public static void main(String[] args) throws Exception {
        placesToVisit = new LinkedList<String>();
        placesToVisit.add("Italy");
        placesToVisit.add("Egypt");
        placesToVisit.add("Switzerland");
        placesToVisit.add("China");
        placesToVisit.add(0, "a");
        placesToVisit.set(0, "b");
        placesToVisit.getFirst();
        printList();
    }

    public static void printList() {
        // for (int i = 0, end = placesToVisit.size(); i < end; i++) // O(n^2)
        // System.out.println(placesToVisit.get(i)); // O(n)
        ListIterator<String> it = placesToVisit.listIterator();
        // it.next();
        while (it.hasNext()) // O(n)
        {
            System.out.print(it.previous() + " --> "); // O(1)
            it.next();
        }
        System.out.println("(\"__\") <--");
    }
}
