package org.example.lecture7;


import org.example.lecture3.Animal;

import java.util.*;

public class AnimalManager {

    private Map<String, Animal> animalMap;
    private Set<Animal> animalSet;
    private List<Animal> animalList;
    private TreeSet<Animal> animalTreeSet;
    private LinkedList<Animal> animalLinkedList;

    public AnimalManager() {
        animalMap = new HashMap<>();
        animalSet = new HashSet<>();
        animalList = new ArrayList<>();
        animalTreeSet = new TreeSet<>(Comparator.comparing(Animal::getName));
        animalLinkedList = new LinkedList<>();
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
    public void addAnimalTreeSet(Animal animal) {
        animalTreeSet.add(animal);
    }

    public void removeAnimalTreeSet(Animal animal) {
        animalTreeSet.remove(animal);
    }

    public void printAllAnimalsTreeSet() {
        System.out.println("Animals in TreeSet: " + animalTreeSet);
    }
    public void addAnimalLinkedList(Animal animal) {
        animalLinkedList.add(animal);
    }

    public void removeAnimalLinkedList(Animal animal) {
        animalLinkedList.remove(animal);
    }

    public void printAllAnimalsLinkedList() {
        System.out.println("Animals in LinkedList: " + animalLinkedList);
    }
}
