package WarehouseManagement.LockerFindingStrategy;

import WarehouseManagement.Warehouse.Locker;

import java.util.Map;
import java.util.TreeMap;

public class RandomStrategy implements FindingStrategy{

    @Override
    public Map.Entry<Integer, Locker> findLocker(TreeMap<Integer, Locker> map) {
        return map.lastEntry();
    }
}
