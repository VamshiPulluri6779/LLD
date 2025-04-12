package DesignPatterns.WithoutStrategy;

public class SportyVehicle implements Vehicle{

    @Override
    public void drive(){
        System.out.println("Sports driving capability");
    }
}
