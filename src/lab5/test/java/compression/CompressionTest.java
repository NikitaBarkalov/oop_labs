package lab5.test.java.compression;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import lab5.main.java.image.*;
import lab5.main.java.compression.*;

public class CompressionTest {
    @Test
    public void whenUsingLosslessCompression_thenSizeDecreasingBy50Percents() {
        GraphicFile image1 = new Image("photo1", 960, 1080, 1);

        Compression compression1 = new LosslessCompression();

        assertEquals(0.5, compression1.executeCompressing(image1).getSizeMemory());
    }

    @Test
    public void whenUsingLossyCompression_thenSizeDecreasingBy80percents() {
        GraphicFile image1 = new Image("photo1", 960, 1080, 1);

        Compression compression1 = new LossyCompression();

        assertEquals(0.2, compression1.executeCompressing(image1).getSizeMemory());
    }

    @Test
    public void whenImageAlreadyCompressedByLosslessCompression_thenLosslessCompressionIsNotChangedSizeMemory() {
        GraphicFile image1 = new Image("photo1", 960, 1080, 1);

        Compression compression1 = new LosslessCompression();
        compression1.executeCompressing(image1);
        Compression compression2 = new LosslessCompression();

        assertEquals(0.5, compression2.executeCompressing(image1).getSizeMemory());
    }

    @Test
    public void whenImageAlreadyCompressedByLossyCompression_thenLossyCompressionIsNotChangedSizeMemory() {
        GraphicFile image1 = new Image("photo1", 960, 1080, 1);

        Compression compression1 = new LossyCompression();
        compression1.executeCompressing(image1);
        Compression compression2 = new LossyCompression();

        assertEquals(0.2, compression2.executeCompressing(image1).getSizeMemory());
    }

    @Test
    public void whenImageAlreadyCompressedByLossyCompression_thenLosslessCompressionIsNotChangedSizeMemory() {
        GraphicFile image1 = new Image("photo1", 960, 1080, 1);

        Compression compression1 = new LossyCompression();
        compression1.executeCompressing(image1);
        Compression compression2 = new LosslessCompression();

        assertEquals(0.2, compression2.executeCompressing(image1).getSizeMemory());
    }

    @Test
    public void whenImageAlreadyCompressedByLosslessCompression_thenLossyCompressionIsNotChangedSizeMemory() {
        GraphicFile image1 = new Image("photo1", 960, 1080, 1);

        Compression compression1 = new LosslessCompression();
        compression1.executeCompressing(image1);
        Compression compression2 = new LossyCompression();
        
        assertEquals(0.5, compression2.executeCompressing(image1).getSizeMemory());
    }
}
