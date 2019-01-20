package oppgave2_1;

public class Oppgave2_1 {

    public static void main(String[] args) {
        String email1 = "s123456@hioa.no";
        String email2 = "s123456@oslomet.no";
        String email3 = "henrik.lieng@oslomet.no";
        String email4 = "so_bad!@oslomet.no";
        String email5 = "thisIsNoEMail";
        String email6 = "s232323@oslomet@.no";

        checkMail(email1);
        checkMail(email2);
        checkMail(email3);
        checkMail(email4);
        checkMail(email5);
        checkMail(email6);
        String[] test = email6.split("@");
        System.out.println(test.length);
        
        
    }
    
    
public static int checkValidOsloMetMail(String email) {
    
    String[] splitStrAlpha = email.split("@");
    
    // Sjekker om det bare er 1 @ i mailen.
    if (splitStrAlpha.length != 2)
        return -1; // ERROR CODE 1: string is not a valid email
    
    // Sjekker om stringen etter splitten på @ er en oslomet.no mail.
    if(!splitStrAlpha[1].equals("oslomet.no")) {
        return -2; // ERROR CODE 2: string is not a valid OsloMet email
    }

    // Sjekker om første bokstav er s og resten før @ er av lengden på 7 tegn.
    String studentStr = splitStrAlpha[0];
    if(studentStr.length() != 7 || studentStr.charAt(0) != 's') {
        return -3; // ERROR CODE 3: email is not a valid student OsloMet email
    }

    // check if the six numbers behind "s" are valid numbers
    try {
        int testInt = Integer.parseInt(studentStr.substring(1));
        if(testInt < 0)
            return -3; // no negative numbers in student numbers
    } catch(NumberFormatException e) {
        return -3;
    }

    return 0; // email is valid

}

public static void checkMail(String email) {
    int testMail = checkValidOsloMetMail(email);

    if(testMail == -1) {
            System.err.println(email + " is not a valid email");
    } else if (testMail == -2) {
            System.err.println(email + " is not a valid OsloMet email");
    } else if (testMail == -3) {
            System.err.println(email + " is not a valid OsloMet student email");
    }
    else {
        System.out.println("Hello student with id " + email.split("@")[0]);
        }
    }       
}
    

