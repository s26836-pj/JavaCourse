package lecture5;

public abstract class Vehicle implements IEngine {

    @Override
    public void startEngine(){
        System.out.println("start engine in abs class");
    }
    public void stopEngine(){
        System.out.println("stop engine in abs class");
    }

    public abstract void accelerate();
}
