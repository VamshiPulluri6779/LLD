package DesignPatterns.AdapterDesign.Client;

import DesignPatterns.AdapterDesign.Adapter.Adapter;
import DesignPatterns.AdapterDesign.Adapter.AdapterImpl;
import DesignPatterns.AdapterDesign.ExistingLogic.WeighingMachine;
import DesignPatterns.AdapterDesign.ExistingLogic.WeightMachineImpl;

public class Main {
    public static void main(String[] args) {

        WeighingMachine weighingMachine = new WeightMachineImpl(150);

        Adapter adapter = new AdapterImpl(weighingMachine);

        System.out.println("The weight in kgs is: "+adapter.getWeightInKilograms());
    }
}
