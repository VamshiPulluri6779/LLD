package DesignPatterns.NullObjectDesign;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = VehicleFactory.getVehicle("car");

        System.out.println("Vehicle's seating capacity is "+ vehicle.getSeatingCapacity());
        System.out.println("Vehicle's fuel capacity is "+ vehicle.getFuelCapacity());
    }
}
