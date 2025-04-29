package DesignPatterns.AdapterDesign.Adapter;

import DesignPatterns.AdapterDesign.ExistingLogic.WeighingMachine;

public class AdapterImpl implements Adapter{

    WeighingMachine weighingMachine;

    public AdapterImpl(WeighingMachine weighingMachine){
        this.weighingMachine = weighingMachine;
    }

    public double getWeightInKilograms(){
        return weighingMachine.getWeightInPounds() * 0.453592;
    }
}
