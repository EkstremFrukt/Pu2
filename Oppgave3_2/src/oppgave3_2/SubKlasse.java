package oppgave3_2;

// SubKlasse.java
public class SubKlasse extends SuperKlasse implements Cloneable {
    int mittTall = 5;

    @Override
    public Object clone() {
        SubKlasse kopiert = null;
        kopiert = (SubKlasse) super.clone();     
        return kopiert;
    } 
    
    @Override
    public String toString() {
        return "" + mittTall;
    }
}
