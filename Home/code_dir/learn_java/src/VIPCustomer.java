public class VIPCustomer {
    private String name;
    private int age;

    public VIPCustomer() {
        System.out.println("Empty constructor called");
    }

    public VIPCustomer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void intro() {
        System.out.println("My name is " + this.name + ", I'm " + this.age + " years old.");
    }
}
