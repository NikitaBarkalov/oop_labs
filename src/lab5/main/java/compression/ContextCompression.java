package lab5.main.java.compression;

import lab5.main.java.image.*;

public class ContextCompression {
    private Compression typeCompression;

    public ContextCompression(Compression typeCompression) {
        this.typeCompression = typeCompression;
    }

    public Compression setTypeCompression(Compression typeCompression) {
        this.typeCompression = typeCompression;
        return typeCompression;
    }

    public Image executeCompression(Image image) {
        return typeCompression.executeCompressing(image);
    }
}
