package DesignPatterns.WithStrategy;

public class SportCapability implements DrivingCapability {
    @Override
    public void drive() {
        System.out.println("Sports driving capability");
    }
}
