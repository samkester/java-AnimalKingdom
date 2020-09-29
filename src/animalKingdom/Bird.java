package animalKingdom;

public class Bird extends Animal {
    public Bird(String name, int year)
    {
        super(name, year);
    }

    public String moves()
    {
        return "fly";
    }
    
    public String breathes()
    {
        return "lungs";
    }
    
    public String reproduces()
    {
        return "eggs";
    }
}
