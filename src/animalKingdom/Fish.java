package animalKingdom;

public class Fish extends Animal {
    public Fish(String name, int year)
    {
        super(name, year);
    }

    public String moves()
    {
        return "swim";
    }
    
    public String breathes()
    {
        return "gills";
    }
    
    public String reproduces()
    {
        return "eggs";
    }
}
