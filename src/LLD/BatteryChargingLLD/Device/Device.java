package BatteryChargingLLD.Device;

import BatteryChargingLLD.BatteryStrategy.DeviceStrategy;

public abstract class Device {


    DeviceStrategy deviceStrategy;
    int battery;

    public Device(DeviceStrategy deviceStrategy, int battery){
        this.deviceStrategy = deviceStrategy;
        this.battery = battery;
    }

    public void chargeDevice(){
        this.battery = this.deviceStrategy.chargeDevice(this.battery);
    }

    public void showBattery(){
        this.deviceStrategy.showBattery(this.battery);
    }
}
