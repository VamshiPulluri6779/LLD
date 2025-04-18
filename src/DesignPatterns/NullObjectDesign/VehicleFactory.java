package DesignPatterns.NullObjectDesign;

public class VehicleFactory {

    static Vehicle getVehicle(String vehicleType) {
        if (vehicleType.equals("car")) {
            return new Car();
        }
        return new NullObject();
    }
}
