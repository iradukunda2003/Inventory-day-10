public class Item {

    private String name;
    private int id;
    private int quantity;
    private double price;

    public Item(String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayItem() {
        System.out.println("ID: " + id +
                ", Name: " + name +
                ", Quantity: " + quantity +
                ", Price: $" + price);
    }
}
