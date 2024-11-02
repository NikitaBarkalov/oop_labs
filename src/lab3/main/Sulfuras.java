package lab3.main;

public class Sulfuras extends Item {
    public Sulfuras(int sellIn) {
        super("Sulfuras, Hand of Ragnaros", sellIn, 80);
    }

    @Override
    public int updateQuality() {
        return quality;
    }

    @Override
    public int updateSellIn() {
        return sellIn;
    }

    @Override
    public void updateParameters() {
        return;
    }
}
