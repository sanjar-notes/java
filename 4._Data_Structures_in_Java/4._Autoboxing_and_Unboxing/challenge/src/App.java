public class App {
    public static void main(String[] args) {
        Bank sbi = new Bank("State Bank of India");
        sbi.addBranch("Dabki Road");
        Branch dabki_road = sbi.getBranch("Dabki Road");
        dabki_road.addCustomer("Sanjar", 100.0D);
        dabki_road.addCustomer("Afaq", 50.0D);
        dabki_road.listCustomerList();
    }
}
