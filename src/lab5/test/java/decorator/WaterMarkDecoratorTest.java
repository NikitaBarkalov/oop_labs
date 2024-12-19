package lab5.test.java.decorator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import lab5.main.java.image.*;
import lab5.main.java.decorator.*;

public class WaterMarkDecoratorTest {
    @Test
    public void whenFileIsWaterMarked_thenWaterMarkIsCorrectChanged() {
        GraphicFile image1 = new Image("photo1", 960, 1080, 1);
        image1 = new WaterMarkDecorator(image1, "Label1");
        assertEquals("Label1", image1.getWaterMark());
    }
}
