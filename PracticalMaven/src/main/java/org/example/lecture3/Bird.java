package org.example.lecture3;

import java.util.Objects;

public class Bird extends Animal {

    private boolean canFly;

    public Bird(String name, int age, double weight, boolean canFly, Habitat habitat) {
        super(name, age, weight, habitat);
        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
    @Override
    public void makeSound() {
        System.out.println("lecture3.Bird sound");
    }

    @Override
    public String toString() {
        return "lecture3.Bird{" +
                "canFly=" + canFly +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", habitat=" + habitat +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bird bird)) return false;
        if (!super.equals(o)) return false;
        return canFly == bird.canFly;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), canFly);
    }
}
