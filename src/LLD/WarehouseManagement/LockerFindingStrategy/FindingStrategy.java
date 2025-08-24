package WarehouseManagement.LockerFindingStrategy;

import WarehouseManagement.Warehouse.Locker;

import java.util.Map;
import java.util.TreeMap;

public interface FindingStrategy {

    Map.Entry<Integer, Locker> findLocker(TreeMap<Integer, Locker> map);
}
