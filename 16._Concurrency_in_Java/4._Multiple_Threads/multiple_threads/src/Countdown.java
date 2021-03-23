public class Countdown {
    private Integer i;

    public void doCountDown() {
        String color;
        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                color = ThreadColor.ANSI_GREEN;
        }
        for (this.i = 10; this.i > 0; this.i--)
            System.out.println(color + Thread.currentThread().getName() + ": i=" + this.i);
    }

    public void doCountDown_synchronized() {
        String color;
        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                color = ThreadColor.ANSI_GREEN;
        }
        synchronized (this) {
            for (this.i = 10; this.i > 0; this.i--)
                System.out.println(color + Thread.currentThread().getName() + ": i=" + this.i);
        }
    }
}
