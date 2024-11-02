package lab3.main;

public class ConjuredManaCake extends Item {
    public ConjuredManaCake(int sellIn, int quality) {
        super("Conjured Mana Cake", sellIn, quality);
    }

    @Override
    public int updateQuality() {
        if (sellIn > 0) {
            return QualityValidator.validateNotNegativeQuality(quality - 2);
        }
        return QualityValidator.validateNotNegativeQuality(quality - 4);
    }
}
