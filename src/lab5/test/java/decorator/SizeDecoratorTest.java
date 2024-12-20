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

    @Test
    public void whenWidthIsNotPositive_thenWidthIsNotUpdated() {
        GraphicFile image1 = new Image("photo1", 960, 1080, 1);

        image1 = new SizeDecorator(image1, -900, 1000);

        assertEquals(960, image1.getWidth());
        assertEquals(1000, image1.getHeight());
    }

    @Test
    public void whenHeightIsNotPositive_thenHeightIsNotUpdated() {
        GraphicFile image1 = new Image("photo1", 960, 1080, 1);

        image1 = new SizeDecorator(image1, 900, -1000);

        assertEquals(900, image1.getWidth());
        assertEquals(1080, image1.getHeight());
    }

    @Test
    public void whenWidthAndHeightIsNotPositive_thenSizeIsNotUpdated() {
        GraphicFile image1 = new Image("photo1", 960, 1080, 1);

        image1 = new SizeDecorator(image1, -900, -1000);

        assertEquals(960, image1.getWidth());
        assertEquals(1080, image1.getHeight());
    }

    @Test
    public void whenHeightIsZero_thenHeightIsNotUpdated() {
        GraphicFile image1 = new Image("photo1", 960, 1080, 1);

        image1 = new SizeDecorator(image1, 900, 0);

        assertEquals(900, image1.getWidth());
        assertEquals(1080, image1.getHeight());
    }

    @Test
    public void whenWidthIsZero_thenHeightIsNotUpdated() {
        GraphicFile image1 = new Image("photo1", 960, 1080, 1);

        image1 = new SizeDecorator(image1, 0, 1000);

        assertEquals(960, image1.getWidth());
        assertEquals(1000, image1.getHeight());
    }

    @Test
    public void whenBothWidthAndHeightAreZero_thenSizeIsNotUpdated() {
        GraphicFile image1 = new Image("photo1", 960, 1080, 1);

        image1 = new SizeDecorator(image1, 0, 0);
        
        assertEquals(960, image1.getWidth());
        assertEquals(1080, image1.getHeight());
    }
}
