package lecture3;

import java.util.Objects;

public abstract class Animal {
    protected String name;
    protected int age;
    protected double weight;
    protected Habitat habitat;

    public Animal(String name, int age, double weight, Habitat habitat) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.habitat = habitat;
    }

    public void makeSound() {
        System.out.println("some animal sound");
    }

    @Override
    public String toString() {
        return "lecture3.Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", habitat=" + habitat +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return age == animal.age && Double.compare(weight, animal.weight) == 0 && Objects.equals(name, animal.name) && Objects.equals(habitat, animal.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight, habitat);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }
}
