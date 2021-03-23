import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // int x = 90, y = 0;
        // System.out.println(divideLBYL(x, y));
        // System.out.println(divideEAFP(x, y));
        // System.out.println(divide(x, y));
        // int x = getInt();
        // System.out.println("x is " + x);
        try {
            int x = 1 / 1;
        } catch (Exception e) {
            int x = 0;
        } finally {
            System.out.println('p');
        }
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        while (true) {
            try {
                return s.nextInt();
            } catch (InputMismatchException e) {
                try {
                    s.nextLine();
                } catch (NoSuchElementException f) {
                    s.nextLine();
                    System.out.println("Please enter a number using only the digits 0 to 9");
                }
            }
            System.out.println("Please enter a number using only the digits 0 to 9");
        }
    }

    private static int getIntLBYL() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer ");
        String input = s.next();
        // for (int i = 0; i < input.size(); i++) {
        // if (!Character.isDigit(input.charAt(i))) {
        // isValid = false;
        // break;
        // }
        // }
        if (isValid)
            return Integer.parseInt(input);
        return 0;
    }

    private static int getIntEAFP() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        try {
            return s.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }

    private static int divideLBYL(int x, int y) {
        if (y != 0)
            return x / y;
        return 0;
    }

    private static int divideEAFP(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    private static int divide(int x, int y) {
        return x / y;
    }
}
