package øving2_1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Øving2_1 {

    public static void main(String[] args) {

        try {
            String email1 = "s123456@hioa.no";
            String email2 = "s123456@oslomet.no";
            String email3 = "henrik.lieng@oslomet.no";
            String email4 = "so_bad!@oslomet.no";
            String email5 = "thisIsNoEMail";
            
            
            checkValidOsloMetMail(email1);
            checkValidOsloMetMail(email2);
            checkValidOsloMetMail(email3);
            checkValidOsloMetMail(email4);
            checkValidOsloMetMail(email5);
        } catch (InvalidEmailException ex) {
            System.err.println(ex.getMessage());
        }
        
        

        
        

 
    }
    public static int checkValidOsloMetMail (String email) throws InvalidEmailException{
    String[] splitStrAlpha = email.split("@");
    

    if (splitStrAlpha.length != 2) {
        throw new InvalidEmailException("Ingen av tallene kan være negative");
    }

    if(!splitStrAlpha[1].equals("oslomet.no")) {
        throw new InvalidOsloMetEmailException("Ingen av tallene kan være negative");

    }

    String studentStr = splitStrAlpha[0];
    if(studentStr.length() != 7 || studentStr.charAt(0) != 's') {
        throw new InvalidStudentOsloMetEmailException("Ingen av tallene kan være negative");
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


}
