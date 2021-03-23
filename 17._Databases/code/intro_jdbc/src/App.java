import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static final String DB_NAME = "../testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:" + DB_NAME;
    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {
        try {
            // Connection conn = DriverManager.getConnection("jdbc:sqlite:../music.db");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:../testjava.db");
            // conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            // statement.execute("CREATE TABLE IF NOT EXISTS contacts" + "(name TEXT, phone INTEGER, email TEXT)");
            // statement.execute("INSERT INTO contacts  values('Joe', 9038, 'dog@email.com')");
            // statement.execute("INSERT INTO contacts  values('Jane', 123456, 'jane@somewhere.com')");

            // statement.execute("UPDATE contacts set phone=5566789 where name='Jane'");
            // statement.execute("DELETE FROM contacts where name='Joe'");
            // statement.execute("SELECT * FROM contacts");
            ResultSet results = statement.executeQuery("SELECT * FROM contacts");
            // statement.getResultSet();
            while (results.next())
                System.out.println(results.getString("name")+" "+results.getInt("phone")+" "+results.getString("email"));
            results.close();
            statement.close();
            conn.close();
            System.out.println("\\%s".format("Bingo"));
        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
