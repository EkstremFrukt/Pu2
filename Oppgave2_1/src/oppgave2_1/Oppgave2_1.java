package oppgave2_1;

    public class Oppgave2_1 {
        public static void main(String[] args) {
        String email1 = "s123456@hioa.no";
        String email2 = "s123456@oslomet.no";


        checkMail(email1);
        checkMail(email2);
    }
        
    public static void checkMail(String email) {
        
        String[] splitStrAlpha = email.split("@");
        int length = splitStrAlpha.length;
        String secondPart = splitStrAlpha[1];
        String studentStr = splitStrAlpha[0];
        int testInt = Integer.parseInt(studentStr.substring(1));

        try{
            InvalidEmailException.atChecker(length);
            System.out.println(InvalidEmailException.atChecker(length));
        }
        catch(InvalidEmailException e) {
            System.err.println(e.getMessage());
        }

        try{
            InvalidOsloMetEmailException.lastChecker(secondPart);
            System.out.println(InvalidOsloMetEmailException.lastChecker(secondPart));
        }
        catch(InvalidEmailException e) {
            System.err.println(e.getMessage());
        }

        try{
            InvalidStudentOsloMetEmailException.studentNumberCheck(studentStr);
            System.out.println(InvalidStudentOsloMetEmailException.studentNumberCheck(studentStr));
        }
        catch(InvalidEmailException e){
            System.err.println(e.getMessage());
        }

        try{
            InvalidStudentOsloMetEmailException.negativeCheck(testInt);
            System.out.println(InvalidStudentOsloMetEmailException.negativeCheck(testInt));
        }
        catch(InvalidEmailException e) {
            System.err.println(e.getMessage());
        }
    }   
}
