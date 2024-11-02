package lab3.main;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public int updateQuality() {
        if (sellIn > 0) {
            return QualityValidator.validateNotNegativeQuality(--quality);
        }
        return QualityValidator.validateNotNegativeQuality(quality - 2);
    }

    public int updateSellIn() {
        return --sellIn;
    }

    public void updateParameters() {
        quality = updateQuality();
        sellIn = updateSellIn();
    }

    @Override
    public String toString() {
        return name + ", " + sellIn + ", " + quality;
    }
}
