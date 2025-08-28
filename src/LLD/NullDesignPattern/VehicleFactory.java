package NullDesignPattern;

public class VehicleFactory {

    public static Vehicle getVehicle(String vehicleType){
        return switch (vehicleType){
            case "Car" -> new Car();
            case "Bike" -> new Bike();
            default -> new NullVehicle();
        };
    }
}
