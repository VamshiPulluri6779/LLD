package DesignPatterns.AbstractFactoryDesign;

public class Main {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();
        VehicleFactory vehicleFactory = factoryProducer.getVehicleFactory("Luxury");

        Vehicle vehicle = vehicleFactory.getVehicle("Mercedes");

        vehicle.drive();
    }
}
