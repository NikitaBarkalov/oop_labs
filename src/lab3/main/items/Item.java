package lab3.main.items;

import lab3.main.additionalFeatures.*;

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
            return QualityValidator.validateQualityInCorrectRange(--quality);
        }
        return QualityValidator.validateQualityInCorrectRange(quality - 2);
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
