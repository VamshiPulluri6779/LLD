package WarehouseManagement.Warehouse;

public class Locker {

    int lockerId;
    SizeEnum sizeEnum;
    boolean isAvailable;
    Package aPackage;

    public Locker(int lockerId, SizeEnum sizeEnum) {
        this.lockerId = lockerId;
        this.sizeEnum = sizeEnum;
        this.isAvailable = true;
    }

    public int getLockerId() {
        return lockerId;
    }

    public void setLockerId(int lockerId) {
        this.lockerId = lockerId;
    }

    public SizeEnum getSizeEnum() {
        return sizeEnum;
    }

    public void setSizeEnum(SizeEnum sizeEnum) {
        this.sizeEnum = sizeEnum;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Package getaPackage() {
        return aPackage;
    }

    public void setaPackage(Package aPackage) {
        this.aPackage = aPackage;
    }
}
