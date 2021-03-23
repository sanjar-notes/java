public class Walls extends CementBlock {
    private String wallpaper;
    private String texture;

    public Walls(double density, boolean hasBarsInside, double width, double height, double thickness, String wallpaper,
            String texture) {
        super(density, hasBarsInside, width, height, thickness);
        this.wallpaper = wallpaper;
        this.texture = texture;
    }

    public Walls(String wallpaper, String texture) {
        super(5.0D, false, 100.0D, 100.0D, 1.0D);
        this.wallpaper = wallpaper;
        this.texture = texture;
    }

    public Walls() {
        this("Plain White", "Smooth");
    }
}
