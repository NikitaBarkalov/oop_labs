package lab3.main.items;

public class Sulfuras extends Item {
    public Sulfuras(int sellIn) {
        super("Sulfuras, Hand of Ragnaros", sellIn, 80);
    }

    @Override
    public int updateQuality() {
        // do nothing because it's a legendary item
        return quality;
    }

    @Override
    public int updateSellIn() {
        // do nothing because it's a legendary item
        return sellIn;
    }

    @Override
    public void updateParameters() {
        // do nothing because it's a legendary item
        return;
    }
}
