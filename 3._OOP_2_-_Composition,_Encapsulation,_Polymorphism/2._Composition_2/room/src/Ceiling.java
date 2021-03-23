public class Ceiling extends CementBlock {
    private boolean hasFan;
    private boolean hasChandelier;

    public Ceiling(boolean hasFan, boolean hasChandelier) {
        super(10.00F, true, 100.0, 100.0, 2.0F);
        this.hasFan = hasFan;
        this.hasChandelier = hasChandelier;
    }

    public Ceiling() {
        this(false, false); // no fan, no chandelier
    }
}
