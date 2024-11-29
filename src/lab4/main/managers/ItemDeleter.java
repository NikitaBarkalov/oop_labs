package lab4.main.managers;

public class ItemDeleter {
    public static void deleteObject(ItemManager manager, String name, int price, int quantity) {
        manager.deleteItem(name, price, quantity);
    }
}
