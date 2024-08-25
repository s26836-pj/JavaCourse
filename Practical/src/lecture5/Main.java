package lecture5;

public class Main {
    public static void main(String[] args) {
        Car myCar = getCar();
        myCar.stopEngine();

        myCar.displayMaxSpeed();
        System.out.println("car max speed: " + myCar.maxSpeed);

        Car.carInfo();
        System.out.println("total cars: " + Car.carCount);
    }

    private static Car getCar() {
        Car myCar = new Car();

        myCar.startEngine();
        myCar.shiftGear();
        myCar.applyBrakes();
        myCar.turnSteering();
        myCar.refuel();

        myCar.checkEngine();
        myCar.checkTransmission();
        myCar.checkBrakes();
        myCar.checkSteering();
        myCar.checkFuelSystem();

        myCar.accelerate();
        return myCar;
    }
}
