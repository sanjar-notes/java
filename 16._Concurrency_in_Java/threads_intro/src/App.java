public class App {
    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_RED + "Hello from the main thread.");

        Thread anotherThread = new AnotherThread(); // method 1 - extending
        anotherThread.start(); // start the thread

        (new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(0L, 0);
                    System.out.println(ThreadColor.ANSI_GREEN + "Hello from anonymous");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();

        System.out.println(ThreadColor.ANSI_RED + "Hello from the main thread again-1");
        Thread newThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                try {
                    anotherThread.join();
                    // Thread.sleep(6000);
                    System.out.println(ThreadColor.ANSI_BLUE + "anotherThread terminated sleep 6");
                } catch (InterruptedException e) {
                    System.out.println(ThreadColor.ANSI_RED + "I couldn't wait after all. I was interrupted");
                }
            }
        });
        newThread.start();
        // newThread.interrupt();
        anotherThread.interrupt();
    }
}
