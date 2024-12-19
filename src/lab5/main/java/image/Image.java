package lab5.main.java.image;

public class Image {
    private String name;
    private int width;
    private int height;
    private double sizeMemory;
    private boolean isCompressed;

    public Image(String name, int width, int height, double sizeMemory) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.sizeMemory = sizeMemory;
        this.isCompressed = false;
    }

    public String getName() {
        return this.name;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public double getSizeMemory() {
        return this.sizeMemory;
    }

    public boolean isImageCompressed() {
        return this.isCompressed;
    }

    public double setNewSizeMemory(double newSize) {
        this.sizeMemory = newSize;
        return newSize;
    }

    public boolean setNewCompressingStatus(boolean isCompressed) {
        this.isCompressed = isCompressed;
        return isCompressed;
    }
}
