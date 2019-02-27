package decorator;

public class DogWithGlasses extends DogDecorator{
    private String typeOfGlasses;

    public DogWithGlasses(Dog decorate, String typeOfGlasses) {
        super(decorate);
        this.typeOfGlasses = typeOfGlasses;
    }

    @Override
    public String decorateDog() {
        return "The glasses are: " + typeOfGlasses;
    }
    
    
}
