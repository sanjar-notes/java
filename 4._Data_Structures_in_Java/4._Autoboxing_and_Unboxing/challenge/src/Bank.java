import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branchList;
    private String BankName;

    public Bank(String BankName) {
        this.BankName = BankName;
        this.branchList = new ArrayList<Branch>();
    }

    public void addBranch(String branchName) {
        Branch newBranch = new Branch(branchName);
        branchList.add(newBranch);
    }

    public Branch getBranch(String branchName) {
        Branch temp;
        for (int i = 0, end = branchList.size(); i < end; i++) {
            temp = branchList.get(i);
            if (temp.getBranchName().equals(branchName))
                return temp;
        }
        return null;
    }
}
