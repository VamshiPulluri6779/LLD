package DesignPatterns.FactoryDesign;

public class VehicleFactory {

    public Vehicle getVehicle(String vehicle){
        return switch (vehicle) {
            case "Mercedes" -> new Merecedes();
            case "Skoda" -> new Skoda();
            default -> null;
        };
    }

}
