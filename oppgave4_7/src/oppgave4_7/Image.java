
package oppgave4_7;


import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.function.BiFunction;
import javax.imageio.ImageIO;

public class Image extends BufferedImage {
    private static final int imgType = BufferedImage.TYPE_INT_RGB;

    public Image(int width, int height) {
        super(width, height, imgType);
    }

    public void drawPixels(BiFunction<Integer,Integer,int[]> drawPixelFunc) {
        for(int x = 0; x < getWidth(); x++) {
            for(int y = 0; y < getHeight(); y++) {
                int[] rgb = drawPixelFunc.apply(x, y);
                drawPixel(x, y, rgb);
            }
        }
    }

    private void drawPixel(int x, int y, int[] rgb) {
        setRGB(x, y, getIntColour(rgb));
    }

    private int getIntColour(int[] rgbColour) {
        Color color = new Color(rgbColour[0],rgbColour[1],rgbColour[2]);
        return color.getRGB();
    }

    public void writeImageToFile(String filePath, String fileFormat) {
        try {
            ImageIO.write(this, fileFormat, new File(filePath));
        } catch (IOException e) {
            System.err.println("Could not write the image file.");
        }
    }

}
