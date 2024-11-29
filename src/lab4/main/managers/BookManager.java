package lab4.main.managers;

import java.util.ArrayList;

import lab4.main.items.Book;
import lab4.main.items.Item;
import lab4.main.validators.Validator;

public class BookManager implements ItemManager {
    private ArrayList<Item> listBooks;

    public BookManager() {
        this.listBooks = new ArrayList<Item>();
    }

    public ArrayList<Item> addItem(String name, int price, int quantity) {
        if (!Validator.isItemInList(listBooks, name, price)) {
            this.listBooks.add(new Book(name, price, quantity));
            return this.listBooks;
        }
        int index = Validator.indexItemByParameters(listBooks, name, price);
        listBooks.get(index).updateQuantity(quantity);
        return this.listBooks;
    }

    public ArrayList<Item> deleteItem(String name, int price, int quantity) {
        if (!Validator.isItemInList(listBooks, name, price)) {
            return this.listBooks;
        }
        int index = Validator.indexItemByParameters(listBooks, name, price);
        listBooks.get(index).updateQuantity(-quantity);
        listBooks.removeIf(item -> item.getQuantity() == 0);
        return this.listBooks;
    }

    public ArrayList<Item> getAllItems() {
        return this.listBooks;
    }
}
