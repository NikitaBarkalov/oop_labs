package lab3.test;

import lab3.main.*;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        // test items for *MANUAL* testing code while refactoring
        Item[] items = new Item[] {                                        // after one day expected:
                new Item("+5 Dexterity Vest", 10, 20), // sellIn 9, quality 19 
                new Item("+6 Dexterity Vest", 0, 5),   // sellIn -1, quality 3
                new Item("+7 Dexterity Vest", 1, 5),   // sellIn 0, quality 4
                new Item("+8 Dexterity Vest", 10, 0),  // sellIn 9, quality 0
                new Item("+9 Dexterity Vest", 0, 0),   // sellIn -1, quality 0
                new AgedBrie(10, 0),                        // sellIn 9, quality 1
                new AgedBrie(0, 49),                        // sellIn -1, quality 50
                new AgedBrie(0, 25),                        // sellIn -1, quality 27
                new AgedBrie(10, 50),                       // sellIn 9, quality 50
                new Sulfuras(1),                                    // sellIn 1, quality 80
                new Sulfuras(0),                                    // sellIn 0, quality 80
                new Sulfuras(-1),                                          // sellIn -1, quality 80
                new BackastagePasses(15, 20),               // sellIn 14, quality 21
                new BackastagePasses(15, 50),               // sellIn 14, quality 50
                new BackastagePasses(11, 40),               // sellIn 10, quality 41
                new BackastagePasses(10, 40),               // sellIn 9, quality 42
                new BackastagePasses(10, 49),               // sellIn 9, quality 50
                new BackastagePasses(6, 40),                // sellIn 5, quality 42
                new BackastagePasses(5, 40),                // sellIn 4, quality 43
                new BackastagePasses(5, 48),                // sellIn 4, quality 50
                new BackastagePasses(5, 49),                // sellIn 4, quality 50
                new BackastagePasses(1, 6),                 // sellIn 0, quality 9
                new BackastagePasses(0, 50),                // sellIn -1, quality 0
                // this conjured item does not work properly yet
                new ConjuredManaCake(10, 10),               // sellIn 9, quality 8
                new ConjuredManaCake(10, 1),                // sellIn 9, quality 0
                new ConjuredManaCake(1, 10),                // sellIn 0, quality 8
                new ConjuredManaCake(0, 10),                // sellIn -1, quality 6
                new ConjuredManaCake(0, 2)                  // sellIn -1, quality 0
            };

        GildedRose app = new GildedRose(items);

        int days = 2;
        for (int numberDay = 0; numberDay < days; numberDay++) {
            Printer.printItems(items, numberDay);
            app.updateQuality();
        }
    }

}
