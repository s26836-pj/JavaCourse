package org.example.lecture6;

import org.example.lecture3.Animal;
import org.example.lecture3.Habitat;

public class ZooOperations {

    public void addAnimalToZoo(SimpleZoo zoo, Animal animal) {
        try {
            zoo.addAnimal(animal);
        } catch (AnimalAlreadyExistsException | AnimalAgeException e) {
            System.out.println("Error adding animal: " + e.getMessage());
        }
    }

    public void removeAnimalFromZoo(SimpleZoo zoo, Animal animal) {
        try {
            zoo.removeAnimal(animal);
        } catch (AnimalNotFoundException e) {
            System.out.println("Error removing animal: " + e.getMessage());
        }
    }

    public void changeAnimalHabitat(Animal animal, Habitat newHabitat) {
        try {
            if (newHabitat == null) {
                throw new InvalidHabitatException("Habitat cannot be null.");
            }
            animal.setHabitat(newHabitat);
            System.out.println(animal.getName() + " habitat changed to " + newHabitat.getEnvironment());
        } catch (InvalidHabitatException e) {
            System.out.println("Error changing habitat: " + e.getMessage());
        }
    }
}
