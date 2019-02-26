package oppgave3_4;

import java.util.Arrays;

public class Dog extends Animal{
    String name; 
    
    public Dog() {}
    
    public Dog(String name) {
        this.name = name;
        this.info = new int[2];
        this.info[0] = 10;
        this.info[1] = 40;
        this.type = "Dog";
    }
    
    public Dog(Dog source) {
        super(source);
        this.name = source.name;
        this.type = source.type;
        this.info = new int[source.info.length];
        
        for (int i = 0; i < this.info.length; i++) {
            this.info[i] = source.info[i];
        }              
    }
    
    @Override
    public String toString() {
        return String.format("%s, name of dog: %s, life expectancy: %s, weight: %s",
                super.toString(), name, info[0], info[1]);
    }
}
