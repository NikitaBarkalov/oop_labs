package lab5.main.java.compression;

import lab5.main.java.image.Image;

public class LosslessCompression implements Compression {
    @Override
    public double executeCompressing(Image image) {
        double sizeMemory = image.getSizeMemory();
        return sizeMemory * 0.5;
    }
}
