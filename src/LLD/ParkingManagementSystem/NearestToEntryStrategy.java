package LLD.ParkingManagementSystem;

import java.util.TreeSet;

public class NearestToEntryStrategy implements ParkingStrategy{
    @Override
    public ParkingSlot getParkingSlot(TreeSet<ParkingSlot> parkingSlots) {
        return parkingSlots.first();
    }
}
