package DesignPatterns.AdapterDesign.ExistingLogic;

public class WeightMachineImpl implements WeighingMachine {

    double weight;

    public WeightMachineImpl(double weight){
        this.weight = weight;
    }

    @Override
    public double getWeightInPounds() {
        return weight;
    }
}
