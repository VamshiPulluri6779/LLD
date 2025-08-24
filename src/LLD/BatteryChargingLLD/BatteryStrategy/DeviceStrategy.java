package BatteryChargingLLD.BatteryStrategy;

public interface DeviceStrategy {

    default void showBattery(int val){
        System.out.println("No battery available");
    }

    default int chargeDevice(int val){
        System.out.println("Charging and no battery available");
        return 0;
    }
}
