public class MercedesBenz extends Car {
    public MercedesBenz(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "MercedesBenz --> startEngine()";
    }

    @Override
    public String accelerate() {
        return "MercedesBenz --> accelerate()";
    }
}
