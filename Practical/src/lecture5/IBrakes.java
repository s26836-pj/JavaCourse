package lecture5;

public interface IBrakes {

    void applyBrakes();
    default void checkBrakes(){
        System.out.println("checking brakes interface");
    }
}
