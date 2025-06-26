package LLD.ParkingManagementSystem;

import java.util.Set;
import java.util.TreeSet;

public interface ParkingStrategy {

    ParkingSlot getParkingSlot(TreeSet<ParkingSlot> parkingSlots);
}
