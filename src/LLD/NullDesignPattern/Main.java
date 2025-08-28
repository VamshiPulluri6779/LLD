package NullDesignPattern;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = VehicleFactory.getVehicle("Truck");
        System.out.println(vehicle.getCapacity());
    }
}
