package lab3.main;

public class AgedBrie extends Item {
    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public int updateQuality() {
        if (sellIn > 0) {
            return QualityValidator.validateNotMoreThan50Quality(++quality);
        }
        return QualityValidator.validateNotMoreThan50Quality(quality + 2);
    }
}
