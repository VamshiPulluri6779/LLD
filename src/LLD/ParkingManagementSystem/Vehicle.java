package LLD.ParkingManagementSystem;

public class Vehicle {

    int vehicleId;
    VehicleType vehicleType;

    Vehicle(int vehicleId, VehicleType vehicleType){
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType(){
        return vehicleType;
    }

    public int getId(){
        return vehicleId;
    }
    
}
