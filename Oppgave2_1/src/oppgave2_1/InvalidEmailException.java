package oppgave2_1;

public class InvalidEmailException extends Exception{
    public InvalidEmailException(String msg) {
        super(msg);
    }
    
    public static String atChecker(int length) throws InvalidEmailException {
        if (length != 2) {
            throw new InvalidEmailException("Det skal bare være en @");
        }
        else return "ok mengder @";
    }  
}
