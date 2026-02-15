import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
        System.out.println("Item added successfully.");
    }

    public void removeItem(int id) {
        items.removeIf(item -> item.getId() == id);
        System.out.println("Item removed successfully.");
    }

    public void updateItem(int id, int quantity, double price) {
        for (Item item : items) {
            if (item.getId() == id) {
                item.setQuantity(quantity);
                item.setPrice(price);
                System.out.println("Item updated successfully.");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Item item : items) {
                item.displayItem();
            }
        }
    }
}