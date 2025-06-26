package LLD.ParkingManagementSystem;

public class Ticket {

    ParkingSlot parkingSlot;
    Vehicle vehicle;

    Ticket(ParkingSlot slot, Vehicle vehicle){
        this.parkingSlot = slot;
        this.vehicle = vehicle;
    }
}
