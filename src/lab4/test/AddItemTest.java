package lab4.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import lab4.main.managers.*;
import lab4.main.items.*;
import java.util.ArrayList;

public class AddItemTest {
    ItemManager Manager;

    @BeforeEach
    public void setUp() {
        Manager = new FoodManager();
    }

    @Test
    public void whenArrayIsEmpty_thenCorrectSizeAfterAddingItem() {
        ItemFactory.addObject(Manager, "apple", 20, 15);
        ArrayList<Item> items = Manager.getAllItems();
        assertEquals(1, items.size());
    }

    @Test
    public void whenArrayIsEmpty_thenCorrectItemIsAdded() {
        ItemFactory.addObject(Manager, "apple", 20, 15);
        ArrayList<Item> items = Manager.getAllItems();
        Item example = items.get(0);
        assertEquals("apple", example.getName());
        assertEquals(20, example.getPrice());
        assertEquals(15, example.getQuantity());
    }

    @Test
    public void whenArrayIsNotEmpty_thenCorrectSizeAfterAddingItem() {
        ItemFactory.addObject(Manager, "apple", 20, 15);
        ItemFactory.addObject(Manager, "banana", 25, 32);
        ArrayList<Item> items = Manager.getAllItems();
        assertEquals(2, items.size());
    }

    @Test
    public void whenArrayIsNotEmpty_thenCorrectItemIsAdded() {
        ItemFactory.addObject(Manager, "apple", 20, 15);
        ItemFactory.addObject(Manager, "banana", 25, 32);
        ArrayList<Item> items = Manager.getAllItems();
        Item example = items.get(1);
        assertEquals("banana", example.getName());
        assertEquals(25, example.getPrice());
        assertEquals(32, example.getQuantity());
    }

    @Test
    public void whenAddingItemWithSameParameters_thenSizeIsNotUpdated() {
        ItemFactory.addObject(Manager, "apple", 20, 15);
        ItemFactory.addObject(Manager, "apple", 20, 32);
        ArrayList<Item> items = Manager.getAllItems();
        assertEquals(1, items.size());
    }

    @Test
    public void whenAddingItemWithSameParameters_thenQuantityIsUpdated() {
        ItemFactory.addObject(Manager, "apple", 20, 15);
        ItemFactory.addObject(Manager, "apple", 20, 32);
        ArrayList<Item> items = Manager.getAllItems();
        Item example = items.get(0);
        assertEquals(47, example.getQuantity());
    }

    @Test
    public void whenAddingItemWithDifferentName_thenSizeIsUpdated() {
        ItemFactory.addObject(Manager, "apple", 20, 15);
        ItemFactory.addObject(Manager, "banana", 20, 32);
        ArrayList<Item> items = Manager.getAllItems();
        assertEquals(2, items.size());
    }

    @Test
    public void whenAddingItemWithDifferentPrice_thenSizeIsUpdated() {
        ItemFactory.addObject(Manager, "apple", 20, 15);
        ItemFactory.addObject(Manager, "apple", 25, 32);
        ArrayList<Item> items = Manager.getAllItems();
        assertEquals(2, items.size());
    }

    @Test
    public void whenAddingItemWithDefectName_thenQuantityIsUpdated() {
        ItemFactory.addObject(Manager, "apple", 20, 15);
        ItemFactory.addObject(Manager, "     APPLE      ", 20, 32);
        ArrayList<Item> items = Manager.getAllItems();
        Item example = items.get(0);
        assertEquals(47, example.getQuantity());
    }
}
