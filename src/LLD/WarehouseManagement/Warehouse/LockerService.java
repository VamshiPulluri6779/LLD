package WarehouseManagement.Warehouse;

import WarehouseManagement.LockerFindingStrategy.FindingStrategy;
import WarehouseManagement.LockerFindingStrategy.StrategyEnum;
import WarehouseManagement.LockerFindingStrategy.StrategyFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LockerService {

    Map<Integer, Locker> occupiedLockers;
    Map<SizeEnum, TreeMap<Integer, Locker>> availableLockers;

    LockerService(){
        this.availableLockers = new HashMap<>();
        this.occupiedLockers = new HashMap<>();
    }

    public Map<SizeEnum, TreeMap<Integer, Locker>> getAvailableLockers() {
        return availableLockers;
    }

    public void setAvailableLockers(Map<SizeEnum, TreeMap<Integer, Locker>> availableLockers) {
        this.availableLockers = availableLockers;
    }

    public Map<Integer, Locker> getOccupiedLockers() {
        return occupiedLockers;
    }

    public void setOccupiedLockers(Map<Integer, Locker> occupiedLockers) {
        this.occupiedLockers = occupiedLockers;
    }

    public void createLocker(int id, SizeEnum sizeEnum){

        this.getAvailableLockers().computeIfAbsent(sizeEnum, k -> new TreeMap<>());

        Locker locker = new Locker(id, sizeEnum);
        this.getAvailableLockers().get(sizeEnum).put(id, locker);

        System.out.println("New locker created with id "+
                id + " and size "+sizeEnum.toString());
    }

    public void deleteLocker(int id, SizeEnum sizeEnum){
        this.getAvailableLockers().get(sizeEnum).remove(id);
    }

    public Locker getLocker(SizeEnum sizeEnum, StrategyEnum strategyEnum){

        FindingStrategy strategy = StrategyFactory.getStrategyFactory(strategyEnum);
        Map.Entry<Integer, Locker> lockerEntry = strategy.findLocker(this.getAvailableLockers().get(sizeEnum));
        this.getAvailableLockers().get(sizeEnum).remove(lockerEntry.getKey());

        Locker locker = lockerEntry.getValue();
        locker.setAvailable(false);

        this.occupiedLockers.put(locker.lockerId,locker);
        return locker;
    }

    public void removeFromLocker(SizeEnum sizeEnum, int lockerId){
        Locker locker = this.getOccupiedLockers().get(lockerId);
        locker.setaPackage(null);
        locker.setAvailable(true);

        this.occupiedLockers.remove(lockerId);
        this.getAvailableLockers().get(sizeEnum).put(lockerId, locker);
    }
}
