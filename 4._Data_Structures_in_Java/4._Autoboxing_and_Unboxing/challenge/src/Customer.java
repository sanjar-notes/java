import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double> transactionList;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.transactionList = new ArrayList<Double>();
    }

    public void addTransaction(double amount) {
        transactionList.add(Double.valueOf(amount));
    }

    public String getName() {
        return customerName;
    }

    public void printTransactions() {
        System.out.println("Transactions:");
        for (int i = 0, end = transactionList.size(); i < end; i++)
            System.out.println("\t" + transactionList.get(i));
    }
}
