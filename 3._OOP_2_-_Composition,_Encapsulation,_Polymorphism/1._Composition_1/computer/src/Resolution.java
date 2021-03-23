public class Resolution {
    private int height;
    private int width;

    public Resolution(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Resolution() {
        this(854, 480); // 480p
    }
}
