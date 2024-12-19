package lab5.main.java.compression;

import lab5.main.java.image.*;

public class LossyCompression implements Compression {
    @Override
    public double executeCompressing(Image image) {
        double sizeMemory = image.getSizeMemory();
        return sizeMemory * 0.2;
    }

}
