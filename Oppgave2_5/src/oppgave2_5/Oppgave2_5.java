package oppgave2_5;

public class Oppgave2_5 {

public static void main(String[] args) {
        int a = 3;
        int b = 4;

        try {
            InvalidInputException.gcd(a, b);
            System.out.println(InvalidInputException.gcd(a, b));
        }
        catch(InvalidInputException e){
            System.err.println(e.getMessage());
        }
    }   
}
