// Inventory.java

/*
 * Name: Surya Kannan
 * Date: 01/17/2025
 * Inventory
 */
import java.util.ArrayList;
public class Inventory {
    private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity) {
        items.add(new Item(name, price, quantity));
        System.out.println("Item added successfully!");
    }

    public void removeItem(String name) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                items.remove(item);
                System.out.println("Item removed successfully!");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void viewInventory() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }

    @Override
    public String toString() {
        return "Inventory [items=" + items + "]";
    }
    public void searchItem(String name) {
        boolean found = false;
        for (Item item : items) {
            if (item.getName().equals(name)) {
                System.out.println("Item found: " + item.getName() + ", Price: " + item.getPrice() + ", Quantity: " + item.getQuantity());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found.");
        }
    }
}