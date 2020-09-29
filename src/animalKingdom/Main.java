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

/*
    List only those animals the breath with lungs
    List only those animals that breath with lungs and were named in 1758
    List only those animals that lay eggs and breath with lungs
    List alphabetically only those animals that were named in 1758
*/
    }
}