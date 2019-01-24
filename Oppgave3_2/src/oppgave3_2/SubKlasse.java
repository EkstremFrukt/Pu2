package oppgave3_2;

// SubKlasse.java
public class SubKlasse extends SuperKlasse implements Cloneable {
    int mittTall = 5;

    @Override
    public Object clone() throws CloneNotSupportedException {
        SubKlasse kopiert = new SubKlasse();
        kopiert.mittTall = (int) super.clone();       
        return kopiert;
    }
    
    public String toString() {
        return "" + mittTall;
    }
}
