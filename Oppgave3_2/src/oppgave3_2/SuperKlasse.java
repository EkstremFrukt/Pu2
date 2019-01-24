package oppgave3_2;

// SuperKlasse.Java:
public class SuperKlasse implements Cloneable {
    int superTall = 5;
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        SuperKlasse kopiert = new SuperKlasse();
        kopiert.superTall = (int) super.clone();      
        return kopiert;
    }
    
    public String toString() {
        return ("" + superTall);
    }
    
}
