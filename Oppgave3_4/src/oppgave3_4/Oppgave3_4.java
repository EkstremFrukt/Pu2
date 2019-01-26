package oppgave3_4;

public class Oppgave3_4 {

    public static void main(String[] args) {
        /*Animal dyr1 = new Animal();
        dyr1.type = "Hest";
        dyr1.info = new int[2];
        dyr1.info[0] = 44;
        dyr1.info[1] = 54;          
        Animal dyr2 = new Animal(dyr1);
       
        System.out.println(dyr1);
        //output: 
        //Type of animal: Hest[44, 54]
        
        dyr2.info[0] = 2;
        dyr2.type = "Ku";
        
        System.out.println(dyr1+" \n"+ dyr2);
        //output:
        //Type of animal: Hest[44, 54] 
        //Type of animal: Hest[2, 54]
        
        Dog dogOne = new Dog("Fido");
        Dog dogTwo = new Dog(dogOne);
        dogTwo.name = "Pluto";
        
        System.out.println(dogOne + " \n" + dogTwo);
        //output:
        //Type of animal: Dog [10, 40], name of dog: Fido, life expectancy: 10, weight: 40 
        //Type of animal: Dog [10, 40], name of dog: Pluto, life expectancy: 10, weight: 40
        */
        
        Dog peter = new Dog("Peter");

        Dog kopiert = new Dog(peter);
        System.out.println(kopiert);

        kopiert.name = "Hans";
        kopiert.info[1] = 50;
        System.out.println(kopiert);
        System.out.println(peter);
        
        Animal hund = new Animal(peter);
        System.out.println(hund); 

        // HINT: her forventer vi at toString-metoden til Dog blir kjørt fordi 
        // det originale peter-objektet er av type Dog
    }    
}
