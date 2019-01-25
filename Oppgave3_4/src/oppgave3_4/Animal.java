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
        int a = source.info.length;
        this.info = new int[a];
            
        for (int i = 0; i < a; i++) {
            this.info[i] = source.info[i];
        }            
    }

    @Override
    public String toString() {
        return "Type of animal: " + type + " " + Arrays.toString(info);
    }
}
