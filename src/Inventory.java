// Inventory.java

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

    public void searchItem(String name) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                System.out.println(item);
                return;
            }
        }
        System.out.println("Item not found.");
    }

    @Override
    public String toString() {
        return "Inventory [items=" + items + "]";
    }
    
}