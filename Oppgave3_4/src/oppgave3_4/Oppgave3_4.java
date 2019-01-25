package oppgave3_4;

public class Oppgave3_4 {

    public static void main(String[] args) {
        Animal dyr1 = new Animal();
        dyr1.type = "Hest";
        dyr1.info = new int[2];
        dyr1.info[0] = 44;
        dyr1.info[1] = 54;
        
        Animal dyr2 = new Animal(dyr1);
        
        System.out.println(dyr1);
        //output: 
        //Type of animal: Hest[44, 54]
        
        
        dyr2.info[0] = 2;
        
        System.out.println(dyr1+" \n"+ dyr2);
        //output:
        //Type of animal: Hest[2, 54] 
        //Type of animal: Hest[2, 54]
    }    
}
