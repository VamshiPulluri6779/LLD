package DesignPatterns.WithoutStrategy;

public class OffRoadVehicle implements Vehicle{

    @Override
    public void drive(){
        System.out.println("Sports driving capability"); // same code as sporty vehicle - duplicate
    }
}
