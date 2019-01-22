package oppgave2_7;

public class Oppgave2_7 {

  
    public static void main(String[] args) {
        String[] strings = new String[70];
        
        for(int i = 0; i < strings.length; i += 2) {
            strings[i] = "This is string number " + (i/2+1);
        }

        for(String str : strings) {
            try {
                if (str.isEmpty()) {
                    System.out.println("This string is empty");
                }

                System.out.println(str + " ");
            } catch (NullPointerException e) {}
        }
    }   
}
