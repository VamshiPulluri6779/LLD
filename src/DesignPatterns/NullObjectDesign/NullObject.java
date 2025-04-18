package DesignPatterns.NullObjectDesign;

public class NullObject implements Vehicle{

    // putting a default behavior

    @Override
    public int getSeatingCapacity() {
        return 0;
    }

    @Override
    public int getFuelCapacity() {
        return 0;
    }
}
