package DesignPatterns.FactoryDesign;

public class Main {
    public static void main(String[] args){
        Vehicle vehicle = VehicleFactory.getVehicle("Skoda");

        vehicle.drive();
    }
}
