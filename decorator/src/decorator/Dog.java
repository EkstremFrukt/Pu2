package decorator;

public class Dog {
    private String race;
    private int age;

    public Dog(String race, int age) {
        this.race = race;
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" + "race=" + race + ", age=" + age + '}';
    }      
}
