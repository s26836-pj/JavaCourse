package org.example.lecture7;


import org.example.lecture3.Bird;
import org.example.lecture3.Fish;
import org.example.lecture3.Habitat;

public class Main {
    public static void main(String[] args) {
        AnimalManager manager = new AnimalManager();

        Habitat forest = new Habitat("Forest", 15.0);
        Bird eagle = new Bird("Eagle", 5, 4.5, true, forest);
        Fish shark = new Fish("Shark", 10, 150.0, true, new Habitat("Ocean", 20.0));

        manager.addAnimalMap(eagle);
        manager.addAnimalMap(shark);
        manager.printAllAnimalsMap();
        manager.removeAnimalMap(eagle);
        manager.printAllAnimalsMap();


        manager.addAnimalSet(eagle);
        manager.addAnimalSet(shark);
        manager.printAllAnimalsSet();
        manager.removeAnimalSet(shark);
        manager.printAllAnimalsSet();

        manager.addAnimalList(eagle);
        manager.addAnimalList(shark);
        manager.printAllAnimalsList();
        manager.removeAnimalList(eagle);
        manager.printAllAnimalsList();

        manager.addAnimalTreeSet(eagle);
        manager.addAnimalTreeSet(shark);
        manager.printAllAnimalsTreeSet();
        manager.removeAnimalTreeSet(shark);
        manager.printAllAnimalsTreeSet();

        manager.addAnimalLinkedList(eagle);
        manager.addAnimalLinkedList(shark);
        manager.printAllAnimalsLinkedList();
        manager.removeAnimalLinkedList(eagle);
        manager.printAllAnimalsLinkedList();
    }
}
