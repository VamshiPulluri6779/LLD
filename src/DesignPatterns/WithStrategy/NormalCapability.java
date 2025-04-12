package DesignPatterns.WithStrategy;

public class NormalCapability implements DrivingCapability {
    @Override
    public void drive() {
        System.out.println("Normal driving capability");
    }
}
