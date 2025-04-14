package DesignPatterns.FactoryDesign;

public class Main {
    public static void main(String[] args){
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle vehicle = vehicleFactory.getVehicle("Skoda");

        vehicle.drive();
    }
}
