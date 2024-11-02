package lab3.main;

public class QualityValidator {
    public static int validateNotNegativeQuality(int quality) {
        if (quality < 0) {
            return 0;
        }
        return quality;
    }

    public static int validateNotMoreThan50Quality(int quality) {
        if (quality > 50) {
            return 50;
        }
        return quality;
    }
}
