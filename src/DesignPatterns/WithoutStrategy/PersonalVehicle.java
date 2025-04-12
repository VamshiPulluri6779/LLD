package DesignPatterns.WithoutStrategy;

public class PersonalVehicle implements Vehicle{

    @Override
    public void drive(){
        System.out.println("Normal driving capability"); // same code as PassengerVehicle - duplicate
    }
}
