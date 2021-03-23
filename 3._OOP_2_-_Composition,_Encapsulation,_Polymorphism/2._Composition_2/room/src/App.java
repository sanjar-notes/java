public class App {
    public static void main(String[] args) throws Exception {
        Room myRoom = new Room("Bedroom");
        myRoom.open();
        myRoom.lock();
    }
}
