package lecture7;

import lecture3.Animal;

import java.util.*;

public class AnimalManager {

    private Map<String, Animal> animalMap;
    private Set<Animal> animalSet;
    private List<Animal> animalList;

    public AnimalManager() {
        animalMap = new HashMap<>();
        animalSet = new HashSet<>();
        animalList = new ArrayList<>();
    }

    public void addAnimalMap(Animal animal) {
        animalMap.put(animal.getName(), animal);
    }
    public void removeAnimalMap(Animal animal){
        animalMap.remove(animal.getName(),animal);
    }

    public void printAllAnimalsMap() {
        System.out.println("Animals: " + animalMap);
    }

    public void addAnimalSet(Animal animal) {
        animalSet.add(animal);
    }
    public void removeAnimalSet(Animal animal){
        animalSet.remove(animal);
    }

    public void printAllAnimalsSet() {
        System.out.println("Animals in Set: " + animalSet);
    }

    public void addAnimalList(Animal animal) {
        animalList.add(animal);
    }

    public void removeAnimalList(Animal animal){
        animalList.remove(animal);
    }


    public void printAllAnimalsList() {
        System.out.println("Animals in List: " + animalList);
    }


}
