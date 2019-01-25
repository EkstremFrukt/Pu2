package oppgave3_4;

import static java.awt.SystemColor.info;
import java.util.ArrayList;
import java.util.Arrays;

public class Animal {
    String type;
    int[] info;
    

    public Animal () {}

    public Animal(Animal source) {
        this.type = source.type;
        int a = info.length;
                

    }

    @Override
    public String toString() {
        return "Type of animal: " + type + Arrays.toString(info);
    }
}
