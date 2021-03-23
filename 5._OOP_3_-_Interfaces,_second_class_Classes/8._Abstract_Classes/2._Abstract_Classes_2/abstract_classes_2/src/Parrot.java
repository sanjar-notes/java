public class Parrot extends Bird {
    public Parrot(String name) {
        super(name);
    }

    @Override   // this is the interfaces fly method
    public void fly() {
        System.out.println(getName() + " is flying");
    }
}
