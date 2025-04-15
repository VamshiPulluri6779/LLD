package DesignPatterns.AbstractFactoryDesign;

public class FactoryProducer {

    VehicleFactory getVehicleFactory(String factoryType){
        return switch (factoryType) {
            case "Normal" -> new NormalFactory();
            case "Luxury" -> new LuxuryFactory();
            default -> null;
        };
    }
}
