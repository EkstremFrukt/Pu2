package oppgave2_5;

public class InvalidInputException extends Exception{
    public InvalidInputException(String msg) {
        super(msg);
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
