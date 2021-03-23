import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();
        for (int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }
        cubes.retainAll(squares);
        Integer[] p = { 1, 2, 3 };
        Arrays q = Arrays.asList(p);
        System.out.println();
    }
}
