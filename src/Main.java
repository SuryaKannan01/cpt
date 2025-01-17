import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Inventory Management System");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Inventory");
            System.out.println("4. Search Item");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter item price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter item quantity: ");
                    int quantity = scanner.nextInt();
                    inventory.addItem(name, price, quantity);
                    break;
                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeName = scanner.nextLine();
                    inventory.removeItem(removeName);
                    break;
                case 3:
                    System.out.println(inventory.toString());
                    break;
                case 4:
                    System.out.print("Enter item name to search: ");
                    String searchName = scanner.nextLine();
                    inventory.searchItem(searchName);
                case 5:
                    System.out.println("Exiting system. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
}
