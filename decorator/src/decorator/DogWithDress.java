package decorator;

public class DogWithDress extends DogDecorator{
    private String typeOfDress;

    public DogWithDress(Dog decorate, String typeOfDress) {
        super(decorate);
        this.typeOfDress = typeOfDress;
    }

    @Override
    public String decorateDog() {
        return "The dress is: " + typeOfDress;
    }
    
    
}
