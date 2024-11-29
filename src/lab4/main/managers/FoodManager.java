package lab4.main.managers;

import java.util.ArrayList;

import lab4.main.items.Food;
import lab4.main.items.Item;
import lab4.main.validators.Validator;

public class FoodManager implements ItemManager {
    private ArrayList<Item> listFood;

    public FoodManager() {
        this.listFood = new ArrayList<Item>();
    }

    public ArrayList<Item> addItem(String name, int price, int quantity) {
        if (!Validator.isItemInList(listFood, name, price)) {
            this.listFood.add(new Food(name, price, quantity));
            return this.listFood;
        }
        int index = Validator.indexItemByParameters(listFood, name, price);
        listFood.get(index).updateQuantity(quantity);
        return this.listFood;
    }

    public ArrayList<Item> deleteItem(String name, int price, int quantity) {
        if (!Validator.isItemInList(listFood, name, price)) {
            return this.listFood;
        }
        int index = Validator.indexItemByParameters(listFood, name, price);
        listFood.get(index).updateQuantity(-quantity);
        listFood.removeIf(item -> item.getQuantity() == 0);
        return this.listFood;
    }

    public ArrayList<Item> getAllItems() {
        return listFood;
    }
}
