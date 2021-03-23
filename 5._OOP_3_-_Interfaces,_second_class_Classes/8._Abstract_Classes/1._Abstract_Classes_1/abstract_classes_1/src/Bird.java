public abstract class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override // implementing eat
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override // implementing breathe
    public void breathe() {
        System.out.println("Breath in, breath out, repeat.");

    }

    public abstract void fly();
}
