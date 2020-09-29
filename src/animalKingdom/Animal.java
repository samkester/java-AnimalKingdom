package animalKingdom;

public abstract class Animal
{
    public static int nextID = 0;

    private int id;
    private String name;
    private int year;

    public Animal(String name, int year)
    {
        this.name = name;
        this.year = year;

        id = nextID;
        nextID++;
    }

    public String eats()
    {
        return "Plants";
    }

    abstract public String moves();
    abstract public String breathes();
    abstract public String reproduces();

    @Override
    public String toString() {
        return id + ": " + name + "\t(" + year + ")\t" + moves() + "\t" + breathes() + "\t" + reproduces() + "\n";
    }
}