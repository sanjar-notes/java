import java.util.ArrayList;
import java.util.Scanner;

public class Branch {
    private ArrayList<Customer> customerList;
    private String branchName;
    private static Scanner scanner = new Scanner(System.in);

    public Branch(String branchName) {
        this.customerList = new ArrayList<Customer>();
        this.branchName = branchName;
    }

    public void addCustomer(String name, double initTransactionAmount) {
        Customer newCustomer = new Customer(name);
        newCustomer.addTransaction(Double.valueOf(initTransactionAmount));
        customerList.add(newCustomer);
    }

    public void listCustomerList() {
        System.out.println("Show customer transactions(Y/N)?");
        Character choice = scanner.next().charAt(0);

        for (int i = 0, end = customerList.size(); i < end; i++) {
            System.out.println("Customer Name: " + customerList.get(i).getName());
            if(choice.charValue()=='Y')
                customerList.get(i).printTransactions();
        }
    }

    public String getBranchName() {
        return branchName;
    }
}
