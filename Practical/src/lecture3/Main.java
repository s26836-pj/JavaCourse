package lecture3;

import lecture6.SimpleZoo;
import lecture6.ZooOperations;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Habitat savanna = new Habitat("Savanna", 30.0);
        Habitat ocean = new Habitat("Ocean", 20.0);
        Habitat rainforest = new Habitat("Rainforest", 25.0);
        Habitat desert = new Habitat("Desert", 35.0);
        Habitat mountain = new Habitat("Mountain", 10.0);

        Animal genericAnimal = new Mammal("Generic", 5, 50.0, true, rainforest);
        Mammal mammal = new Mammal("Lion", 8, 190.0, true, savanna);
        Bird bird = new Bird("Eagle", 3, 6.0, true, mountain);
        Fish fish = new Fish("Goldfish", 1, 0.2, true, ocean);
        Reptile reptile = new Reptile("Snake", 4, 3.0, true, desert);
/*
        System.out.println(genericAnimal);
        genericAnimal.makeSound();

        System.out.println(mammal);
        mammal.makeSound();

        System.out.println(bird);
        bird.makeSound();

        System.out.println(fish);
        fish.makeSound();

        System.out.println(reptile);
        reptile.makeSound();

        System.out.println();
        System.out.println();

        // Test equality and hashcode
        Mammal anotherLion = new Mammal("Lion", 8, 190.0, true, savanna);
        System.out.println("Is mammal equal to anotherLion? " + mammal.equals(anotherLion));
        System.out.println("Hash code of mammal: " + mammal.hashCode());
        System.out.println("Hash code of anotherLion: " + anotherLion.hashCode());

        Bird anotherBird = new Bird("Eagle", 3, 6.0, true, mountain);
        System.out.println(bird.equals(anotherBird));
        System.out.println(bird.hashCode());
        System.out.println(bird.hashCode());

        Fish anotherfish = new Fish("Goldfish", 1, 0.2, true, ocean);
        System.out.println(fish.equals(anotherfish));
        System.out.println(fish.hashCode());
        System.out.println(anotherfish.hashCode());

        Reptile anotherReptile = new Reptile("turtle", 100, 120, true, ocean);
        System.out.println(reptile.equals(anotherReptile));
        System.out.println(reptile.hashCode());
        System.out.println(anotherReptile.hashCode());

        // Test that equals and hashCode work as expected with a HashSet
        Set<Mammal> mammalSet = new HashSet<>();
        mammalSet.add(mammal);
        mammalSet.add(anotherLion); // Should not add because they are equal

        Set<Fish> fishSet = new HashSet<>();
        fishSet.add(fish);
        fishSet.add(anotherfish);

        Set<Bird> birdSet = new HashSet<>();
        birdSet.add(bird);
        birdSet.add(anotherBird); // Should not add because they are equal
        Set<Reptile> reptileSet = new HashSet<>();
        reptileSet.add(reptile);
        reptileSet.add(anotherReptile); // Should add because they are not equal

        System.out.println("Number of unique mammals in set: " + mammalSet.size());
        System.out.println("Number of unique bird in set: " + birdSet.size());
        System.out.println("Number of unique fish in set: " + fishSet.size());
        System.out.println("Number of unique reptile in set: " + reptileSet.size()); // Should be 2
*/

        // lecture 6
        SimpleZoo zoo = new SimpleZoo();
        ZooOperations zooOperations = new ZooOperations();
        zooOperations.addAnimalToZoo(zoo, mammal);
        zooOperations.addAnimalToZoo(zoo, bird);
        zooOperations.addAnimalToZoo(zoo, fish);
        zooOperations.addAnimalToZoo(zoo, reptile);


        // trying to add an animal that already exists
        zooOperations.addAnimalToZoo(zoo, mammal); // trigger AnimalAlreadyExistsException

        // removing an animal
        zooOperations.removeAnimalFromZoo(zoo, bird);

        // trying to remove an animal that doesn't exist
        zooOperations.removeAnimalFromZoo(zoo, bird); // trigger AnimalNotFoundException

        // changing habitat
        zooOperations.changeAnimalHabitat(mammal, rainforest);

        // trying to change habitat to null
        zooOperations.changeAnimalHabitat(mammal, null); // trigger InvalidHabitatException

        // reading animal data from a file
        zoo.readAnimalData("src/lecture3/animal.txt");

        // reading animal data from a file error
        zoo.readAnimalData("src/lecture3/animalError.txt");
    }
}




