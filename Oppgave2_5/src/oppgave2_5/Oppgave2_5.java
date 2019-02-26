package oppgave2_5;

public class Oppgave2_5 {

public static void main(String[] args) {
        int a = 124;
        int b = 4;

        try {
            gcd(a, b);
            System.out.println(gcd(a, b));
        }
        catch(InvalidInputException e){
            System.err.println(e.getMessage());
        }
    }
    public static int gcd(int a, int b) throws InvalidInputException{
        if (a < 0 || b < 0) {
            throw new InvalidInputException("Ingen av tallene kan være negative");
        }
        while( a != b ) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        assert(checkDivision(a,b));    
        return a;
    }  
    
    public static boolean checkDivision(int a, int b) {
        return a % b == 0;
    }
}
