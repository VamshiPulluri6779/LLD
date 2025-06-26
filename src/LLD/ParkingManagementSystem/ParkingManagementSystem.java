package LLD.ParkingManagementSystem;

public class ParkingManagementSystem {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(133, VehicleType.TWO_WHEELER);

        ParkingFloor parkingFloor = setUp();

        Ticket ticket = parkingFloor.parkVehicle(vehicle);

        if(ticket!=null) parkingFloor.unParkVehicle(ticket);
    }

    private static ParkingFloor setUp() {
        ParkingFloor floor = new ParkingFloor();


        ParkingSlot slot1  = new ParkingSlot(1, VehicleType.TWO_WHEELER);
        ParkingSlot slot2  = new ParkingSlot(2, VehicleType.TWO_WHEELER);
        ParkingSlot slot3  = new ParkingSlot(3, VehicleType.FOUR_WHEELER);
        ParkingSlot slot4  = new ParkingSlot(4, VehicleType.TWO_WHEELER);
        ParkingSlot slot5  = new ParkingSlot(5, VehicleType.FOUR_WHEELER);
        ParkingSlot slot6  = new ParkingSlot(6, VehicleType.TWO_WHEELER);

        slot1.setOccupied(true);

        floor.addParkingSlot(slot1);
        floor.addParkingSlot(slot2);
        floor.addParkingSlot(slot3);
        floor.addParkingSlot(slot4);
        floor.addParkingSlot(slot5);
        floor.addParkingSlot(slot6);

        return floor;
    }
}
