package DesignPatterns.AbstractFactoryDesign;

public class NormalFactory implements VehicleFactory{

    public Vehicle getVehicle(String vehicleType){
        return switch (vehicleType) {
            case "Swift" -> new Swift();
            case "Hyundai" -> new Hyundai();
            default -> null;
        };
    }
}
