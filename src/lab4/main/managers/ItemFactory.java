package lab4.main.managers;

public class ItemFactory {
    public static void addObject(ItemManager creator, String name, int price, int quantity) {
        creator.addItem(name, price, quantity);
    }
}
