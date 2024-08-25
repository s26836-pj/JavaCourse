package lecture3;

import java.util.Objects;

public class Mammal extends Animal {
    private boolean hasTeeth;

    public Mammal(String name, int age, double weight, boolean hasTeeth, Habitat habitat) {
        super(name, age, weight, habitat);
        this.hasTeeth = hasTeeth;
    }

    public boolean isHasTeeth() {
        return hasTeeth;
    }

    public void setHasTeeth(boolean hasTeeth) {
        this.hasTeeth = hasTeeth;
    }
    @Override
    public void makeSound(){
        System.out.println("lecture3.Mammal sound");
    }

    @Override
    public String toString() {
        return "lecture3.Mammal{" +
                "hasTeeth=" + hasTeeth +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", habitat=" + habitat +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mammal mammal)) return false;
        if (!super.equals(o)) return false;
        return hasTeeth == mammal.hasTeeth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hasTeeth);
    }
}
