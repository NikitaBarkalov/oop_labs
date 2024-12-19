package lab5.main.java.decorator;

import lab5.main.java.image.*;
import lab5.main.java.support.*;

public class SizeDecorator extends EffectDecorator {
    private int newWidth;
    private int newHeight;
    public SizeDecorator(GraphicFile wrappedImage, int newWidth, int newHeight) {
        super(wrappedImage);
        this.newWidth = newWidth;
        this.newHeight = newHeight;
    }

    @Override
    public int getWidth() {
        GraphicFile updatedFile = updateSize(newWidth, newHeight);
        return updatedFile.getWidth();
    }

    @Override
    public int getHeight() {
        GraphicFile updatedFile = updateSize(newWidth, newHeight);
        return updatedFile.getHeight();
    }

    private GraphicFile updateSize(int newWidth, int newHeight) {
        Validator integerValidator = new Validator();
        int newValidWidth = integerValidator.validateIntegerBySign(wrappedImage.getWidth(), newWidth);
        int newValidHeight = integerValidator.validateIntegerBySign(wrappedImage.getHeight(), newHeight);
        this.wrappedImage.setWidth(newValidWidth);
        this.wrappedImage.setHeight(newValidHeight);
        return this.wrappedImage;
    }
}
