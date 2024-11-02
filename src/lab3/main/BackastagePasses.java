package lab3.main;

public class BackastagePasses extends Item {
    public BackastagePasses(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public int updateQuality() {
        quality = updateQualityWhenSellInMoreThan10();
        quality = updateQualityWhenSellInBetween5And10();
        quality = updateQualityWhenSellInBetween0And5();
        quality = updateQualityWhenSellInLessThan0();
        return quality;
    }

    private int updateQualityWhenSellInMoreThan10() {
        if (sellIn > 10) {
            return QualityValidator.validateQualityInCorrectRange(++quality);
        }
        return quality;
    }

    private int updateQualityWhenSellInBetween5And10() {
        if (sellIn > 5 && sellIn <= 10) {
            return QualityValidator.validateQualityInCorrectRange(quality + 2);
        }
        return quality;
    }

    private int updateQualityWhenSellInBetween0And5() {
        if (sellIn > 0 && sellIn <= 5) {
            return QualityValidator.validateQualityInCorrectRange(quality + 3);
        }
        return quality;
    }

    private int updateQualityWhenSellInLessThan0() {
        if (sellIn <= 0) {
            return 0;
        }
        return quality;
    }
}
