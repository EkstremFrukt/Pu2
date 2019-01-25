package oppgave3_4;

import static java.awt.SystemColor.info;
import java.util.ArrayList;
import java.util.Arrays;

public class Animal {
    String type;
    int[] info;
    

    public Animal () {}

    public Animal(Animal source) {
        info[] kopi = new info[source.length];
        this.type = source.type;
        this.info = new ArrayList<Info>();
    }

    @Override
    public String toString() {
        return "Type of animal: " + type + Arrays.toString(info);
    }

    Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
