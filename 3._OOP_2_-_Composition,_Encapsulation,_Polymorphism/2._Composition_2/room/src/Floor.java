public class Floor extends CementBlock {
    private String tiling;

    public Floor(String tiling) {
        super(10.00F, true, 100.0, 100.0, 2.0F);
        this.tiling = tiling;
    }

    public Floor() {
        this("Plain Glaze");
    }
}
