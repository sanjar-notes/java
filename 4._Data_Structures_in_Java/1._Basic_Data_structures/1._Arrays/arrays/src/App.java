import java.util.Scanner;
import java.util.Arrays;
// import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) scanner.next();
        System.out.println(Arrays.toString(arr));
    }

}
