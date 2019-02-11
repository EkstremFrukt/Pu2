package oppgave4_1;

import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Oppgave4_1 {

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> heltallsliste = new ArrayList<>();
        heltallsliste.add(1);
        heltallsliste.add(2);
        heltallsliste.add(3);
        System.out.println(heltallsliste);
        
        Callable<Integer> test = () -> 4;
        System.out.println(test.toString());

    }  

}
