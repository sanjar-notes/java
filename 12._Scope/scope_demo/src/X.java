public class X {
    private int x;

    public static int p = 2;
    public void setx() {
        java.util.Scanner x = new java.util.Scanner(System.in);
        this.x = x.nextInt();
    }

    public void printTable() {
        for (int x = 1; x <= 12; x++)
            System.out.println(this.x * x);
    }

    public static void main(String[] args) {
        X x = new X();
        x.setx();
        x.printTable();
    }
}
