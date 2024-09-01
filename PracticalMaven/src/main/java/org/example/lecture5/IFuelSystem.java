package org.example.lecture5;

public interface IFuelSystem {
    void refuel();


    default void checkFuelSystem(){
        System.out.println("checking fuel system interface");
    }
}
