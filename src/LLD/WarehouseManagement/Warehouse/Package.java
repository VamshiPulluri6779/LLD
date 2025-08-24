package WarehouseManagement.Warehouse;

public class Package {

    int packageId;
    SizeEnum sizeEnum;
    String description;

    public Package(int packageId, SizeEnum sizeEnum, String description) {
        this.packageId = packageId;
        this.sizeEnum = sizeEnum;
        this.description = description;
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public SizeEnum getSizeEnum() {
        return sizeEnum;
    }

    public void setSizeEnum(SizeEnum sizeEnum) {
        this.sizeEnum = sizeEnum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
