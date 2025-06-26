package LLD.ParkingManagementSystem;

import java.util.*;

public class ParkingFloor {

    List<ParkingSlot> parkingSlots;
    Map<VehicleType, TreeSet<ParkingSlot>> availableNearestParkingSlots;
    ParkingStrategy parkingStrategy;

    ParkingFloor(){
        parkingSlots = new ArrayList<>();
        availableNearestParkingSlots = new HashMap<>();

        for(VehicleType vehicleType : VehicleType.values()) {
            availableNearestParkingSlots.put(vehicleType, new TreeSet<>((a,b) -> a.getParkingSlotId() - b.getParkingSlotId()));
        }
        parkingStrategy = new NearestToEntryStrategy();
    }

    public void addParkingSlot(ParkingSlot parkingSlot){
        this.parkingSlots.add(parkingSlot);
        if(!parkingSlot.isOccupied) this.availableNearestParkingSlots.get(parkingSlot.getVehicleType()).add(parkingSlot);
    }


    public Ticket parkVehicle(Vehicle vehicle){
        if(availableNearestParkingSlots.isEmpty()){
            System.out.println("Parking is Full");
        } else {
            ParkingSlot slot = parkingStrategy.getParkingSlot(availableNearestParkingSlots.get(vehicle.getVehicleType()));
            slot.setOccupied(true);
            availableNearestParkingSlots.get(vehicle.getVehicleType()).remove(slot);

            System.out.println("Parked vehicle with id : "+vehicle.getId()
                    + " at parking slot : " + slot.getParkingSlotId());
            return generateTicket(slot, vehicle);
        }
        return null;
    }

    public void unParkVehicle(Ticket ticket){
        System.out.println("Un parked the vehicle "+ ticket.vehicle.getId() + " from the " +
                "slot "+ticket.parkingSlot.getParkingSlotId());

        ParkingSlot slot = ticket.parkingSlot;
        slot.setOccupied(false);

        availableNearestParkingSlots.get(slot.getVehicleType()).add(slot);
        System.out.println("Made the parking slot " + slot.getParkingSlotId()
                + " available again");
    }

    public Ticket generateTicket(ParkingSlot slot, Vehicle vehicle){
        System.out.println("Parking ticket generated for vehicle :"+ vehicle.getId());
        return new Ticket(slot, vehicle);
    }

}
