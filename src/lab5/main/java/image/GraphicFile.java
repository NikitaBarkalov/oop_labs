package lab5.main.java.image;

public interface GraphicFile {
    public String getName();
    public int getWidth();
    public int getHeight();
    public double getSizeMemory();
    public boolean isImageCompressed();
    public double setNewSizeMemory(double newSize);
    public boolean setNewCompressingStatus(boolean newStatus);
    public int setWidth(int newWidth);
    public int setHeight(int newHeight);
}
