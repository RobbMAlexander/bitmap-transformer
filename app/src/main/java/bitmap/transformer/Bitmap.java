/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bitmap.transformer;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bitmap {
    public void main(String[] args) {

        BufferedImage readBitmap = null;
        //String readPath = (args[0]);
        try {
            readBitmap = ImageIO.read(new File(args[0]));
        } catch (IOException ioe) {
            System.err.println("failed to read");
        }
        System.out.println("Are we here?");
        //BufferedImage bitMapToWrite = new BufferedImage(readBitmap.getWidth(), readBitmap.getHeight(), BufferedImage.TYPE_INT_RGB);


        int bitmapWidth = readBitmap.getWidth();
        int bitmapHeight = readBitmap.getHeight();

//        System.out.println(describeContents(readBitmap));
        //    Bitmap testBitmap = new Bitmap();

        // int transformedPixel = readBitmap.getRGB(x,y);

        // Conditionals for cmd line args per transform?
        // if (arg[2] == ) { }

        for (int x = 0; x < bitmapWidth; x++) {
            for (int y = 0; y < bitmapHeight; y++) {

                int transformedColor =
                        (
                                255255255
                        );
                readBitmap.setRGB(x, y, transformedColor);
            }
        }
        // Color class!


        // img.getRGB(x, y);
        //
        // for
        // int pixelColor = readBitmap.getRGB()
        //
        //
        //
        //
        File writePath = new File(args[1]);

        try {
            ImageIO.write(readBitmap, "bmp", writePath);
        } catch (IOException ioe) {
            System.err.println("failed to write");
        }
    }
}
