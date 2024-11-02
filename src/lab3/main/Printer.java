package lab3.main;

public class Printer {
    public static void printItems(Item[] items, int dayNumber) {
        System.out.println("-------- day " + dayNumber + " --------");
        System.out.println("name, sellIn, quality");
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println();
    }
}
