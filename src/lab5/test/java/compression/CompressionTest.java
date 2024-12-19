package lab5.test.java.compression;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import lab5.main.java.image.*;
import lab5.main.java.compression.*;

public class CompressionTest {
    @Test
    public void whenUsingLosslessCompression_thenSizeDecreasingBy50Percents() {
        Image image1 = new Image("photo1", 960, 1080, 1);
        Compression compression1 = new LosslessCompression();
        assertEquals(0.5, compression1.executeCompressing(image1));
    }

    @Test
    public void whenUsingLossyCompression_thenSizeDecreasingBy80percents() {
        Image image1 = new Image("photo1", 960, 1080, 1);
        Compression compression1 = new LossyCompression();
        assertEquals(0.2, compression1.executeCompressing(image1));
    }
}
