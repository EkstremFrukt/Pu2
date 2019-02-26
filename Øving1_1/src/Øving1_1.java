
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;




public class Øving1_1 {

    public static void main(String[] args) {
        Set<Car> cset = new TreeSet<>();
        Car c1 = new Car("Bentley", 221);
        Car c2 = new Car("Audi", 11);
        Car c3 = new Car("Audi", 1);
        Car c4 = new Car("BmW", 22);
        Car c5 = new Car("Audi", 22);
        
        
        cset.add(c1);
        cset.add(c2);
        cset.add(c3);
        cset.add(c4);
        cset.add(c5);
        
        List<Car> carList = new ArrayList<>(cset);
        carList.add(c3);
        
        Collections.sort(carList, new ManufacturerCarComparator());
        
        System.out.println(carList);
    }
    
}
