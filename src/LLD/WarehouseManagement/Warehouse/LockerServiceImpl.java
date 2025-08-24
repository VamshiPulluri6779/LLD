package WarehouseManagement.Warehouse;

import WarehouseManagement.LockerFindingStrategy.StrategyEnum;

public class LockerServiceImpl {
    public static void main(String[] args) {

        LockerService lockerService = new LockerService();

//        lockerService.createLocker(5, SizeEnum.S);
        lockerService.createLocker(1, SizeEnum.S);
        lockerService.createLocker(2, SizeEnum.S);
        lockerService.createLocker(3, SizeEnum.S);
        lockerService.createLocker(4, SizeEnum.S);
        lockerService.createLocker(6, SizeEnum.M);
        lockerService.createLocker(7, SizeEnum.L);
        lockerService.createLocker(8, SizeEnum.XL);

        Warehouse warehouse = new Warehouse("Amazon warehouse 1", lockerService);

        Package pack = new Package(1, SizeEnum.S, "small package");
        warehouse.addPackage(pack, StrategyEnum.NEAREST_TO_ENTRANCE);

        Package pack2 = new Package(2, SizeEnum.S, "small package");
        warehouse.addPackage(pack2, StrategyEnum.NEAREST_TO_EXIT);

        warehouse.removePackage(pack);
    }
}
