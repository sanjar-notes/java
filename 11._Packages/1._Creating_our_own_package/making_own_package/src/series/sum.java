package series;

public class sum {
    Integer start, end;
    String name;

    public sum(String name, Integer start, Integer end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    public sum(String name, Integer end) {
        this(name, 1, end);
    }

    public static int nSum(int n) {
        return n * (n + 1) / 2;
    }

    public static int factorial(int n) {
        if (n < 0)
            return -1;
        int ret = 1;
        for (int i = 1; i <= n; i++)
            ret *= i;
        return ret;
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2)
            return n - 1;
        int a = 0, b = 1, temp;
        for (int i = 0; i < n; i++) {
            temp = b;
            b += a;
            a = temp;
        }
        return b;
    }

    public static class A {
        public static void main(String[] args) {
            System.out.println("Bingo");
        }
    }

    public static interface Innersum {
        protected int p = 2;

        protected abstract void f();
    }
}
