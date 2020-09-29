package animalKingdom;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("--- Animal Kingdom ---");

        List<Animal> animals = new ArrayList<>();

        animals.add(new Mammal("Panda", 1869));
        animals.add(new Mammal("Zebra", 1778));
        animals.add(new Mammal("Koala", 1816));
        animals.add(new Mammal("Sloth", 1804));
        animals.add(new Mammal("Armadillo", 1758));
        animals.add(new Mammal("Raccoon", 1758));
        animals.add(new Mammal("Bigfoot", 2021));
        animals.add(new Bird("Pigeon", 1837));
        animals.add(new Bird("Peacock", 1821));
        animals.add(new Bird("Toucan", 1758));
        animals.add(new Bird("Parrot", 1824));
        animals.add(new Bird("Swan", 1758));
        animals.add(new Fish("Salmon", 1758));
        animals.add(new Fish("Catfish", 1817));
        animals.add(new Fish("Perch", 1758));

        System.out.println(animals);

        System.out.println("\n\nDescending order by year named:");
        animals.sort((first, second) -> second.getYear() - first.getYear());
        System.out.println(animals);

        System.out.println("\n\nAlphabetical:");
        animals.sort((first, second) -> first.getName().compareToIgnoreCase(second.getName()));
        System.out.println(animals);

        System.out.println("\n\nBy movement type:");
        animals.sort((first, second) -> first.moves().compareToIgnoreCase(second.moves()));
        System.out.println(animals);

        System.out.println("\n\nOnly lung breathers:");
        List<Animal> filtered = filter(animals, (item) -> item.breathes() == "lungs");
        System.out.println(filtered);

        System.out.println("\n\nOnly lung breathers named in 1758:");
        filtered = filter(animals, (item) -> item.breathes() == "lungs" && item.getYear() == 1758);
        System.out.println(filtered);

        System.out.println("\n\nOnly lung breathers that lay eggs:");
        filtered = filter(animals, (item) -> item.breathes() == "lungs" && item.reproduces() == "eggs");
        System.out.println(filtered);

        System.out.println("\n\nAlphabetical, only those named in 1758:");
        filtered = filter(animals, (item) -> item.getYear() == 1758);
        filtered.sort((first, second) -> first.getName().compareToIgnoreCase(second.getName()));
        System.out.println(filtered);

        System.out.println("\n\nAlphabetical, only mammals:");
        filtered = filter(animals, (item) -> item instanceof Mammal);
        filtered.sort((first, second) -> first.getName().compareToIgnoreCase(second.getName()));
        System.out.println(filtered);
    }

    private static List<Animal> filter(List<Animal> list, FilterAnimal filter)
    {
        List<Animal> result = new ArrayList<Animal>();

        for (Animal item : list)
        {
            if(filter.test(item))
            {
                result.add(item);
            }
        }

        return result;
    }
}