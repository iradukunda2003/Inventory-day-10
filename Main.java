import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();
        int choice;

        do {
            System.out.println("\n Inventory Tracker Menu ");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Item");
            System.out.println("4. Display All Items");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();

                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();

                    Item newItem = new Item(name, id, quantity, price);
                    inventory.addItem(newItem);
                    break;

                case 2:
                    System.out.print("Enter ID to remove: ");
                    int removeId = scanner.nextInt();
                    inventory.removeItem(removeId);
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    int updateId = scanner.nextInt();

                    System.out.print("Enter new Quantity: ");
                    int newQuantity = scanner.nextInt();

                    System.out.print("Enter new Price: ");
                    double newPrice = scanner.nextDouble();

                    inventory.updateItem(updateId, newQuantity, newPrice);
                    break;

                case 4:
                    inventory.displayItems();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        scanner.close();
    }
}