public class Car {
    private int doors;
    public int wheels;
    private String model;
    private String engine;
    private String color;

    public Car() {
        this.model = "undefined";
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void getModel() {
        System.out.println(this.model);
    }
}
