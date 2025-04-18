package DesignPatterns.NullObjectDesign;

public class Car implements Vehicle {


    @Override
    public int getSeatingCapacity() {
        return 4;
    }

    @Override
    public int getFuelCapacity() {
        return 50;
    }
}
