package org.example.lecture5;

public final class Car extends Vehicle implements ITransmission, IBrakes, ISteering, IFuelSystem {

    public static void carInfo() {
        System.out.println("this is a cart with x features");
    }

    static int carCount = 0;
    final int maxSpeed = 200;

    public Car() {
        carCount++;
        System.out.println("total cars: " + carCount);
    }

    public final void displayMaxSpeed() {
        System.out.println("max speed: " + maxSpeed + " km/h");
    }
    @Override
    public void accelerate(){
        System.out.println("car is accelerating");
    }

    @Override
    public void shiftGear() {
        System.out.println("shifting gear in Car.");
    }

    @Override
    public void applyBrakes() {
        System.out.println("applying brakes in Car.");
    }

    @Override
    public void turnSteering() {
        System.out.println("turning steering in Car.");
    }

    @Override
    public void refuel() {
        System.out.println("refueling the Car.");
    }
}

