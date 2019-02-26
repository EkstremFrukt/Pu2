
import java.util.Set;
import java.util.TreeSet;




public class Øving1_1 {

    public static void main(String[] args) {
        Set<Car> cset = new TreeSet<>();
        Car c1 = new Car("Bentley", 221);
        Car c2 = new Car("Audi", 11);
        Car c3 = new Car("Mishibishi", 51);
        Car c4 = new Car("BmW", 22);
        
        cset.add(c1);
        cset.add(c2);
        cset.add(c3);
        cset.add(c4);
        
        System.out.println(cset);
    }
    
}
