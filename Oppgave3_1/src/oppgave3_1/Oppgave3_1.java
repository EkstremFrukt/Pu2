package oppgave3_1;

public class Oppgave3_1 {

    public static void main(String[] args) {
        A one = new A();
        A two = (A) one.clone();
        
        
        
        two.tall++;
        
        System.out.println(one);
        System.out.println(two);
    }
    
}
