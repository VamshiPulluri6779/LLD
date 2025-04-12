package DesignPatterns.WithStrategy;

public class Vehicle {
    DrivingCapability drivingCapability;

    public Vehicle(DrivingCapability drivingCapability) {
        this.drivingCapability = drivingCapability;
    }

    void drive(){
        drivingCapability.drive();
    }
}
