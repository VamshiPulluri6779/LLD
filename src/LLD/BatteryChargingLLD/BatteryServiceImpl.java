package BatteryChargingLLD;

import BatteryChargingLLD.BatteryStrategy.BatteryStrategy;
import BatteryChargingLLD.BatteryStrategy.DeviceStrategy;
import BatteryChargingLLD.Device.AudioDevice;

public class BatteryServiceImpl {
    public static void main(String[] args) {

        DeviceStrategy batteryStrategy = new BatteryStrategy();
        AudioDevice audioDevice = new AudioDevice(batteryStrategy, 30);

        audioDevice.showBattery();
        audioDevice.chargeDevice();
        audioDevice.showBattery();
    }
}
