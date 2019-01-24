package oppgave3_2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Oppgave3_2 {

    public static void main(String[] args) {
        SuperKlasse super1 = new SuperKlasse();
        SuperKlasse super2 = null;

        super2 = (SuperKlasse) super1.clone();
     
        super2.superTall++;
        
        System.out.println("Tall 1 er: " + super1 + " Tall 2 er: " + super2);
        //Output: Tall 1 er: 5 Tall 2 er: 6
        
        SubKlasse sub1 = new SubKlasse();
        SubKlasse sub2 = null;

        sub2 = (SubKlasse) sub1.clone();
 
        sub2.mittTall++;
        
        System.out.println("Tall 1 er: " + sub1 + " Tall 2 er: " + sub2);
        //Output: Tall 1 er: 5 Tall 2 er: 6     

    }   
}
