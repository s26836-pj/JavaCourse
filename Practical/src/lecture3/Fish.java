package lecture3;

import lecture3.Animal;
import lecture3.Habitat;

public class Fish extends Animal {
    private boolean hasGills;

    public Fish(String name, int age, double weight, boolean hasGills, Habitat habitat) {
        super(name, age, weight, habitat);
        this.hasGills = hasGills;
    }

    public boolean isHasGills() {
        return hasGills;
    }

    public void setHasGills(boolean hasGills) {
        this.hasGills = hasGills;
    }

    @Override
    public void makeSound() {
        System.out.println("fish sound");
    }
}
