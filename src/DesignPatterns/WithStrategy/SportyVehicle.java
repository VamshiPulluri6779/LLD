package DesignPatterns.WithStrategy;

public class SportyVehicle extends Vehicle{
    public SportyVehicle() {
        super(new SportCapability());
    }
}
