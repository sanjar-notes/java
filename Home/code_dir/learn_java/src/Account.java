public class Account {
    // public static void main(String args[]) {

    // }
    private int acc_number;
    private double balance;
    private String customer_name;
    private String customer_email;
    private long customer_phone_number;

    public Account() {
        this.balance = 0;
    }

    public void deposit(double fund) {
        if (fund <= 0)
            return;
        balance += fund;

        System.out.println(fund + " deposited successfully.");
    }

    public void withdraw(double fund) {
        if (fund >= 0 && balance >= fund) {
            balance -= fund;
            System.out.println(fund + " withdrawn successfully. Current Balance: " + this.balance);
        }

    }

    public static void main(String[] args) {
        Account me = new Account();
        me.deposit(123);
        me.withdraw(23);
    }
}
