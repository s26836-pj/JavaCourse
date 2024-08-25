package lecture5;

public interface ITransmission {
    void shiftGear();

    default void checkTransmission(){
        System.out.println("checking transmission interface");
    }
}
