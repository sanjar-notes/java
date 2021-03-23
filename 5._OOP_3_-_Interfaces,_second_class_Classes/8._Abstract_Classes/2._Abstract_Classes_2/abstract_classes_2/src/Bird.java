public abstract class Bird extends Animal implements canFly {
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

    // public abstract void fly();
    // Not required anymore, the interface has a method called fly().
    // We can skip it -
    // https://stackoverflow.com/questions/197893/why-an-abstract-class-implementing-an-interface-can-miss-the-declaration-impleme#:~:text=As%2C%20it%20is%20not%20important,in%20interface%20without%20implementation%20here.
}
