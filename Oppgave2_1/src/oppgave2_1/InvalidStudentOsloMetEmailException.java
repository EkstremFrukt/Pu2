package oppgave2_1;

public class InvalidStudentOsloMetEmailException extends InvalidOsloMetEmailException{
    public InvalidStudentOsloMetEmailException(String msg) {
        super(msg);
    }
    
    public static String studentNumberCheck(String studentStr) throws InvalidEmailException {
        if (studentStr.length() != 7 || studentStr.charAt(0) != 's') {
            throw new InvalidEmailException("Feil i studentnummer");
        }
        else return "Ok studentnummer";
    }
    
    public static String negativeCheck(int number) throws InvalidEmailException {
        if (number > 0) {
            return "ok, alle tall positive";
        }
        else throw new InvalidEmailException("Ingen tall kan være negative");
    }
}
