package oppgave3_2;

// SuperKlasse.Java:
public class SuperKlasse implements Cloneable {
    int superTall = 5;
    
    @Override
    public Object clone() {
        SuperKlasse kopiert = null;
        try {
            kopiert = (SuperKlasse) super.clone();
        } catch (CloneNotSupportedException  e) {
            e.printStackTrace();
            return null;
        }     
        return kopiert;
    }
    
    @Override
    public String toString() {
        return ("" + superTall);
    }  
}
