package LLD.ParkingManagementSystem;

import java.util.TreeSet;

public class NearToExitStrategy implements ParkingStrategy{

    @Override
    public ParkingSlot getParkingSlot(TreeSet<ParkingSlot> parkingSlots) {
        return parkingSlots.last();
    }
}
