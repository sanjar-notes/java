
public class App {

    public static void main(String[] args) {
        Countdown countdown = new Countdown();
        CountdownThread t1 = new CountdownThread(countdown);
        t1.setName("Thread 1");
        t1.start();
        CountdownThread t2 = new CountdownThread(countdown);
        t2.setName("Thread 2");

        try {
            // t1.join();
            t1.start();
            t2.start();
            // t2.join();
            // throw new InterruptedException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int f() {
        // return 0;
        try {
            Integer x = 1;
            return 1;
        } catch (Exception e) {
            System.out.println("In catch");
            return 2;
        } finally {
            System.out.println("In the finally");
        }
    }
}
