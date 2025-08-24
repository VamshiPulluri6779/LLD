package WarehouseManagement.Warehouse;

import WarehouseManagement.LockerFindingStrategy.StrategyEnum;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {

    String warehouseName;
    Map<Integer, Integer> packageLockedId;
    LockerService lockerService;

    public Warehouse(String warehouseName, LockerService lockerService) {
        this.warehouseName = warehouseName;
        this.packageLockedId = new HashMap<>();
        this.lockerService = lockerService;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public Map<Integer, Integer> getPackageLockedId() {
        return packageLockedId;
    }

    public void setPackageLockedId(Map<Integer, Integer> packageLockedId) {
        this.packageLockedId = packageLockedId;
    }

    public void addPackage(Package pack, StrategyEnum strategyEnum){
        Locker locker = this.lockerService.getLocker(pack.sizeEnum, strategyEnum);
        this.packageLockedId.put(pack.packageId, locker.lockerId);

        System.out.println("Package with id " +
                pack.packageId + " was assigned to locker "+locker.lockerId);
    }

    public void removePackage(Package pack){

        int lockerId = this.packageLockedId.get(pack.packageId);
        this.lockerService.removeFromLocker(pack.sizeEnum, lockerId);

        this.packageLockedId.remove(pack.packageId);
        System.out.println("Package with id " +
                pack.packageId + " was removed from locker "+ lockerId);
    }
}
