package lab5.main.java.decorator;

import lab5.main.java.image.*;

public class EffectDecorator implements GraphicFile {
    protected GraphicFile wrappedImage;

    public EffectDecorator(GraphicFile wrappedImage) {
        this.wrappedImage = wrappedImage;
    }

    @Override
    public String getName() {
        return wrappedImage.getName();
    }

    @Override
    public int getWidth() {
        return wrappedImage.getWidth();
    }

    @Override
    public int getHeight() {
        return wrappedImage.getHeight();
    }

    @Override
    public double getSizeMemory() {
        return wrappedImage.getSizeMemory();
    }

    @Override
    public boolean isFileCompressed() {
        return wrappedImage.isFileCompressed();
    }

    @Override
    public double setNewSizeMemory(double newSize) {
        return wrappedImage.setNewSizeMemory(newSize);
    }

    @Override
    public boolean setNewCompressingStatus(boolean newStatus) {
        return wrappedImage.setNewCompressingStatus(newStatus);
    }

    @Override
    public int setWidth(int newWidth) {
        return wrappedImage.setWidth(newWidth);
    }

    @Override
    public int setHeight(int newHeight) {
        return wrappedImage.setHeight(newHeight);
    }

    @Override
    public String getWaterMark() {
        return wrappedImage.getWaterMark();
    }

    @Override
    public boolean isFileWaterMarked() {
        return wrappedImage.isFileWaterMarked();
    }

    @Override
    public String setWaterMark(String newWaterMark) {
        return wrappedImage.setWaterMark(newWaterMark);
    }
}
