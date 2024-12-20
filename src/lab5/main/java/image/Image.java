package lab5.main.java.image;

public class Image implements GraphicFile {
    private String name;
    private int width;
    private int height;
    private double sizeMemory;
    private boolean isCompressed;
    private String watermark;
    private boolean isWaterMarked;

    public Image(String name, int width, int height, double sizeMemory) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.sizeMemory = sizeMemory;
        this.isCompressed = false;
        this.isWaterMarked = false;
        this.watermark = null;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public double getSizeMemory() {
        return this.sizeMemory;
    }

    @Override
    public boolean isFileCompressed() {
        return this.isCompressed;
    }

    @Override
    public double setNewSizeMemory(double newSize) {
        this.sizeMemory = newSize;
        return newSize;
    }

    @Override
    public boolean setNewCompressingStatus(boolean isCompressed) {
        this.isCompressed = isCompressed;
        return isCompressed;
    }

    @Override
    public int setWidth(int newWidth) {
        this.width = newWidth;
        return newWidth;
    }

    @Override
    public int setHeight(int newHeight) {
        this.height = newHeight;
        return newHeight;
    }

    @Override
    public String getWaterMark() {
        return this.watermark;
    }

    @Override
    public boolean isFileWaterMarked() {
        return this.isWaterMarked;
    }

    @Override
    public String setWaterMark(String watermark) {
        this.watermark = watermark;
        return watermark;
    }
}
