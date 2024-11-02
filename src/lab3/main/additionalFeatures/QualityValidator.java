package lab3.main.additionalFeatures;

public class QualityValidator {
    private static int validateNotNegativeQuality(int quality) {
        if (quality < 0) {
            return 0;
        }
        return quality;
    }

    private static int validateNotMoreThan50Quality(int quality) {
        if (quality > 50) {
            return 50;
        }
        return quality;
    }

    public static int validateQualityInCorrectRange(int quality) {
        quality = validateNotNegativeQuality(quality);
        quality = validateNotMoreThan50Quality(quality);
        return quality;
    }
}
