package animalKingdom;

public class Mammal extends Animal {
    public Mammal(String name, int year)
    {
        super(name, year);
    }

    public String moves()
    {
        return "walk";
    }
    
    public String breathes()
    {
        return "lungs";
    }
    
    public String reproduces()
    {
        return "live birth";
    }
}
