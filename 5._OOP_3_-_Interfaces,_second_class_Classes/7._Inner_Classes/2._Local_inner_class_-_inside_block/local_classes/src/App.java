import java.util.Scanner;

public class App {
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
        Button btnPrin = new Button("Printo");
        class ClickListener implements Button.OnClickListener { // Interfaces are accessbile
            public ClickListener() {
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }

        btnPrint.setOnClickListener(new ClickListener()); // clickListener and button connected
        {
            Scanner scanner = new Scanner(System.in);
            boolean quit = false;
            while (!quit) {
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 0:
                        quit = true;
                        break;
                    case 1:
                        btnPrint.onClick();
                }
            }
        }
    }

}
