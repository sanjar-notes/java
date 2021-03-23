import java.lang.reflect.Array;
import java.util.List;

public interface ISaveable {
    List<String> getSavedValues();

    void populateFields(List<String> param);

    void displayValues();
}
