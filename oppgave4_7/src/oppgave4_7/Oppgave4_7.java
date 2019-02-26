package oppgave4_7;

import java.awt.Image;

public class Oppgave4_7 {
    
   public static int[] gradientRedBlue(int x, int y) {
        int[] grad = new int[3];
        grad[0] = (int) (x%256.0);
        grad[1] = (int) (y%256.0);
        return grad;
    }

    public static void main (String[] args) {
       Image image = new Image(400, 400) {};

       image.drawPixels(Oppgave4_7::gradientRedBlue);

       image.writeImageToFile("src/ukesoppgaver/alternative/stiler/oppgave7/gradientimage", "png");
    }
}

    
    
}
