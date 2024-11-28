package lab4.main.managers;

import java.util.ArrayList;

import lab4.main.items.Item;

public interface ItemManager {
    public ArrayList<Item> addItem(String name, int price, int quantity);

    public ArrayList<Item> getAllItems();

    public ArrayList<Item> deleteItem(String name, int price, int quantity);
}
