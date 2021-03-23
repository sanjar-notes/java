import java.util.Scanner;

public class Array {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int len = scanner.nextInt();
        float[] myVariable = getNums(len);
        for (int i = 0, end = myVariable.length; i < end; i++)
            System.out.println(myVariable[i]);
    }

    public static float[] getNums(int len) {
        float[] ret = new float[len];
        for (int i = 0; i < len; i++)
            ret[i] = scanner.nextFloat();
        return ret;// passes the reference
    }
}
