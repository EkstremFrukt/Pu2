

public class Car implements Comparable<Car>{
    private String manufacturer;
    private int age;
    
    public Car(String m, int a) {
        this.manufacturer = m;
        this.age = a;
    }

    public String getManufacturer() {
        return manufacturer;
    }
 
    public int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return "Bilmerke er " + manufacturer + " og bilen er " 
                + age + " år gammel\n";
    }

    @Override
    public int compareTo(Car o) {
        //return Integer.compare(this.getAge(), o.age);
        return this.getManufacturer().compareTo(o.manufacturer);     
    }  
}
