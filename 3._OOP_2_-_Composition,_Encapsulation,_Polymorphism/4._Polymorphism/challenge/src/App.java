public class App {
    public static void main(String[] args) throws Exception {
        App x = new App();
        System.out.println("Hello, World!" + x.op());
    }

    public String op()
    {
        return getClass().getSimpleName();
    }
}
