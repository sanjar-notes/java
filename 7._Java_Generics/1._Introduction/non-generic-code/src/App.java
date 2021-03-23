import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // ArrayList items = new ArrayList();
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        // items.add("Three");
        // printDoubled(items);
        // System.out.println(items.get(2));
    }

    public static void printDoubled(ArrayList<Integer> in) {
        for (Object i : in)
            System.out.println((Integer) i * 2);
    }
}
