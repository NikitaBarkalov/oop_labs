package lab4.main.managers;

public class Warehouse {
    public static void main(String[] args) {
        ItemManager foodManager = new FoodManager();
        ItemManager drinkManager = new DrinkManager();
        ItemManager bookManager = new BookManager();

        ItemFactory.addObject(foodManager, "Apple", 20, 15);
        ItemFactory.addObject(foodManager, "Banana", 25, 32);
        ItemDeleter.deleteObject(foodManager, "Banana", 25, 20);
        ItemFactory.addObject(drinkManager, "Milk", 30, 5);
        ItemFactory.addObject(bookManager, "Harry Potter", 5, 50);

        System.out.println("The list of food:" + foodManager.getAllItems());
        System.out.println("The list of drinks:" + drinkManager.getAllItems());
        System.out.println("The list of books:" + bookManager.getAllItems());
    }
}
