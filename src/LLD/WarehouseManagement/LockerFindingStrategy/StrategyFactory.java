package WarehouseManagement.LockerFindingStrategy;

public class StrategyFactory {

    public static FindingStrategy getStrategyFactory(StrategyEnum strategyEnum){
        return switch (strategyEnum){
            case NEAREST_TO_ENTRANCE -> new NearestToEntrance();
            case NEAREST_TO_EXIT -> new NearestToExit();
            default -> new RandomStrategy();
        };
    }
}
