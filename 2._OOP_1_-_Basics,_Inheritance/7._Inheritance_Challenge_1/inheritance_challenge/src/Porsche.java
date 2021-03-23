public class Porsche extends Car {
    private static String brand = "Porsche";
    private String model;
    private String color;

    public Porsche(float speed, float steering, int gear, String model, String color) {
        super(speed, steering, gear);
        this.model = model;
        this.color = color;
    }

    public Porsche(String model, String color) {
        this(0, 0, 0, model, color);
    }

    public Porsche() {
        this("Unknown model", "Unknown color");
    }
}
