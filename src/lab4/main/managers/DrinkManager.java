package lab4.main.managers;

import java.util.ArrayList;

import lab4.main.items.Drink;
import lab4.main.items.Item;
import lab4.main.validators.Validator;

public class DrinkManager implements ItemManager {
    private ArrayList<Item> listDrinks;

    public DrinkManager() {
        this.listDrinks = new ArrayList<Item>();
    }

    public ArrayList<Item> addItem(String name, int price, int quantity) {
        if (!Validator.isItemInList(listDrinks, name, price)) {
            this.listDrinks.add(new Drink(name, price, quantity));
            return this.listDrinks;
        }
        int index = Validator.indexItemByParameters(listDrinks, name, price);
        listDrinks.get(index).updateQuantity(quantity);
        return this.listDrinks;
    }

    public ArrayList<Item> deleteItem(String name, int price, int quantity) {
        if (!Validator.isItemInList(listDrinks, name, price)) {
            return this.listDrinks;
        }
        int index = Validator.indexItemByParameters(listDrinks, name, price);
        listDrinks.get(index).updateQuantity(-quantity);
        listDrinks.removeIf(item -> item.getQuantity() == 0);
        return this.listDrinks;
    }

    public ArrayList<Item> getAllItems() {
        return this.listDrinks;
    }
}
