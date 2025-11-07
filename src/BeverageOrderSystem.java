import java.io.*;
import java.util.Scanner;

public class BeverageOrderSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Choose a drink:");
        System.out.println("1. Coffee");
        System.out.println("2. Tea");

        String order = getOrder(scanner);
        saveToFile(order);
        loadFromFile();

        scanner.close();
    }

    private static String getOrder(Scanner scanner) {
        int choice = 0;
        String[] coffeeChoices = {"Espresso (Short)", "Espresso (Long)", "Latte"};
        String[] teaChoices = {"Green Tea", "Black Tea"};

        while (choice < 1 || choice > 2) {
            System.out.print("Enter choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");
            }
        }

        if (choice == 1) {
            return customizeCoffee(scanner, coffeeChoices);
        } else {
            return customizeTea(scanner, teaChoices);
        }
    }

    private static String customizeCoffee(Scanner scanner, String[] options) {
        System.out.println("Select your coffee:");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }

        String choice = "";
        while (choice.equals("")) {
            try {
                int option = Integer.parseInt(scanner.nextLine());
                if (option > 0 && option <= options.length) {
                    choice = options[option - 1];
                } else {
                    System.out.println("Invalid selection, try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input, try again.");
            }
        }

        if (choice.equals("Latte")) {
            System.out.print("How many shots of espresso? (1 or 2): ");
            int shots = scanner.nextInt();
            scanner.nextLine(); // consume newline
            choice += " with " + shots + " shots";
        }

        System.out.print("Would you like it extra hot? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            choice += ", Extra Hot";
        }

        System.out.print("Would you like foam? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("no")) {
            choice += ", No Foam";
        }

        return choice;
    }

    private static String customizeTea(Scanner scanner, String[] options) {
        System.out.println("Select your tea:");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }

        String choice = "";
        while (choice.equals("")) {
            try {
                int option = Integer.parseInt(scanner.nextLine());
                if (option > 0 && option <= options.length) {
                    choice = options[option - 1];
                } else {
                    System.out.println("Invalid selection, try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input, try again.");
            }
        }

        System.out.print("Would you like honey or sugar? (honey/sugar/none): ");
        String sweetener = scanner.nextLine().toLowerCase();
        if (sweetener.equals("honey") || sweetener.equals("sugar")) {
            System.out.print("How many teaspoons? (1-3): ");
            int teaspoons = scanner.nextInt();
            scanner.nextLine(); // consume newline
            choice += " with " + teaspoons + " tsp of " + sweetener;
        }

        return choice;
    }

    private static void saveToFile(String order) {
        try {
            FileWriter writer = new FileWriter("order.txt");
            writer.write("Beverage: " + order);
            writer.close();
            System.out.println("Order saved.");
        } catch (IOException e) {
            System.out.println("Failed to save order.");
        }
    }

    private static void loadFromFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("order.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Previous Order: " + line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("No previous order found.");
        }
    }
}
