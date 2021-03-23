public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public String nickName;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public Animal(String nickName) {
        this.nickName = nickName;
    }

    public void eat() {
        System.out.println("I am eating ..., Done.");
    }

    public void move(int speed) {
        System.out.println("Moving at " + speed + " ..., Done.");
    }
}
