package lab3.main.items;

import lab3.main.additionalFeatures.QualityValidator;

public class AgedBrie extends Item {
    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public int updateQuality() {
        if (sellIn > 0) {
            return QualityValidator.validateQualityInCorrectRange(++quality);
        }
        return QualityValidator.validateQualityInCorrectRange(quality + 2);
    }
}
