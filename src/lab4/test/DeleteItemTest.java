package lab4.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import lab4.main.managers.*;
import lab4.main.items.*;
import java.util.ArrayList;

public class DeleteItemTest {
    ItemManager Manager;

    @BeforeEach
    public void setUp() {
        Manager = new DrinkManager();
    }

    @Test
    public void whenArrayIsEmpty_thenDeletingIsNotImpossible() {
        ItemDeleter.deleteObject(Manager, "apple", 20, 15);
        ArrayList<Item> items = Manager.getAllItems();
        assertEquals(0, items.size());
    }

    @Test
    public void whenArrayIsNotEmply_thenDeletingUnrealItemIsNotImpossible() {
        ItemFactory.addObject(Manager, "apple", 20, 15);
        ItemDeleter.deleteObject(Manager, "banana", 20, 15);
        ArrayList<Item> items = Manager.getAllItems();
        assertEquals(1, items.size());
    }

    @Test
    public void whenDeletingAnItem_thenSizeIsUpdated() {
        ItemFactory.addObject(Manager, "apple", 20, 15);
        ItemDeleter.deleteObject(Manager, "apple", 20, 15);
        ArrayList<Item> items = Manager.getAllItems();
        assertEquals(0, items.size());
    }

    @Test
    public void whenDeletingAnItem_thenCorrectItemIsDeleted() {
        ItemFactory.addObject(Manager, "apple", 20, 15);
        ItemFactory.addObject(Manager, "banana", 32, 25);
        ItemDeleter.deleteObject(Manager, "apple", 20, 15);
        ArrayList<Item> items = Manager.getAllItems();
        Item example = items.get(0);
        assertEquals("banana", example.getName());
        assertEquals(32, example.getPrice());
        assertEquals(25, example.getQuantity());
    }

    @Test
    public void whenDeletingAnItem_thenQuantityIsUpdated() {
        ItemFactory.addObject(Manager, "apple", 20, 15);
        ItemDeleter.deleteObject(Manager, "apple", 20, 10);
        ArrayList<Item> items = Manager.getAllItems();
        Item example = items.get(0);
        assertEquals(5, example.getQuantity());
    }

    @Test
    public void whenDeletingItemWithDifferentName_thenQuantityIsNotUpdated() {
        ItemFactory.addObject(Manager, "apple", 20, 15);
        ItemFactory.addObject(Manager, "banana", 20, 10);
        ItemDeleter.deleteObject(Manager, "banana", 20, 5);
        ArrayList<Item> items = Manager.getAllItems();
        Item example = items.get(0);
        assertEquals(15, example.getQuantity());
    }

    @Test
    public void whenDeletingItemWithDifferentPrice_thenQuantityIsNotUpdated() {
        ItemFactory.addObject(Manager, "apple", 20, 15);
        ItemFactory.addObject(Manager, "apple", 15, 10);
        ItemDeleter.deleteObject(Manager, "apple", 15, 5);
        ArrayList<Item> items = Manager.getAllItems();
        Item example = items.get(0);
        assertEquals(15, example.getQuantity());
    }

    @Test
    public void whenDeletingItem_thenItemDeletedIfQuantityIsLessThenZero() {
        ItemFactory.addObject(Manager, "apple", 20, 15);
        ItemDeleter.deleteObject(Manager, "apple", 20, 20);
        ArrayList<Item> items = Manager.getAllItems();
        assertEquals(0, items.size());
    }
}
