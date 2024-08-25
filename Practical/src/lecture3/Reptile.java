package lecture3;

import java.util.Objects;

public class Reptile extends Animal {
    private boolean isColdBlooded;

    public Reptile(String name, int age, double weight, boolean isColdBlooded, Habitat habitat) {
        super(name, age, weight, habitat);
        this.isColdBlooded = isColdBlooded;
    }

    public void setColdBlooded(boolean coldBlooded) {
        isColdBlooded = coldBlooded;
    }

    public boolean isColdBlooded() {
        return isColdBlooded;
    }

    @Override
    public void makeSound(){
        System.out.println("reptile sound");
    }

    @Override
    public String toString() {
        return "lecture3.Reptile{" +
                "isColdBlooded=" + isColdBlooded +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", habitat=" + habitat +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reptile reptile)) return false;
        if (!super.equals(o)) return false;
        return isColdBlooded == reptile.isColdBlooded;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isColdBlooded);
    }
}
