package BatteryChargingLLD.BatteryStrategy;

public class BatteryStrategy implements DeviceStrategy{

    @Override
    public void showBattery(int val) {
        System.out.println("Battery percentage is " + val);
    }

    @Override
    public int chargeDevice(int val) {
        val = val + 5;
        System.out.println("Charging and the battery percentage is " + val);
        return val;
    }
}
