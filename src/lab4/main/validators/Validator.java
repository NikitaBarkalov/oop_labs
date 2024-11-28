package lab4.main.validators;

import java.util.ArrayList;

import lab4.main.items.Item;

public class Validator {
    public static String validateString(String string) {
        string = string.trim();
        return string.toLowerCase();
    }

    public static boolean isNamesAreEquals(String name1, String name2) {
        name1 = validateString(name1);
        name2 = validateString(name2);
        return name1.equals(name2);
    }

    public static boolean isItemInList(ArrayList<Item> items, String mask, int price) {
        boolean result = false;
        if (items.size() == 0) {
            return result;
        }
        int index = 0;
        while (!result && index < items.size()) {
            Item item = items.get(index);
            result = isNamesAreEquals(item.getName(), mask);
            result &= item.getPrice() == price;
            ++index;
        }
        return result;
    }

    public static int indexItemByParameters(ArrayList<Item> items, String name, int price) {
        boolean compareResult = false;
        int index = -1;
        do {
            ++index;
            compareResult = isNamesAreEquals(items.get(index).getName(), name);
            compareResult &= (items.get(index).getPrice() == price);
        } while (!compareResult);
        return index;
    }
}
