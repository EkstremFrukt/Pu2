
package decorator;

public class Decorator {

    public static void main(String[] args) {
        Dog d1 = new Dog("Dalamtiner", 2);
        Dog d2 = new Dog("Terrier", 13);
        
        System.out.println(d1);
        DogWithDress d1WithDress = new DogWithDress(d1, "Rød kjole");
        System.out.println("---------------");
        System.out.println(d1WithDress);
        System.out.println("---------------");
        System.out.println(d1);
        
        DogWithGlasses d1WithGlasses = new DogWithGlasses(d1, "Solbriller");
        System.out.println("---------------");
        System.out.println(d1WithGlasses);
        System.out.println("---------------");
        System.out.println(d1WithDress);
    
    }
    
}
