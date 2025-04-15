package DesignPatterns.AbstractFactoryDesign;

public class LuxuryFactory implements VehicleFactory{

    public Vehicle getVehicle(String vehicleType){
        return switch (vehicleType) {
            case "Mercedes" -> new Mercedes();
            case "RollsRoyce" -> new RollsRoyce();
            default -> null;
        };
    }
}
