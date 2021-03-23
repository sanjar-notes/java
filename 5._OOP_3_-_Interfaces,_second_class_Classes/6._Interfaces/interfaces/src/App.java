public class App {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        ITelephone phone;
        phone = new DeskPhone(123);
        phone.callPhone(123);
        phone.answer();

        phone = new MobilePhone(123);
        phone.powerOn();
        phone.callPhone(123);
        phone.answer();
    }
}
