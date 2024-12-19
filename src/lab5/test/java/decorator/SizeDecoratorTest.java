package lab5.test.java.decorator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import lab5.main.java.image.*;
import lab5.main.java.decorator.*;

public class SizeDecoratorTest {
    @Test
    public void whenSizeImageIsUpdated_thenSizeIsUpdated() {
        GraphicFile image1 = new Image("photo1", 960, 1080, 1);
        image1 = new SizeDecorator(image1, 900, 1000);
        assertEquals(900, image1.getWidth());
        assertEquals(1000, image1.getHeight());
    }
}
