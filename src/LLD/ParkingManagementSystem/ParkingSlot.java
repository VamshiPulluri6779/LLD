package LLD.ParkingManagementSystem;

public class ParkingSlot {

    int parkingSlotId;
    VehicleType vehicleType;
    boolean isOccupied;

    ParkingSlot(int parkingSlotId, VehicleType vehicleType){
        this.parkingSlotId = parkingSlotId;
        this.vehicleType = vehicleType;
        this.isOccupied = false;
    }

    public int getParkingSlotId(){
        return this.parkingSlotId;
    }

    public VehicleType getVehicleType(){
        return vehicleType;
    }

    public void setOccupied(boolean value){
        isOccupied = value;
    }

}
