package oppgave3_1;

public class A implements Cloneable {
    int tall = 3;
    
    @Override
    public A clone() {
        try {
            A a = (A) super.clone();
            
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String toString() {
        return "Tall: " + tall;
    }   
}
