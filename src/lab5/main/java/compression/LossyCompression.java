package lab5.main.java.compression;

import lab5.main.java.image.*;

public class LossyCompression implements Compression {
    @Override
    public GraphicFile executeCompressing(GraphicFile image) {
        double sizeMemory = image.getSizeMemory();
        if (image.isFileCompressed()) {
            return image;
        }
        image.setNewCompressingStatus(true);
        image.setNewSizeMemory(sizeMemory * 0.2);
        return image;
    }

}
