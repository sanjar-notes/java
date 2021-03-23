import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private ArrayList<Contact> contacts;
    private static Scanner scanner = new Scanner(System.in);

    public MobilePhone() {
        this.contacts = new ArrayList<Contact>();
    }

    public Contact getQuery() {
        System.out.print("Enter the name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the phone number: ");
        String number = scanner.nextLine();
        Contact ret = new Contact(name, number);
        return ret;
    }

    public boolean queryContact() {
        Contact key = this.getQuery();
        Contact temp;
        for (int i = 0, end = contacts.size(); i < end; i++) {
            temp = contacts.get(i);
            if (temp.getName().equals(key.getName()) && temp.getNumber().equals(key.getNumber())) {
                System.out.println("Found");
                return true;
            }
        }
        System.out.println("Does not exist");
        return false;
    }

    public void addContact() {
        Contact newContact = this.getQuery();
        contacts.add(newContact);
    }

    public void modifyContact() {
        System.out.println("Contact to change -->");
        Contact origContact = this.getQuery();

        int contact_idx = contacts.indexOf(origContact);
        if (contact_idx == -1) {
            System.out.println("No such contact exists, exiting ...");
            return;
        } else {
            System.out.println("Changes -->");
            Contact editedContact = this.getQuery();
            contacts.get(contact_idx).setName(editedContact.getName());
            contacts.get(contact_idx).setNumber(editedContact.getNumber());
            System.out.println("Modification Successful");
        }
    }

    public void removeContact() {
        Contact toBeRemoved = this.getQuery();
        if (contacts.contains(toBeRemoved)) {
            contacts.remove(toBeRemoved);
            System.out.println("Contact removed successfully");
        } else
            System.out.println("Contact does not exist");
    }

}
