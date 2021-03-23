public class CementBlock {
    private double density;
    private boolean hasBarsInside;
    private double length, breadth, thickness;

    public CementBlock(double density, boolean hasBarsInside, double length, double breadth, double thickness) {
        this.density = density;
        this.hasBarsInside = hasBarsInside;
        this.length = length;
        this.breadth = breadth;
        this.thickness = thickness;
    }
}
