public class Room {
    private String name;
    private Walls walls;
    private Floor floor;
    private Ceiling ceiling;
    private Door door;

    public Room(String name, Walls walls, Floor floor, Ceiling ceiling, Door door) {
        this.name = name;
        this.walls = walls;
        this.floor = floor;
        this.ceiling = ceiling;
        this.door = door;
    }

    public Room() {
        this.name = "No name";
        this.walls = new Walls();
        this.floor = new Floor();
        this.ceiling = new Ceiling();
        this.door = new Door();
    }

    public Room(String name) {
        this();
        this.name = name;
    }

    public void lock() {
        door.lockDoor();
        System.out.println(this.name + " locked.");
    }

    public void open() {
        door.openDoor();
        System.out.println(this.name + " is open.");
    }
}
