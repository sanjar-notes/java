public class AnonymousClass {
    public static void main(String[] args) {
        (new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000L);
                    System.out.println(ThreadColor.ANSI_GREEN + "Hello from anonymous");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
