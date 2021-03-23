public class Car {
    private boolean engine;
    private String name;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.engine = false;
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return this.name;
    }

    public int getCylinders() {
        return this.cylinders;
    }

    public String startEngine() {
        return "Car --> startEngine()";
    }

    public String accelerate() {
        return "Car --> accelerate()";
    }
}
