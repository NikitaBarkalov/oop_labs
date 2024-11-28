package lab4.main.items;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "(Item: " + name + ", Price: " + price + ", Quantity: " + quantity + ")";
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int updateQuantity(int updateValue) {
        this.quantity += updateValue;
        if (quantity < 0) {
            this.quantity = 0;
        }
        return this.quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
