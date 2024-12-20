package lab5.main.java.helper;

import lab5.main.java.image.*;
import lab5.main.java.compression.*;
import lab5.main.java.decorator.*;

public class GraphicEditor {
    public static void main(String[] args) {
        // Example 1: Lossless Compression
        System.out.println("\nExample 1: Lossless Compression");
        GraphicFile file1 = new Image("example1", 960, 1080, 1.5);
        Compression compression1 = new LosslessCompression();
        ContextCompression context1 = new ContextCompression(compression1);
        context1.executeCompression(file1);
        System.out.println("Size of image in memory after lossless compression: " + file1.getSizeMemory());
        
        // Example 2: Lossy Compression
        System.out.println("\nExample 2: Lossy Compression");
        GraphicFile file2 = new Image("example2", 960, 1080, 1.5);
        Compression compression2 = new LossyCompression();
        ContextCompression context2 = new ContextCompression(compression2);
        context2.executeCompression(file2);
        System.out.println("Size of image in memory after lossy compression: " + file2.getSizeMemory());

        // Example 3: Resizing
        System.out.println("\nExample 3: Resizing");
        GraphicFile file3 = new Image("example3", 960, 1080, 1.5);
        file3 = new SizeDecorator(file3, 900, 100);
        System.out.println("Size of image after resizing: " + file3.getWidth() + " x " + file3.getHeight());

        // Example 4: WaterMarking
        System.out.println("\nExample 4: WaterMarking");
        GraphicFile file4 = new Image("example4", 960, 1080, 1.5);
        file4 = new WaterMarkDecorator(file4, "WaterMark1");
        System.out.println("New WaterMark on the image: " + file4.getWaterMark());

        // Example 5: Combining
        System.out.println("\nExample 5: Combining");
        GraphicFile file5 = new Image("example5", 960, 1080, 2);
        Compression compression3 = new LosslessCompression();
        Compression compression4 = new LossyCompression();
        ContextCompression context3 = new ContextCompression(compression3);
        context3.setTypeCompression(compression4);
        context3.executeCompression(file5);
        file5 = new SizeDecorator(file5, 800, 150);
        file5 = new WaterMarkDecorator(file5, "WaterMark2");
        System.out.println("Size of image in memory after lossless compression: " + file5.getSizeMemory());
        System.out.println("Size of image after combining: " + file5.getWidth() + " x " + file5.getHeight());
        System.out.println("New WaterMark on the image: " + file5.getWaterMark());
    }
}
