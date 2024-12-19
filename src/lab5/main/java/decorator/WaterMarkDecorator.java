package lab5.main.java.decorator;

import lab5.main.java.image.*;

public class WaterMarkDecorator extends EffectDecorator{
    private String newWaterMark;
    public WaterMarkDecorator(GraphicFile wrappedImage, String newWaterMark) {
        super(wrappedImage);
        this.newWaterMark = newWaterMark;
    }

    @Override
    public String getWaterMark() {
        GraphicFile updatedFile = updateWaterMark(this.newWaterMark);
        return updatedFile.getWaterMark();
    }

    private GraphicFile updateWaterMark(String newWaterMark) {
        this.wrappedImage.setWaterMark(newWaterMark);
        return this.wrappedImage;
    }
}
