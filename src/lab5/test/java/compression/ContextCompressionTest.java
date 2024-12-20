package lab5.test.java.compression;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import lab5.main.java.image.*;
import lab5.main.java.compression.*;

public class ContextCompressionTest {
    @Test
    public void whenUsingContextWithLosslessCompression_thenSizeDecreasingBy50Percents() {
        Image image1 = new Image("photo1", 960, 1080, 1);

        Compression compression1 = new LosslessCompression();
        ContextCompression context1 = new ContextCompression(compression1);

        assertEquals(0.5, context1.executeCompression(image1).getSizeMemory());
    }

    @Test
    public void whenUsingContextWithLossyCompression_thenSizeDecreasingBy80percents() {
        Image image1 = new Image("photo1", 960, 1080, 1);

        Compression compression1 = new LossyCompression();
        ContextCompression context1 = new ContextCompression(compression1);

        assertEquals(0.2, context1.executeCompression(image1).getSizeMemory());
    }

    @Test
    public void whenImageAlreadyCompressedByLosslessCompression_thenContextWithLosslessCompressionIsNotChangedSizeMemory() {
        Image image1 = new Image("photo1", 960, 1080, 1);

        Compression compression1 = new LosslessCompression();
        ContextCompression context1 = new ContextCompression(compression1);
        compression1.executeCompressing(image1);
        Compression compression2 = new LosslessCompression();
        context1.setTypeCompression(compression2);

        assertEquals(0.5, context1.executeCompression(image1).getSizeMemory());
    }

    @Test
    public void whenImageAlreadyCompressedByLossyCompression_thenContextWithLossyCompressionIsNotChangedSizeMemory() {
        Image image1 = new Image("photo1", 960, 1080, 1);

        Compression compression1 = new LossyCompression();
        ContextCompression context1 = new ContextCompression(compression1);
        compression1.executeCompressing(image1);
        Compression compression2 = new LossyCompression();
        context1.setTypeCompression(compression2);

        assertEquals(0.2, context1.executeCompression(image1).getSizeMemory());
    }

    @Test
    public void whenImageAlreadyCompressedByLosslessCompression_thenContextWithLossyCompressionIsNotChangedSizeMemory() {
        Image image1 = new Image("photo1", 960, 1080, 1);

        Compression compression1 = new LosslessCompression();
        ContextCompression context1 = new ContextCompression(compression1);
        compression1.executeCompressing(image1);
        Compression compression2 = new LossyCompression();
        context1.setTypeCompression(compression2);

        assertEquals(0.5, context1.executeCompression(image1).getSizeMemory());
    }

    @Test
    public void whenImageAlreadyCompressedByLossyCompression_thenContextWithLosslessCompressionIsNotChangedSizeMemory() {
        Image image1 = new Image("photo1", 960, 1080, 1);

        Compression compression1 = new LossyCompression();
        ContextCompression context1 = new ContextCompression(compression1);
        compression1.executeCompressing(image1);
        Compression compression2 = new LosslessCompression();
        context1.setTypeCompression(compression2);
        
        assertEquals(0.2, context1.executeCompression(image1).getSizeMemory());
    }
}
