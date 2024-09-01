package org.example.lecture5;

public interface ISteering {
    void turnSteering();

    default void checkSteering(){
        System.out.println("checking steering interface");
    }

}
