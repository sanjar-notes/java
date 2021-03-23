import java.util.ArrayList;

public class arrayList_intro {

    public static void main(String[] args) {
        ArrayList<String> memo = new ArrayList<>();
        memo.add("power2");
        memo.remove("power2");
        memo.add(0, "power3");
        System.out.println(memo.indexOf("power2"));
    }
}
