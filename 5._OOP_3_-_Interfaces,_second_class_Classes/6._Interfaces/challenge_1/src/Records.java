import java.util.List;
import java.util.ListIterator;

public class Records implements ISaveable {
    private List<String> savedValues;

    public Records(List<String> savedValues) {
        this.savedValues = savedValues;
    }

    @Override
    public List<String> getSavedValues() {
        return savedValues;
    }

    @Override
    public void populateFields(List<String> param) {
        for (String i : param)
            savedValues.add(i);
    }

    @Override
    public String toString() {
        String ret = "";
        for (String i : savedValues)
            ret += i.toString();
        return ret;
    }

    @Override
    public void displayValues() {
        ListIterator<String> it = this.savedValues.listIterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
