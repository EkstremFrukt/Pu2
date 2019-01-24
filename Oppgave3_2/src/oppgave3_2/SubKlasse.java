package oppgave3_2;

// SubKlasse.java
public class SubKlasse extends SuperKlasse implements Cloneable {
    int mittTall = 5;

    @Override
    public Object clone() {
        SubKlasse kopiert = new SubKlasse();
        kopiert.mittTall = mittTall;       
        return kopiert;
    }
    
    public String toString() {
        return "" + mittTall;
    }
}
