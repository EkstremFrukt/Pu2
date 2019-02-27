package decorator;

public abstract class DogDecorator extends Dog {
    
    public Dog container;

    public DogDecorator(Dog container) {
        super("", 0);
        this.container = container;
    }

    public abstract String decorateDog();
    
    @Override
    public String getRace() {
        return container.getRace();
    }
    
    @Override
    public int getAge() {
        return container.getAge();
    }

    @Override
    public String toString() {
        return container.toString() + decorateDog();
    }
    
       
}
