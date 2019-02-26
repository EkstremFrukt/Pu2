
import java.util.Comparator;

public class ManufacturerCarComparator implements Comparator<Car> {

    @Override
    public int compare(Car t, Car t1) {
        int compare = t.getManufacturer().compareTo(t1.getManufacturer());
        if (compare == 0) {
            compare = Integer.compare(t.getAge(), t1.getAge());
        }
        return compare;
    }
    
}
