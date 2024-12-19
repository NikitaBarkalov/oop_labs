package lab5.test.java.image;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import lab5.main.java.image.*;

public class ImageTest {
    @Test
    public void whenImageIsCreating_thenFieldsAreCorrect() {
        Image image1 = new Image("photo1", 960, 1080, 0.56);

        assertEquals("photo1", image1.getName());
        assertEquals(960, image1.getWidth());
        assertEquals(1080, image1.getHeight());
        assertEquals(0.56, image1.getSizeMemory());
    }
}
