public class Audi extends Car {
    public Audi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Audi --> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Audi --> accelerate()";
    }
}
