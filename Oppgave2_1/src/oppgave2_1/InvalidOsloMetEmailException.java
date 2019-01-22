package oppgave2_1;

public class InvalidOsloMetEmailException extends InvalidEmailException{
    public InvalidOsloMetEmailException(String msg) {
        super(msg);
    }
    
    public static String lastChecker(String secondPart) throws InvalidEmailException {
        if (!"oslomet.no".equals(secondPart)) {
            throw new InvalidEmailException("emailen må slutte på @oslomet.no");
        }
        else return "Ok, mailen er @oslomet.no";
    } 
}
