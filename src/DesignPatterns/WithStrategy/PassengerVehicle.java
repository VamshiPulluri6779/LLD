package DesignPatterns.WithStrategy;

public class PassengerVehicle extends Vehicle{

    public PassengerVehicle() {
        super(new NormalCapability());
    }
}
