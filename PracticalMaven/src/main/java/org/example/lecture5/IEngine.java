package org.example.lecture5;

public interface IEngine {
    void startEngine();

    default void checkEngine(){
        System.out.println("Checking engine interface");
    }
}
