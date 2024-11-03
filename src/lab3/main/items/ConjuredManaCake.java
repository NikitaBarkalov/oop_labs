package lab3.main.items;

import lab3.main.additionalFeatures.QualityValidator;

public class ConjuredManaCake extends Item {
    public ConjuredManaCake(int sellIn, int quality) {
        super("Conjured Mana Cake", sellIn, quality);
    }

    @Override
    public int updateQuality() {
        if (sellIn > 0) {
            return QualityValidator.validateQualityInCorrectRange(quality - 2);
        }
        return QualityValidator.validateQualityInCorrectRange(quality - 4);
    }
}
