package lab5.main.java.image;

public class Image {
    private String name;
    private int width;
    private int height;
    private double sizeMemory;

    public Image(String name, int width, int height, double sizeMemory) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.sizeMemory = sizeMemory;
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
}
