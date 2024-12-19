package lab5.main.java.compression;

import lab5.main.java.image.Image;

public class LosslessCompression implements Compression {
    @Override
    public Image executeCompressing(Image image) {
        double sizeMemory = image.getSizeMemory();
        if (image.isImageCompressed()) {
            return image;
        }
        image.setNewCompressingStatus(true);
        image.setNewSizeMemory(sizeMemory * 0.5);
        return image;
    }
}
