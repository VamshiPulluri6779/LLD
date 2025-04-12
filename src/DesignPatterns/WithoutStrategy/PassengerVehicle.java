package DesignPatterns.WithoutStrategy;

public class PassengerVehicle implements Vehicle{

    @Override
    public void drive(){
        System.out.println("Normal driving capability");
    }
}
