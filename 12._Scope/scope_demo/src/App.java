public class App {
    public final static int p;

    static {
        p = 23;
        System.out.println("SI called 1st");
    }

    public App() {
        System.out.println("Constructor called");
    }

    static {
        System.out.println("SI called again");
    }

    public static void main(String[] args) {
        System.out.println("Main");
        App obj = new App();
    }
}
