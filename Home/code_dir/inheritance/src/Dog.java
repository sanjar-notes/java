import javax.swing.SwingContainer;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    public String name;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); // calls the Animal constructor
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat called");
        chew();
        super.eat();
    }

    public void eat(int num) {
        System.out.println("Eating since " + num + " minutes ... Done.");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog moving ..., Done");
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5); // can refers to super.move() if no override for move() exists
        // calls this.move() if an override move exists
    }

}
