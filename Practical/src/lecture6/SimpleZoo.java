package lecture6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import lecture3.Animal;

public class SimpleZoo {

    private Set<Animal> animals = new HashSet<>();

    // exceptions using throws
    public void addAnimal(Animal animal) throws AnimalAlreadyExistsException, AnimalAgeException {
        if (animals.contains(animal)) {
            throw new AnimalAlreadyExistsException("Animal already exists in the zoo.");
        }
        if (animal.getAge() < 0) {
            throw new AnimalAgeException("Animal age cannot be negative.");
        }
        animals.add(animal);
        System.out.println(animal.getName() + " added to the zoo.");
    }

    // exception using throws
    public void removeAnimal(Animal animal) throws AnimalNotFoundException {
        if (!animals.contains(animal)) {
            throw new AnimalNotFoundException("Animal not found in the zoo.");
        }
        animals.remove(animal);
        System.out.println(animal.getName() + " removed from the zoo.");
    }

    // method using try-with-resources
    public void readAnimalData(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
