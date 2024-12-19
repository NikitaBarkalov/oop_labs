package lab5.main.java.compression;

import lab5.main.java.image.Image;

public class LosslessCompression implements Compression {
    @Override
    public double executeCompressing(Image image) {
        double sizeMemory = image.getSizeMemory();
        if (image.isImageCompressed()) {
            return sizeMemory;
        }
        image.setNewCompressingStatus(true);
        return sizeMemory * 0.5;
    }
}
